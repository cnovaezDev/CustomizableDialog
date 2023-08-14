package cnovaez.dev.customizabledialog.presentation

import android.app.Dialog
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import cnovaez.dev.customizabledialog.R
import cnovaez.dev.customizabledialog.domain.interfaces.OnInteractionSelectedListener
import cnovaez.dev.customizabledialog.domain.model.CustomizableDialogItem

/**
 ** Created by Carlos A. Novaez Guerrero on 6/27/2023 9:47 AM
 ** cnovaez.dev@outlook.com
 **/
class CustomizableDialog : DialogFragment() {

    private lateinit var mView: View
    private lateinit var cancel: Button
    private lateinit var accept: Button
    private lateinit var title_tv: TextView
    private lateinit var content_tv: TextView
    private lateinit var generic_image_iv: ImageView
    private lateinit var color_layout_rl: LinearLayout

    private lateinit var item: CustomizableDialogItem
    private lateinit var mCallback: OnInteractionSelectedListener

    companion object {
        fun newInstance(
            data: CustomizableDialogItem
        ): CustomizableDialog {
            val fragment = CustomizableDialog()
            fragment.item = data
            return fragment
        }
    }

    fun setResponseCallback(mCallback: OnInteractionSelectedListener) {
        this.mCallback = mCallback
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        mView = requireActivity().layoutInflater.inflate(
            R.layout.custom_dialog_generic_information_layout,
            LinearLayout(activity),
            false
        )
        setUpViews()
        setUpData()
        val builder = Dialog(requireActivity())
        builder.setCancelable(false)
        builder.requestWindowFeature(Window.FEATURE_NO_TITLE)
        builder.setContentView(mView)
        return builder
    }

    private fun setUpData() {
        try {
            title_tv.text = item.title
            content_tv.text = item.content
            cancel.text = item.cancelBtnLabel
            accept.text = item.acceptBtnLabel

            cancel.backgroundTintList =
                ColorStateList.valueOf(
                    ContextCompat.getColor(
                        requireContext(),
                        item.cancelBtnCustomColor
                    )
                )
            accept.backgroundTintList =
                ColorStateList.valueOf(
                    ContextCompat.getColor(
                        requireContext(),
                        item.acceptBtnCustomColor
                    )
                )

            color_layout_rl.backgroundTintList =
                ColorStateList.valueOf(
                    ContextCompat.getColor(
                        requireContext(),
                        item.customCardHeaderBackgroundColor
                    )
                )

            title_tv.setTextColor(ContextCompat.getColor(requireContext(), item.titleTextColor))

            content_tv.setTextColor(ContextCompat.getColor(requireContext(), item.contentTextColor))

            if (item.customImage != -1) {
                generic_image_iv.setImageResource(item.customImage)
            } else {
                generic_image_iv.setImageResource(item.image.getDrawable())
            }

            if (item.twoButtons) {
                cancel.setOnClickListener {
                    closeDialog()
                    if (::mCallback.isInitialized)
                        mCallback.onCancel(item)
                }
            } else {
                cancel.visibility = View.GONE
            }
            accept.setOnClickListener {
                closeDialog()
                if (::mCallback.isInitialized)
                    mCallback.onAccept(item)
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
            Log.d("CustomizableDialog", "Error in setUpData: ${ex.message ?: "null"}")
        }
    }

    private fun closeDialog() {
        dialog?.dismiss()
    }


    private fun setUpViews() {
        cancel = mView.findViewById(R.id.cancel_btn)
        accept = mView.findViewById(R.id.acept_btn)
        title_tv = mView.findViewById(R.id.title_message_no_internet)
        content_tv = mView.findViewById(R.id.textview_main_text_cd1)
        generic_image_iv = mView.findViewById(R.id.generic_image_iv)
        color_layout_rl = mView.findViewById(R.id.color_layout)
    }


    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
            //Para agrandar el dialog
            dialog.window?.let { diag ->
                diag.setLayout(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
                diag.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            }
        }
    }


}
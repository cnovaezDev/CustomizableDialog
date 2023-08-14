package cnovaez.dev.customizabledialog.misc

import android.content.Context
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import cnovaez.dev.customizabledialog.domain.interfaces.OnInteractionSelectedListener
import cnovaez.dev.customizabledialog.domain.model.CustomizableDialogItem
import cnovaez.dev.customizabledialog.presentation.CustomizableDialog

/**
 ** Created by Carlos A. Novaez Guerrero on 8/11/2023 4:32 PM
 ** cnovaez.dev@outlook.com
 **/

fun Context.showGenericDialog(
    item: CustomizableDialogItem,
    listener: OnInteractionSelectedListener? = null
) {
    try {
        val fragmentManager = (this as AppCompatActivity).supportFragmentManager
        val dialog = CustomizableDialog.newInstance(item)
        listener?.let { dialog.setResponseCallback(it) }
        dialog.show(fragmentManager, "Generic Dialog")
    } catch (ex: Exception) {
        ex.printStackTrace()
        Log.e("Error showGenericDialog", ex.message ?: "null")
    }
}
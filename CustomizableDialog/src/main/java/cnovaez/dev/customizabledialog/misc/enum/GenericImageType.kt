package cnovaez.dev.customizabledialog.misc.enum

import cnovaez.dev.customizabledialog.R

/**
 ** Created by Carlos A. Novaez Guerrero on 8/11/2023 11:32 AM
 ** cnovaez.dev@outlook.com
 **/
enum class GenericImageType {
    question_pic, select_location_pic, info_pic, warning_pic, error_pic;

    fun getDrawable(): Int {
        return when (this) {
            question_pic -> R.drawable.question_pic
            select_location_pic -> R.drawable.ic_select_location_pic
            info_pic -> R.drawable.ic_info_pic_v1
            warning_pic -> R.drawable.ic_warning_bg
            error_pic -> R.drawable.ic_error_bg
        }
    }
}
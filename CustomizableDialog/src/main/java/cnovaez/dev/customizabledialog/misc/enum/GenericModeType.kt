package cnovaez.dev.customizabledialog.misc.enum

import cnovaez.dev.customizabledialog.R

/**
 ** Created by Carlos A. Novaez Guerrero on 8/14/2023 12:27 PM
 ** cnovaez.dev@outlook.com
 **/
enum class GenericModeType {
    info_type, warning_type, error_type, question_type;

    fun toCardHeaderColor(): Int {
        return when (this) {
            info_type -> R.color.primaryDefColor
            warning_type -> R.color.primaryDefColorWarning
            error_type -> R.color.primaryDefColorError
            question_type -> R.color.primaryDefColor
        }
    }

    fun toAcceptBtnColor(): Int {
        return when (this) {
            info_type -> R.color.primaryDefColor
            warning_type -> R.color.primaryDefColorWarning
            error_type -> R.color.primaryDefColorGreen
            question_type -> R.color.primaryDefColor
        }
    }

    fun toCancelBtnColor(): Int {
        return when (this) {
            info_type -> R.color.primaryDefColorRed
            warning_type -> R.color.primaryDefColorRed
            error_type -> R.color.primaryDefColorRed
            question_type -> R.color.primaryDefColorRed
        }
    }

    fun toImageMode(): GenericImageType {
        return when (this) {
            info_type -> GenericImageType.info_pic
            warning_type -> GenericImageType.warning_pic
            error_type -> GenericImageType.error_pic
            question_type -> GenericImageType.question_pic
        }
    }


}
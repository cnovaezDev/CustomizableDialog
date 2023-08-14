package cnovaez.dev.customizabledialog.domain.model

import cnovaez.dev.customizabledialog.R
import cnovaez.dev.customizabledialog.misc.enum.GenericImageType
import cnovaez.dev.customizabledialog.misc.enum.GenericModeType


/**
 ** Created by Carlos A. Novaez Guerrero on 8/11/2023 10:40 AM
 ** cnovaez.dev@outlook.com
 **/
data class CustomizableDialogItem(
    var title: String = "Information",
    var content: String = "",
    var cancelBtnLabel: String = "Cancelar",
    var acceptBtnLabel: String = "Aceptar",
    var selectedMode: GenericModeType = GenericModeType.info_type,
    var image: GenericImageType = selectedMode.toImageMode(),
    var twoButtons: Boolean = true,
    var customImage: Int = -1,
    var customCardHeaderBackgroundColor: Int = selectedMode.toCardHeaderColor(),
    var acceptBtnCustomColor: Int = selectedMode.toAcceptBtnColor(),
    var cancelBtnCustomColor: Int = selectedMode.toCancelBtnColor(),
    var titleTextColor: Int = R.color.whiteDefColor,
    var contentTextColor: Int = R.color.blackDefColor,
)
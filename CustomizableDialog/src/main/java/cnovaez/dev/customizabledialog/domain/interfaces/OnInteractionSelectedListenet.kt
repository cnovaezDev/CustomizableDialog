package cnovaez.dev.customizabledialog.domain.interfaces

/**
 ** Created by Carlos A. Novaez Guerrero on 5/31/2023 6:13 PM
 ** cnovaez.dev@outlook.com
 **/
interface OnInteractionSelectedListener {

    fun onAccept(result: Any? = null)
    fun onCancel(result: Any? = null)
}
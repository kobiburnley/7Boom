package nice.com.a7boom

import android.content.Context
import vm.vdom.android.AndroidRenderer

class ABoom(val context: Context) : IBoom {
    override val androidRendered: AndroidRenderer = AndroidRenderer(context)

    companion object {
        lateinit var boom: IBoom
        fun init(context: Context) {
            boom = ABoom(context.applicationContext)
        }
    }
}
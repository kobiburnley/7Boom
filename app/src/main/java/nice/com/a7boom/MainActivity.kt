package nice.com.a7boom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import vm.counter.Counter
import vm.counter.FlatList
import vm.counter.FlatListProps
import vm.vdom.Platform
import vm.vdom.android.AndroidRenderer
import vm.vnode.h

class MainActivity : AppCompatActivity() {
    lateinit var androidRenderer: AndroidRenderer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ABoom.init(this)
        Platform.platform = Platform.ANDROID
        androidRenderer = ABoom.boom.androidRendered
        setContentView(androidRenderer.renderComponent(
                FlatList(),
                FlatListProps(
                        length = 30,
                        onRenderRow = { viewType ->
                            h(::Counter)
                        },
                        onUpdateRow = { view, position -> }
                )
        ))
    }
}

package nice.com.a7boom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import vm.vdom.Platform
import vm.vdom.android.AndroidRenderer

class MainActivity : AppCompatActivity() {
    lateinit var androidRenderer: AndroidRenderer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ABoom.init(this)
        Platform.platform = Platform.ANDROID
        androidRenderer = ABoom.boom.androidRendered
        setContentView(androidRenderer.renderComponent(::MainComponent, null))
    }
}

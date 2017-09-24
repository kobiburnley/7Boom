package nice.com.a7boom

import vm.component.Component
import vm.counter.FlatList
import vm.counter.FlatListProps
import vm.vnode.VNode
import vm.vnode.h
import vm.counter.Counter

class MainComponent : Component<Any?, Any?>(null) {
    override var props: Any? = null

    override fun render() = h(::FlatList, FlatListProps(
            length = 30,
            onRenderRow = { _ ->
                h(::Counter)
            },
            onUpdateRow = { view, position -> }
    ))
}
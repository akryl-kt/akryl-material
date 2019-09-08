package showcase

import io.akryl.Component
import io.akryl.html.Text
import io.akryl.react.ReactNode
import io.akryl.render
import kotlin.browser.document

class Application : Component() {
    override fun render() = Text("Hello, World!")
}

fun main() {
    render(Application(), document.getElementById("app")!!)
}
package showcase

import io.akryl.Component
import io.akryl.render
import io.akryl.router.BrowserRouter
import io.akryl.router.Route
import kotlin.browser.document

class Application : Component() {
  override fun render() = BrowserRouter(
    Route(exact = true, path = "/", component = ::RootPage),
    Route(path = "/buttons", component = ::ButtonsPage)
  )
}

fun main() {
  render(Application(), document.getElementById("app")!!)
}
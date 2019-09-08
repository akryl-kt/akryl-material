package showcase

import io.akryl.Component
import io.akryl.html.Div
import io.akryl.router.Link

class RootPage : Component() {
  override fun render() = Div(
    Link(to = "/buttons", text = "Buttons")
  )
}
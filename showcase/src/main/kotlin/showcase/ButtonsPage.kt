package showcase

import io.akryl.Component
import io.akryl.css.css
import io.akryl.css.px
import io.akryl.html.Div
import io.akryl.html.Input
import io.akryl.html.Label
import io.akryl.html.Text
import io.akryl.material.Button
import io.akryl.material.ButtonColor
import io.akryl.material.ButtonVariant

private val root by css {
  textAlign.center()
  marginBottom(16.px)

  each(button, a, label) {
    margin(8.px)
  }
}

private val upload by css {
  display.none()
}

class ButtonsPage : Component() {
  override fun render() = Div(
    contained(),
    text(),
    outlined()
  )

  private fun contained() = Div(clazz = root, children = listOf(
    Button(
      variant = ButtonVariant.CONTAINED,
      children = listOf(Text("DEFAULT"))
    ),
    Button(
      variant = ButtonVariant.CONTAINED,
      color = ButtonColor.PRIMARY,
      children = listOf(Text("PRIMARY"))
    ),
    Button(
      variant = ButtonVariant.CONTAINED,
      color = ButtonColor.SECONDARY,
      children = listOf(Text("SECONDARY"))
    ),
    Button(
      variant = ButtonVariant.CONTAINED,
      color = ButtonColor.SECONDARY,
      disabled = true,
      children = listOf(Text("DISABLED"))
    ),
    Button(
      variant = ButtonVariant.CONTAINED,
      href = "#contained-buttons",
      children = listOf(Text("LINK"))
    ),
    Input(
      accept = "image/*",
      clazz = upload,
      id = "contained-button-file",
      multiple = "",
      type = "file"
    ),
    Label(`for` = "contained-button-file", children = listOf(
      Button(
        variant = ButtonVariant.CONTAINED,
        component = "span",
        children = listOf(Text("UPLOAD"))
      )
    ))
  ))

  private fun text() = Div(clazz = root, children = listOf(
    Button(
      variant = ButtonVariant.TEXT,
      children = listOf(Text("DEFAULT"))
    ),
    Button(
      variant = ButtonVariant.TEXT,
      color = ButtonColor.PRIMARY,
      children = listOf(Text("PRIMARY"))
    ),
    Button(
      variant = ButtonVariant.TEXT,
      color = ButtonColor.SECONDARY,
      children = listOf(Text("SECONDARY"))
    ),
    Button(
      variant = ButtonVariant.TEXT,
      color = ButtonColor.SECONDARY,
      disabled = true,
      children = listOf(Text("DISABLED"))
    ),
    Button(
      variant = ButtonVariant.TEXT,
      href = "#contained-buttons",
      children = listOf(Text("LINK"))
    ),
    Input(
      accept = "image/*",
      clazz = upload,
      id = "contained-button-file",
      multiple = "",
      type = "file"
    ),
    Label(`for` = "contained-button-file", children = listOf(
      Button(
        variant = ButtonVariant.TEXT,
        component = "span",
        children = listOf(Text("UPLOAD"))
      )
    ))
  ))

  private fun outlined() = Div(clazz = root, children = listOf(
    Button(
      variant = ButtonVariant.OUTLINED,
      children = listOf(Text("DEFAULT"))
    ),
    Button(
      variant = ButtonVariant.OUTLINED,
      color = ButtonColor.PRIMARY,
      children = listOf(Text("PRIMARY"))
    ),
    Button(
      variant = ButtonVariant.OUTLINED,
      color = ButtonColor.SECONDARY,
      children = listOf(Text("SECONDARY"))
    ),
    Button(
      variant = ButtonVariant.OUTLINED,
      color = ButtonColor.SECONDARY,
      disabled = true,
      children = listOf(Text("DISABLED"))
    ),
    Button(
      variant = ButtonVariant.OUTLINED,
      href = "#contained-buttons",
      children = listOf(Text("LINK"))
    ),
    Input(
      accept = "image/*",
      clazz = upload,
      id = "contained-button-file",
      multiple = "",
      type = "file"
    ),
    Label(`for` = "contained-button-file", children = listOf(
      Button(
        variant = ButtonVariant.OUTLINED,
        component = "span",
        children = listOf(Text("UPLOAD"))
      )
    ))
  ))
}
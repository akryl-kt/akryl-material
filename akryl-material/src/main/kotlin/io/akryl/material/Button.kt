@file:Suppress("FunctionName", "UnsafeCastFromDynamic", "unused")

package io.akryl.material

import io.akryl.material.utils.MaterialUI
import io.akryl.material.utils.build
import io.akryl.material.utils.jsName
import io.akryl.material.utils.props
import io.akryl.react.ReactNode
import io.akryl.react.createElement

enum class ButtonColor {
  DEFAULT,
  INHERIT,
  PRIMARY,
  SECONDARY,
}

enum class ButtonSize {
  SMALL,
  MEDIUM,
  LARGE,
}

enum class ButtonVariant {
  TEXT,
  OUTLINED,
  CONTAINED,
}

fun Button(
  children: List<ReactNode>,
  classes: dynamic = undefined,
  color: ButtonColor? = undefined,
  component: dynamic = undefined,
  disabled: Boolean? = undefined,
  disableFocusRipple: Boolean? = undefined,
  disableRipple: Boolean? = undefined,
  fullWidth: Boolean? = undefined,
  href: String? = undefined,
  size: ButtonSize? = undefined,
  variant: ButtonVariant? = undefined
): ReactNode {
  return createElement(
    MaterialUI.Button,
    props(
      "classes" to classes,
      "color" to color?.jsName(),
      "component" to component,
      "disabled" to disabled,
      "disableFocusRipple" to disableFocusRipple,
      "disableRipple" to disableRipple,
      "fullWidth" to fullWidth,
      "href" to href,
      "size" to size?.jsName(),
      "variant" to variant?.jsName()
    ),
    *children.build()
  )
}
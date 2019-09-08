package io.akryl.material.utils

import io.akryl.Component
import io.akryl.react.ReactNode
import kotlin.js.json

internal fun List<ReactNode>.build() = this.map { Component.build(it) }.toTypedArray()
internal fun Enum<*>.jsName() = this.name.toLowerCase()
internal fun props(vararg pairs: Pair<String, Any?>) = json(*pairs.filter { it.second != null }.toTypedArray())
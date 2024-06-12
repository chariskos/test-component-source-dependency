@file:Suppress("ktlint:standard:filename")

package se.caspeco.casperui.util

import androidx.compose.ui.graphics.Color
import kotlin.math.roundToInt

fun Color.isLight(): Boolean {
    val median = (red + green + blue) / 3
    return median > 0.5f
}

fun Color.hex(): String {
    val alpha = this.alpha
    val red = (this.red * 255).toInt()
    val green = (this.green * 255).toInt()
    val blue = (this.blue * 255).toInt()

    val rgb = String.format("#%02x%02x%02x", red, green, blue)
    return if (alpha < 1F) "$rgb (${(alpha * 100).roundToInt()}%)" else rgb
}

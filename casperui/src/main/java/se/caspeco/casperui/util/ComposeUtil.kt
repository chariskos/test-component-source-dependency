package se.caspeco.casperui.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalInspectionMode

fun Color.disabled() = this.copy(alpha = 0.48F)

@Composable
fun isPreview(): Boolean = LocalInspectionMode.current

package se.caspeco.casperui.util.modifierExt

import androidx.compose.ui.Modifier

/**
 * Applies the modifier provided if the predicate is true, uses Modifier.then()
 * Example: Modifier.thenIf(enabled) { clickable(onClick = parentOnClick) }
 */
inline fun Modifier.thenIf(predicate: Boolean, block: Modifier.() -> Modifier) = when (predicate) {
    true -> then(block.invoke(this))
    false -> this
}

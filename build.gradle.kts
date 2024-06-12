// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlinKapt) apply false
    alias(libs.plugins.ktlint)
    alias(libs.plugins.compose.compiler)
}

allprojects {
    group = "org.gradle.casperui"
    version = "1.0"

    apply(plugin = "org.jlleitschuh.gradle.ktlint")
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")
}

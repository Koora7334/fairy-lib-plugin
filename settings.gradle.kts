pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://repo.imanity.dev/imanity-libraries")
    }

    val version: String by settings

    plugins {
        id("io.fairyproject") version version
    }
}

rootProject.name = "fairy-lib-plugin"


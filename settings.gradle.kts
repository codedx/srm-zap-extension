pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("log4j", "2.24.2")
            library("log4j-core", "org.apache.logging.log4j", "log4j-core").versionRef("log4j")
            library("log4j-slf4j", "org.apache.logging.log4j", "log4j-slf4j-impl").versionRef("log4j")
            library("log4j-slf4j2", "org.apache.logging.log4j", "log4j-slf4j2-impl").versionRef("log4j")
        }
    }
}
plugins {
    id("org.zaproxy.common.settings") version "0.5.0"
    id("com.diffplug.spotless") version "6.25.0" apply false
}

rootProject.name = "addon-java"

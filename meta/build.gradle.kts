import java.util.Properties

plugins {
    kotlin("jvm") version "1.3.60" apply false
    kotlin("plugin.serialization") version "1.3.60" apply false
}

fun loadProperties(fileName: String) =
    Properties()
        .also { props ->
            file("$rootDir/../$fileName").inputStream().use {
                props.load(it)
            }
        }
        .forEach { name, value -> rootProject.extra[name as String] = value }

loadProperties("gradle.properties")
loadProperties("local.properties")

subprojects {
    repositories {
        mavenLocal()
        maven(url = "https://dl.bintray.com/inkremental/maven")
        google()
        jcenter()
    }

    val GROUP: String by project
    val VERSION_NAME: String by project

    group = GROUP
    version = VERSION_NAME
}

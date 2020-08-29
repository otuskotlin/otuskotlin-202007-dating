plugins {
    kotlin("js") apply false
    kotlin("jvm") apply false
    kotlin("multiplatform") apply false
    kotlin("plugin.serialization") apply false
}

group = "ru.otus.otuskotlin.dating"
version = "0.0.1"

subprojects {
    repositories {
        mavenCentral()
        jcenter()
    }
}

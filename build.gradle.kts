buildscript {

    dependencies {
        classpath(Plugins.dagger_hilt)
    }
}
plugins {
    id(Plugins.android_application) version Plugins.android_application_version apply false
    id(Plugins.android_library) version Plugins.android_application_version apply false
    id(Plugins.jetbrains_kotlin_android) version Plugins.jetbrains_kotlin_android_version apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.retrofit() {
    add("implementation", Dependencies.Retrofit.retrofit)
    add("implementation", Dependencies.Retrofit.okhttp)
    add("implementation", Dependencies.Retrofit.gson_converter)
    add("implementation", Dependencies.Retrofit.logging_interceptor)
}

fun DependencyHandler.chucker() {
    add("debugImplementation", Dependencies.Chucker.chucker)
    add("releaseImplementation", Dependencies.Chucker.chucker_no_op)
}

fun DependencyHandler.imageLoaders() {
    add("implementation", Dependencies.Coil.coil)
}

fun DependencyHandler.coroutines() {
    add("implementation", Dependencies.Coroutines.coroutines_core)
    add("implementation", Dependencies.Coroutines.coroutines_android)
}

fun DependencyHandler.daggerHilt() {
    add("implementation", Dependencies.DaggerHilt.dagger_hilt)
    add("implementation", Dependencies.DaggerHilt.dagger_hilt_navigation)
}

fun DependencyHandler.lifecycle() {
    add("implementation", Dependencies.Lifecycle.lifecycle_runtime_ktx)
    add("implementation", Dependencies.Lifecycle.lifecycle_viewmodel_ktx)
}
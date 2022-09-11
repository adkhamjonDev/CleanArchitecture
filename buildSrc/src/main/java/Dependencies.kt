object Dependencies {

    object Core {
        const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx_version}"
    }

    object Compose {
        const val compose_ui = "androidx.compose.ui:ui:${Versions.compose_version}"
        const val compose_material =
            "androidx.compose.material:material:${Versions.compose_version}"
        const val compose_ui_tooling_preview =
            "androidx.compose.ui:ui-tooling-preview:${Versions.compose_version}"
        const val compose_activity =
            "androidx.activity:activity-compose:${Versions.compose_activity_version}"
        const val compose_ui_test_junit4 =
            "androidx.compose.ui:ui-test-junit4:${Versions.compose_version}"
        const val compose_ui_tooling = "androidx.compose.ui:ui-tooling:${Versions.compose_version}"
        const val compose_ui_test_manifest =
            "androidx.compose.ui:ui-test-manifest:${Versions.compose_version}"
    }

    object Lifecycle {
        const val lifecycle_runtime_ktx =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_runtime_ktx_version}"
        const val lifecycle_viewmodel_ktx =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_runtime_ktx_version}"

    }

    object Test {
        const val junit = "junit:junit:${Versions.junit_version}"
        const val ext_junit = "androidx.test.ext:junit:${Versions.ext_junit_version}"
        const val espresso_core =
            "androidx.test.espresso:espresso-core:${Versions.espresso_core_version}"

    }

    object DaggerHilt {
        const val dagger_hilt = "com.google.dagger:hilt-android:${Versions.dagger_hilt}"
        const val dagger_hilt_android_compiler =
            "com.google.dagger:hilt-android-compiler:${Versions.dagger_hilt}"
        const val dagger_hilt_viewmodel =
            "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hilt_lifecycle_viewmodel}"
        const val dagger_hilt_compiler = "androidx.hilt:hilt-compiler:${Versions.hilt_compiler}"
        const val dagger_hilt_navigation =
            "androidx.hilt:hilt-navigation-compose:${Versions.hilt_navigation_compose}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gson_converter =
            "com.squareup.retrofit2:converter-gson:${Versions.gson_converter}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val logging_interceptor =
            "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor}"
    }

    object Coroutines {
        const val coroutines_core =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines_core}"
        const val coroutines_android =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines_android}"
    }

    object Coil {
        const val coil = "io.coil-kt:coil-compose:${Versions.coil}"
    }

    object Chucker {
        const val chucker = "com.github.chuckerteam.chucker:library:${Versions.chucker}"
        const val chucker_no_op = "com.github.chuckerteam.chucker:library:${Versions.chucker_no_op}"
    }
}
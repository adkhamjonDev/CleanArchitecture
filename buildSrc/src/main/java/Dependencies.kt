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
        const val dagger_hilt_viewmodel = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
        const val dagger_hilt_compiler = "androidx.hilt:hilt-compiler:1.0.0"
        const val dagger_hilt_navigation = "androidx.hilt:hilt-navigation-compose:1.0.0"
    }
}
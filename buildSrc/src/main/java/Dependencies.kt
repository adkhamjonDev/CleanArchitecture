object Dependencies {

    object Core {
        private const val core_ktx_version = "1.9.0"
        const val core_ktx = "androidx.core:core-ktx:$core_ktx_version"
    }

    object Compose {
        const val compose_version = "1.1.0-beta01"
        private const val compose_activity_version = "1.5.1"

        const val compose_ui = "androidx.compose.ui:ui:$compose_version"
        const val compose_material = "androidx.compose.material:material:$compose_version"
        const val compose_ui_tooling_preview =
            "androidx.compose.ui:ui-tooling-preview:$compose_version"
        const val compose_activity = "androidx.activity:activity-compose:$compose_activity_version"
        const val compose_ui_test_junit4 = "androidx.compose.ui:ui-test-junit4:$compose_version"
        const val compose_ui_tooling = "androidx.compose.ui:ui-tooling:$compose_version"
        const val compose_ui_test_manifest = "androidx.compose.ui:ui-test-manifest:$compose_version"
    }

    object Lifecycle {
        private const val lifecycle_runtime_ktx_version = "2.5.1"
        const val lifecycle_runtime_ktx =
            "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_runtime_ktx_version"
    }

    object Test {
        private const val junit_version = "4.13.2"
        private const val ext_junit_version = "1.1.3"
        private const val espresso_core_version = "3.4.0"
        const val junit = "junit:junit:$junit_version"
        const val ext_junit = "androidx.test.ext:junit:$ext_junit_version"
        const val espresso_core = "androidx.test.espresso:espresso-core:$espresso_core_version"
    }
}
plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
    kotlin("android")
}
android {
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose_version
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependencies.Core.core_ktx)
    implementation(Dependencies.Compose.compose_ui)
    implementation(Dependencies.Compose.compose_material)
    implementation(Dependencies.Compose.compose_ui_tooling_preview)
    implementation(Dependencies.Lifecycle.lifecycle_runtime_ktx)
    implementation(Dependencies.Compose.compose_activity)
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.ext_junit)
    androidTestImplementation(Dependencies.Test.espresso_core)
    androidTestImplementation(Dependencies.Compose.compose_ui_test_junit4)
    debugImplementation(Dependencies.Compose.compose_ui_tooling)
    debugImplementation(Dependencies.Compose.compose_ui_test_manifest)

    //Dagger Hilt
    implementation(Dependencies.DaggerHilt.dagger_hilt)
    kapt(Dependencies.DaggerHilt.dagger_hilt_android_compiler)
    implementation(Dependencies.DaggerHilt.dagger_hilt_viewmodel)
    kapt(Dependencies.DaggerHilt.dagger_hilt_compiler)
    implementation(Dependencies.DaggerHilt.dagger_hilt_navigation)

}
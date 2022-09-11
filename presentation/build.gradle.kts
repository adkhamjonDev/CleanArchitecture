plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "uz.adkhamjondev.cleanarchitecture"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

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
        kotlinCompilerExtensionVersion = Dependencies.Compose.compose_version
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
}
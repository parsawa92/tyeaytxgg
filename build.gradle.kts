plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.chaquo.python")
}
android {
    namespace = "com.bale.studio"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.bale.studio"
        minSdk = 24
        targetSdk = 35
        versionCode = 3
        versionName = "3.0"
    }
}
chaquopy {
    defaultConfig {
        version = "3.11"
        pip {
            install("requests")
        }
    }
}
dependencies {
    implementation("androidx.core:core-ktx:1.16.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
}

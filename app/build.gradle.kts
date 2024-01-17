plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.medicalappui"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.medicalappui"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }

}

dependencies {
        //RecyclerView
        implementation("androidx.recyclerview:recyclerview:1.3.2")
        // For control over item selection of both touch and mouse driven selection
        implementation("androidx.recyclerview:recyclerview-selection:1.1.0")
        //CardView
        implementation("androidx.cardview:cardview:1.0.0")
        //MyFriend Glide
        implementation ("com.github.bumptech.glide:glide:4.16.0")





    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment:2.7.6")
    implementation("androidx.navigation:navigation-ui:2.7.6")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
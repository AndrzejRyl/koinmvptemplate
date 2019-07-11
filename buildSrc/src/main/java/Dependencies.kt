object Versions {
  const val compileSdk = 29
  const val buildTools = "29.0.0"
  const val minSdk = 21
  const val targetSdk = 29

  // Main dependencies
  const val gradle = "3.4.2"
  const val kotlin = "1.3.41"
  const val gradleVersionsPlugin = "0.21.0"

  // Plugins
  const val googleServices = "4.2.0"

  // Test dependencies
  const val junit = "4.12"
  const val mockito = "3.0.0"
  const val kotlinMockito = "2.0.0-alpha03"
  const val androidTestSupport = "1.1.0"
  const val leakCanary = "1.6.3"
  const val espresso = "3.1.0"

  // UI dependencies
  const val constraintLayout = "1.1.3"
  const val support = "1.0.0"

  // Main libraries dependencies
  const val fabric = "1.+"
  const val room = "2.1.0"
  const val rxJava = "2.2.10"
  const val rxAndroid = "2.1.1"
  const val koin = "2.0.1"
  const val retrofit = "2.6.0"
  const val okHttp = "4.0.1"
  const val crashlytics = "2.10.1@aar"
  const val firebase = "17.0.0"

  // Others
  const val glide = "4.9.0"
  const val ktlint = "0.33.0"
}

object CustomRepositories {
  const val google = "https://dl.google.com/dl/android/maven2/"
  const val jcenter = "https://jcenter.bintray.com/"
  const val fabric = "https://maven.fabric.io/public"
}

object ClassPaths {
  const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradle}"
  const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  const val gradleVersionsPlugin = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleVersionsPlugin}"
  const val googleServices = "com.google.gms:google-services:${Versions.googleServices}"
  const val kotlinExtensions = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"
  const val fabric = "io.fabric.tools:gradle:${Versions.fabric}"
}

object Libs {
  // Main
  const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"

  // Main libraries
  const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
  const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"

  const val koin = "org.koin:koin-android:${Versions.koin}"

  const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
  const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
  const val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
  const val retrofitConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
  const val retrofitScalarConverter = "com.squareup.retrofit2:converter-scalars:${Versions.retrofit}"

  const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
  const val room = "androidx.room:room-runtime:${Versions.room}"
  const val roomRxJava = "androidx.room:room-rxjava2:${Versions.room}"

  const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}"
  const val firebase = "com.google.firebase:firebase-core:${Versions.firebase}"

  // Others
  const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
  const val ktlint = "com.github.shyiko:ktlint:${Versions.ktlint}"
}

object UILibs {
  const val supportAppcompat = "androidx.appcompat:appcompat:${Versions.support}"
  const val supportRecycler = "com.android.support:recyclerview-v7:${Versions.support}"
  const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

  const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
  const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
  const val glideAnnotations = "com.github.bumptech.glide:compiler:${Versions.glide}"
}

object TestLibs {
  const val junit = "junit:junit:${Versions.junit}"
  const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
  const val kotlinMockito = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.kotlinMockito}"

  const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
  const val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
  const val espressoIdlingResource = "androidx.test.espresso:espresso-idling-resource:${Versions.espresso}"
  const val testRunner = "androidx.test:runner:${Versions.androidTestSupport}"

  const val koin = "org.koin:koin-test:${Versions.koin}"
  const val room = "androidx.room:room-testing:${Versions.room}"
}

# Countries App 2023

This project utilizes the MVVM architecture during development. 

Although the application is simple, it incorporates various Kotlin structures. 
UI elements are connected with 'View Binding'. Data is listed in a Recycler View. A structure has been created where data retrieved from the Remote API with Retrofit is stored in the local repository using Room database and Shared Preferences. GSON structure is employed. Asynchronous operations are performed with RxJava. Glide is used for images. Page navigation and data transfer between pages are implemented with the Navigation library.

#### Used library:

implementation "android.arch.lifecycle:extensions:$lifeCycleExtensionVersion"

implementation "androidx.room:room-runtime:$roomVersion"

implementation "androidx.legacy:legacy-support-v4:1.0.0"

kapt "androidx.room:room-compiler:$roomVersion"

implementation "androidx.room:room-ktx:$roomVersion"

implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1"

implementation "androidx.navigation:navigation-fragment-ktx:$navVersion"

implementation "androidx.navigation:navigation-ui-ktx:$navVersion"

implementation "com.google.android.material:material:1.10.0"

implementation "com.squareup.retrofit2:retrofit:$retrofitVersion"

implementation "com.squareup.retrofit2:converter-gson:$retrofitVersion"

implementation "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"

implementation "io.reactivex.rxjava2:rxjava:2.2.21"

implementation "io.reactivex.rxjava2:rxandroid:$rxJavaVersion"

implementation "com.github.bumptech.glide:glide:$glideVersion"

implementation "com.android.support:palette-v7:$supportVersion"

implementation "com.android.support:design:$supportVersion"

implementation "androidx.preference:preference:$preferencesVersion
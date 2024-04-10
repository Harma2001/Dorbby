# Dorbby

This project is a movie app built using MVVM architecture and Jetpack Compose. It retrieves movie data from an API and displays it in a grid layout using LazyVerticalGrid. For image loading, AsyncImages is used instead of traditional libraries like Picasso or Glide for faster and safer loading. This project aims for efficiency and modern development practices.

Clone the Repository:
Clone the repository from GitHub using the following command:

bash


Copy code

git clone https://github.com/Harma2001/Dorbby.git


Open Project in Android Studio:

Open Android Studio and select "Open an Existing Project." Navigate to the directory where you cloned the repository and select the project.

Sync Gradle Files:
Once the project is loaded, allow Android Studio to sync the Gradle files. This process may take a few moments.

Build and Run:
Build and run the application on an emulator or physical device by clicking the "Run" button in Android Studio.

Explore the App:
Once the app runs, explore its features to view a list of movies, and details about each movie.

Make sure to have the following dependencies added to your build.gradle file:

gradle

Copy code

// retrofit
implementation("com.squareup.retrofit2:retrofit:2.9.0")

implementation("com.squareup.retrofit2:converter-gson:2.9.0")

// coil

implementation("io.coil-kt:coil-compose:2.4.0")

implementation("com.google.accompanist:accompanist-coil:0.10.0")

// viewModel

implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")

// navigation

implementation("androidx.navigation:navigation-compose:2.7.7")

## Currency Converter App - A Kotlin Multiplatform Application

**Features:**

- Convert between various currencies
- View the latest exchange rates
- Available on both Android and iOS

**Technologies:**

- **Kotlin Multiplatform Mobile (KMM):** Enables code sharing between Android and iOS platforms.
- **Compose Multiplatform:** Provides a declarative UI framework for building user interfaces across platforms.

**Getting Started:**

1. **Prerequisites:**
  - Android Studio with the Kotlin plugin installed
  - Xcode with Swift support

2. **Clone the repository:**
    ```bash
    git clone [https://github.com/your-username/currency-converter-app.git](https://github.com/your-username/currency-converter-app.git)
    ```

3. **Open the project in Android Studio**

**Building:**

The project uses Gradle for building. To build the application for both platforms, run the following command in your terminal:

```bash
./gradlew clean assemble
```

## Dependencies:

Please refer to the `gradle/libs.versions.toml` file for the specific libraries and versions used in this project.

## Contributing:

We welcome contributions to this project! Please refer to the CONTRIBUTING.md file for details on how to contribute code and report issues.

## License:

This project is licensed under the Apache License 2.0. See the LICENSE file for details.

## Additional Notes:

- Consider including links to relevant documentation for KMM and Compose Multiplatform.
- You can further customize the README to include screenshots, usage instructions, or project-specific details.

## Project Structure:

* **`/composeApp`** (Shared Code):
    * **`commonMain`**: Code shared across all platforms (Android, iOS). This could include business logic, data models, and network layer logic.
    * **`androidMain`**: Platform-specific code for Android. This might involve integrating with Android APIs or UI elements specific to Android.
    * **`iosMain`**: Platform-specific code for iOS. This could include integrating with SwiftUI or iOS-specific APIs.
* **`/iosApp`** (iOS Entry Point):
    * This folder contains the entry point for the iOS application. While UI is shared with Compose Multiplatform, this folder is necessary for launching the app on iOS. You might also include SwiftUI code for specific iOS UI elements here.

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

---
Typed with ❤️ by [Daniel Campos](https://github.com/giusniyyel) 😊
Licensed under the Apache 2.0 License.
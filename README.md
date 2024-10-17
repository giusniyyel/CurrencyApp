## Currency Converter App - A Kotlin Multiplatform Mobile Application

**Convert currencies with ease!** This app allows you to convert between various currencies and view the latest exchange rates, with a familiar look and feel on both Android and iOS.

**Built with Modern Technologies:**

- **Kotlin Multiplatform Mobile (KMM):** Share a significant portion of your codebase across platforms for faster development and easier maintenance.
- **Compose Multiplatform:** Leverage a declarative UI framework to build beautiful and consistent user interfaces across Android and iOS.

**Getting Started:**

Before diving in, ensure you have the following tools installed:

1. **Prerequisites:**
    - Android Studio with the Kotlin plugin
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

## Project Structure:

* **`/composeApp`** (Shared Code):
    * **`commonMain`**: Code shared across all platforms (Android, iOS). This could include business logic, data models, and network layer logic.
    * **`androidMain`**: Platform-specific code for Android. This might involve integrating with Android APIs or UI elements specific to Android.
    * **`iosMain`**: Platform-specific code for iOS. This could include integrating with SwiftUI or iOS-specific APIs.
* **`/iosApp`** (iOS Entry Point):
    * This folder contains the entry point for the iOS application. While UI is shared with Compose Multiplatform, this folder is necessary for launching the app on iOS. You might also include SwiftUI code for specific iOS UI elements here.

## Learn More:

- Kotlin Multiplatform: Get started with KMM https://www.jetbrains.com/kotlin-multiplatform/
- Compose Multiplatform: Explore the world of Compose Multiplatform https://www.jetbrains.com/compose-multiplatform/

## Contributing:

We welcome contributions to this project! Please refer to the CONTRIBUTING.md file for details on how to contribute code and report issues.

## License:

This project is licensed under the Apache License 2.0. See the LICENSE file for details.

---
Typed with ❤️ by [Daniel Campos](https://github.com/giusniyyel) 😊
Licensed under the Apache 2.0 License.
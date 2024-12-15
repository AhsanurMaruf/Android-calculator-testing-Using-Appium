
https://github.com/user-attachments/assets/f371ef5e-7d90-4c38-9759-a0c9075c4318

---

# Mobile Application Testing Using Appium  

## Objective  
To set up and use Appium for testing mobile applications on Android devices or emulators.  

---

## Table of Contents  

1. [Introduction](#introduction)  
2. [Prerequisites](#prerequisites)  
3. [Step-by-Step Process](#step-by-step-process)  
   - [1. Install Node.js](#1-install-nodejs)  
   - [2. Install Appium](#2-install-appium)  
   - [3. Install Appium Doctor](#3-install-appium-doctor)  
   - [4. Install Java Development Kit (JDK)](#4-install-java-development-kit-jdk)  
   - [5. Set Up Android Studio](#5-set-up-android-studio)  
   - [6. Configure Environment Variables](#6-configure-environment-variables)  
   - [7. Install Appium Drivers](#7-install-appium-drivers)  
   - [8. Start Appium Server](#8-start-appium-server)  
   - [9. Set Up Appium Inspector](#9-set-up-appium-inspector)  
   - [10. Configure Desired Capabilities](#10-configure-desired-capabilities)  
4. [Testing Tools](#testing-tools)  
5. [Sample Apps for Testing](#sample-apps-for-testing)  

---

## Introduction  

**Appium** is an open-source tool for automating mobile app testing for Android and iOS platforms. It allows testing of **native**, **hybrid**, and **mobile web applications**.  

Key features:  
- Write test scripts in multiple programming languages: Java, Python, JavaScript, etc.  
- Supports cross-platform testing with reusable test scripts for both iOS and Android.  
- Integrates with mobile development frameworks like React Native, Flutter, and Xamarin.  

---

## Prerequisites  

Before starting, ensure you have the following installed:  
- **Node.js**  
- **Java Development Kit (JDK)**  
- **Android Studio**  
- **Appium** and **Appium Doctor**  

---

## Step-by-Step Process  

### 1. Install Node.js  

Download and install Node.js from [Node.js official website](https://nodejs.org/en/download).  
After installation, verify it using:  
```bash
node -v
npm -v
```

---

### 2. Install Appium  

Install the latest version of Appium globally:  
```bash
npm install -g appium@latest
```
Verify the installation:  
```bash
appium -v
```

---

### 3. Install Appium Doctor  

Install Appium Doctor to check for missing dependencies:  
```bash
npm install -g @appium/doctor
```
Run the following command to verify:  
```bash
appium-doctor --android
```

---

### 4. Install Java Development Kit (JDK)  

Download and install JDK from [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/#java23).  
Verify the installation:  
```bash
java -version
javac -version
```

---

### 5. Set Up Android Studio  

1. Download and install Android Studio from [Android Studio](https://developer.android.com/studio).  
2. Open Android Studio and configure SDK:  
   - Go to **Tools > SDK Manager**.  
   - Install the required SDK Platforms and Tools.  

---

### 6. Configure Environment Variables  

Add the following paths to your system's environment variables:  
- `ANDROID_HOME`: Path to the Android SDK directory.  
- Add these subfolders to the PATH variable:  
  ```bash
  %ANDROID_HOME%\platform-tools  
  %ANDROID_HOME%\build-tools  
  %ANDROID_HOME%\tools  
  ```

---

### 7. Install Appium Drivers  

Install the necessary Appium driver for Android:  
```bash
appium driver install uiautomator2
```

---

### 8. Start Appium Server  

Start the Appium server using:  
```bash
appium
```
For enabling **CORS** support, use:  
```bash
appium --allow-cors
```

---

### 9. Set Up Appium Inspector  

1. Download **Appium Inspector** from [Appium Inspector GitHub](https://github.com/appium/appium-inspector) or use the [web version](https://inspector.appiumpro.com/).  
2. Start the Appium Inspector and connect to your Appium Server using the host and port (default is `127.0.0.1:4723`).  

---

### 10. Configure Desired Capabilities  

Open **Appium Inspector** and configure desired capabilities to define the testing environment.  

#### Common Desired Capabilities  

- **`deviceName`**: Name of the emulator or physical device.  
- **`platformName`**: The operating system of the device (e.g., Android, iOS).  
- **`platformVersion`**: Version of the device's operating system (e.g., 11.0).  
- **`app`**: Path to the `.apk` file or specify an existing app using **`appPackage`** and **`appActivity`**.  

#### Example: Configuring for the Android Calculator App  

##### 1. To Test a Downloaded APK:  
```json
{
  "appium:automationName": "UiAutomator2",
  "appium:platformName": "Android",
  "appium:platformVersion": "11",
  "appium:deviceName": "emulator-5554",
  "appium:app": "/path/to/Calculator.apk"
}
```

##### 2. To Test the Pre-installed Calculator App:  
```json
{
  "appium:automationName": "UiAutomator2",
  "appium:platformName": "Android",
  "appium:platformVersion": "11",
  "appium:deviceName": "emulator-5554",
  "appium:appPackage": "com.android.calculator2",
  "appium:appActivity": "com.android.calculator2.Calculator"
}
```

**Finding `appPackage` and `appActivity`:**  

1. Launch the app on your device or emulator.  
2. Run this command to find the package and activity:  
   ```bash
   adb shell dumpsys window | grep -E 'mCurrentFocus|mFocusedApp'
   ```

---

## Testing Tools  

1. **Appium Desktop (Deprecated)**: Use Appium Inspector instead.  
2. **Vysor**: To mirror your Android device on your computer.  

---

## Sample Apps for Testing  

- **Appium Sample Apps**: [Appium Sample Code](https://github.com/appium/appium/tree/master/packages/appium/sample-code/apps)  
- **BrowserStack Demo App**: [BrowserStack App](https://github.com/browserstack/app-testing-examples/blob/master/app-debug.apk)  
- **Sauce Labs Sample Apps**: [Sauce Labs Apps](https://github.com/saucelabs/sample-app-mobile/releases)  
- **TestProject Demo App**: [TestProject App](https://github.com/testproject-io/android-demo-app)  

---

# Android Java Basic Layout Phone and Tablet

Aplikasi Android yang mendemonstrasikan implementasi layout responsif untuk perangkat phone dan tablet menggunakan Java dan Android Studio.

## 📱 Deskripsi Proyek

Proyek ini adalah aplikasi dasar yang menunjukkan bagaimana membuat layout yang dapat beradaptasi dengan berbagai ukuran layar perangkat Android (phone dan tablet). Aplikasi menggunakan **ConstraintLayout** dan **BottomNavigationView** untuk navigasi yang intuitif.

## ✨ Fitur Utama

- **Layout Responsif**: Mendukung tampilan optimal di perangkat phone dan tablet
- **Bottom Navigation**: Menu navigasi bawah dengan 2 menu utama:
  - Home
  - History
- **FrameLayout Container**: Kontainer dinamis untuk menampilkan berbagai fragment
- **Material Design**: Menggunakan komponen Material Design dari Google
- **View Binding**: Implementasi View Binding untuk keamanan dan performa yang lebih baik

## 🏗️ Struktur Proyek

```
android_java_basic_layout_phone_tablet/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/studi/phonetablet/
│   │   │   │       └── MainActivity.java
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml
│   │   │   │   ├── menu/
│   │   │   │   │   └── main_menu.xml
│   │   │   │   └── values/
│   │   │   │       └── strings.xml
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle.kts
├── build.gradle.kts
├── settings.gradle.kts
└── gradle/
```

## 🔧 Teknologi & Dependencies

### Build Configuration
- **Gradle Kotlin DSL**: Build system modern
- **Target SDK**: 36 (Android 15)
- **Minimum SDK**: 24 (Android 7.0)
- **Java Version**: 11

### Dependencies
- **AndroidX AppCompat**: Kompatibilitas ke versi Android yang lebih lama
- **Material Design**: Komponen UI modern
- **ConstraintLayout**: Layout yang fleksibel dan powerful
- **CircleImageView**: Library untuk menampilkan gambar circular
- **JUnit**: Testing framework

```gradle
dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation("de.hdodenhof:circleimageview:3.1.0")
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
```

## 🎨 Layout Components

### Activity Main Layout
File: `app/src/main/res/layout/activity_main.xml`

Menggunakan **ConstraintLayout** sebagai root dengan struktur:
- **FrameLayout** (`main_container`): Container utama untuk menampilkan fragment dengan ukuran dinamis
- **BottomNavigationView** (`bottom_nav`): Menu navigasi bawah dengan item Home dan History

```xml
<androidx.constraintlayout.widget.ConstraintLayout>
    <FrameLayout
        android:id="@+id/main_container"
        ... />
    
    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottom_nav"
        ... />
</androidx.constraintlayout.widget.ConstraintLayout>
```

### Navigation Menu
File: `app/src/main/res/menu/main_menu.xml`

Menu navigasi dengan 2 item:
- **Home**: Halaman utama aplikasi
- **History**: Halaman untuk menampilkan history

## 📋 Manifest Configuration

- **App Name**: "Layout"
- **Entry Point**: MainActivity
- **Theme**: Material Design Theme
- **RTL Support**: Enabled
- **Min SDK**: API 24
- **Target SDK**: API 36

## 🚀 Cara Menggunakan

1. **Clone Repository**
   ```bash
   git clone https://github.com/hendroprwk08/android_java_basic_layout_phone_tablet.git
   ```

2. **Buka dengan Android Studio**
   - Buka Android Studio
   - Pilih "Open an existing Android Studio project"
   - Navigasi ke folder project

3. **Build Project**
   ```bash
   ./gradlew build
   ```

4. **Run Aplikasi**
   - Hubungkan device Android atau gunakan emulator
   - Klik tombol "Run" atau tekan `Shift + F10`

## 📚 Konsep yang Dipelajari

- ✅ ConstraintLayout untuk layout responsif
- ✅ BottomNavigationView untuk navigasi
- ✅ Fragment untuk modular UI
- ✅ View Binding untuk type-safe view references
- ✅ Material Design principles
- ✅ Responsive design untuk multiple screen sizes

## 📄 License

Proyek ini adalah project pembelajaran. Silakan gunakan dan modifikasi sesuai kebutuhan.

## 👤 Author

**hendroprwk08**

---

Dibuat pada: 2026
Last Updated: 16 Mei 2026

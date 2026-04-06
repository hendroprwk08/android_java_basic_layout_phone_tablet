package com.studi.phonetablet;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.studi.phonetablet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Inisialisasi Fragment awal
        loadFragment(new SatuFragment());

        // 1. Cek apakah Bottom Navigation Aktif (Mode Phone)
        if (binding.bottomNav != null) {
            binding.bottomNav.setOnItemSelectedListener(item -> {
                handleNavigation(item.getItemId());
                return true;
            });
        }

        // 2. Cek apakah Navigation Rail Aktif (Mode Tablet)
        if (binding.navRail != null) {
            binding.navRail.setOnItemSelectedListener(item -> {
                handleNavigation(item.getItemId());
                return true;
            });
        }
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container, fragment)
                .commit();
    }

    private void handleNavigation(int itemId) {
        if (itemId == R.id.menu_home) {
            loadFragment(new SatuFragment());
        } else if (itemId == R.id.menu_history) {
            loadFragment(new DuaFragment());
        }
    }
}
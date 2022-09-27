package uz.pdp.myeduapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity  {
    private boolean isBackPressedOnce = false;

    BottomNavigationView bottomNavigationView;


    @SuppressLint("ObsoleteSdkInt")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout linearLayout1;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;


        linearLayout1 = findViewById(R.id.layoutGoal);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GoalsActivity.class);
                startActivity(intent);
            }
        });


        linearLayout2 = findViewById(R.id.layoutDevv);
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Dasturlash_Activity.class);
                startActivity(intent2);
            }
        });

        linearLayout3 = findViewById(R.id.layoutPupil);
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, Oquvchi_Activity.class);
                startActivity(intent3);
            }
        });

        linearLayout4 = findViewById(R.id.layoutHome);
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, MyHome_Activity.class);
                startActivity(intent4);
            }
        });

        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        findViewById(R.id.navbaricon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        NavigationView navigationView = findViewById(R.id.navBarMenu);
        navigationView.setItemIconTintList(null);
    }


    @Override
    public void onBackPressed() {
        if (isBackPressedOnce) {
            super.onBackPressed();
            return;
        }
        isBackPressedOnce = true;
        Toast.makeText(this, "Chiqish uchun 🔙  ni Ikki marta bosing", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isBackPressedOnce = false;
            }
        }, 2000);


        bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        bottomNavigationView.setSelectedItemId(R.id.menuHome);

    }

//
    AccountFragment accountFragment = new AccountFragment();
    HomeFragment homeFragment = new HomeFragment();
    SettingsFragment settingsFragment = new SettingsFragment();
    FavouriteLessonsFragment favouriteLessonsFragment = new FavouriteLessonsFragment();

    private final BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {




    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment selectedFragment = null;


        switch (item.getItemId()) {
            case R.id.menuHome:
                selectedFragment=new HomeFragment();
                break;

            case R.id.menuAccount:
                selectedFragment=new AccountFragment();
                break;
            case R.id.menuLike:
                selectedFragment= new FavouriteLessonsFragment();
                break;
            case R.id.menuSettings:
                selectedFragment=new SettingsFragment();
                break;
        }
        assert selectedFragment != null;
        getSupportFragmentManager().beginTransaction().replace(R.id.container, selectedFragment).commit();
        return true;

    }
            };

}
package uz.pdp.myeduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean isBackPressedOnce = false;

    @SuppressLint("ObsoleteSdkInt")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


    }
}
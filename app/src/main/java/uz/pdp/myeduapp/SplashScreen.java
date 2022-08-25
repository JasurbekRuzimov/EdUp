package uz.pdp.myeduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {


    LottieAnimationView lottie1;
    LottieAnimationView lottie2;
    LottieAnimationView lottie3;
    private boolean isBackPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        lottie1 = findViewById(R.id.lottie1);
        lottie2 = findViewById(R.id.lottie2);
        lottie3 = findViewById(R.id.lottie3);


        lottie1.animate().translationY(800).setDuration(2700).setStartDelay(3000);
        lottie2.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
        lottie3.animate().translationX(0).setDuration(2700).setStartDelay(0);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 6000);

    }

    @Override
    public void onBackPressed() {
        if (isBackPressedOnce) {
            super.onBackPressed();
            return;
        }
        isBackPressedOnce=true;
        Toast.makeText(this, "Chiqish uchun 🔙  ni Ikki marta bosing", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isBackPressedOnce = false;
            }
        }, 2000);



    }

}
package uz.pdp.myeduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {


    LottieAnimationView lottie1;
    LottieAnimationView lottie2;
    LottieAnimationView lottie3;
    LottieAnimationView lottie4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
//
//        lottie1 = findViewById(R.id.lottie1);
//        lottie2 = findViewById(R.id.lottie2);
//        lottie3 = findViewById(R.id.lottie3);
        lottie4 = findViewById(R.id.lottieAnimationView);

//        lottie1.animate().translationY(800).setDuration(2700).setStartDelay(3000);
        lottie4.animate().translationX(0).setDuration(3000).setStartDelay(2900);
//        lottie3.animate().translationX(0).setDuration(2700).setStartDelay(0);


        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000);
    }

}
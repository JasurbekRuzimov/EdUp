package uz.pdp.myeduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ObsoleteSdkInt")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 //       Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorActionBar)));

//    if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
//        Window window=getWindow();
//        window.setStatusBarColor(getResources().getColor(R.color.colorStatusBar));
//    }
//
//    new Handler().postDelayed(new Runnable() {
//        @Override
//        public void run() {
//            Intent intent=new Intent(MainActivity.this,SplashScreen.class );
//            startActivity(intent);
//            finish();
//        }
//    },5000);
    }
}
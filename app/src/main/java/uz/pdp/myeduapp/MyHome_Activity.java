package uz.pdp.myeduapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MyHome_Activity extends AppCompatActivity {
 ImageView imageView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_home);

imageView = findViewById(R.id.backHome);   //Bosh sahifaga qaytish tugmasi
        imageView.setOnClickListener(v -> {
            finish();
        });

    }
}
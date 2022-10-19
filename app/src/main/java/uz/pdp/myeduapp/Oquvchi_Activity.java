package uz.pdp.myeduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Oquvchi_Activity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oquvchi);

        imageView = findViewById(R.id.backHome); // Bosh sahifaga qaytish tugmasi
        imageView.setOnClickListener(v -> {
            finish();
        });


    }
}
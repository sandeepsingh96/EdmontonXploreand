package com.example.edmontonxplore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.edmontonxplore.databinding.ActivityDataForPlaceBinding;

public class dataForPlace extends AppCompatActivity {
    ActivityDataForPlaceBinding binding;
    Button launchMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDataForPlaceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        launchMap = findViewById(R.id.map);


        Intent intent = this.getIntent();
        String uria = intent.getStringExtra("uria");
        Uri urib = Uri.parse(uria);
//ithe apa value lay raha a contentlist toh, jehra thalle name a green ale ohi duji pase chai da a lain lai
        if(intent != null){
            String title = intent.getStringExtra("title");
            String description = intent.getStringExtra("description");
            int imageOne = intent.getIntExtra("imageOne",R.drawable.b);
            int imageTwo = intent.getIntExtra("imageTwo",R.drawable.b);
            int imageid = intent.getIntExtra("imageid",R.drawable.b);

// value set ithe karni a jdo display krni a
            binding.titleF.setText(title);
            binding.placePicF.setImageResource(imageid);
            binding.descriptionDS.setText(description);
            binding.imageOne.setImageResource(imageOne);
            binding.imageTwo.setImageResource(imageTwo);
        }
        launchMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = urib;
              Intent intent = new Intent(Intent.ACTION_VIEW,uri);
              intent.setPackage("com.google.android.apps.maps");
              startActivity(intent);
            }
        });
    }
}
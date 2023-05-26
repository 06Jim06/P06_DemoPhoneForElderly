package com.example.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button callSon;
    Button callDaughter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callSon = findViewById(R.id.buttonCallSon);
        callDaughter = findViewById(R.id.buttonCallDaughter);

//        Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+12345678));
//        startActivity(intentCall);

        callSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+92240336));
                startActivity(intentCall);
            }
        });

        callDaughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+89675543));
                startActivity(intentCall);
            }
        });

    }
}
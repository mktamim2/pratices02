package com.khairul.pratices02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    LinearLayout parirkhal, barguna, barisal;
    Button khairul, tamim, naime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parirkhal = findViewById(R.id.parirkhal);
        barguna = findViewById(R.id.barguna);
        barisal = findViewById(R.id.barisal);
        khairul = findViewById(R.id.khairul);
        tamim = findViewById(R.id.tamim);
        naime = findViewById(R.id.naime);

        khairul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barguna.setVisibility(View.VISIBLE);
                parirkhal.setVisibility(View.GONE);
            }
        });
        tamim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barisal.setVisibility(View.VISIBLE);
                parirkhal.setVisibility(View.GONE);
            }
        });



    }
}
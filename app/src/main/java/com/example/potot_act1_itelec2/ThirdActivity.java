package com.example.potot_act1_itelec2;

import static com.example.potot_act1_itelec2.R.id.button2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button Btn = (Button) findViewById(button2);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(String.valueOf(ThirdActivity.this));
                startActivity(intent);
            }
        });
    }
}
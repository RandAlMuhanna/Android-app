package com.seu.seu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.seu.seu.R.*;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_home);
        ImageButton b1=(ImageButton)findViewById(R.id.map);
        ImageButton b3=(ImageButton)findViewById(R.id.sc2);
        ImageButton b4=(ImageButton)findViewById(R.id.aboutus);
        ImageButton b5=(ImageButton)findViewById(R.id.faqs);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(),map.class);
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getApplicationContext(),specializations_and_communication.class);
                startActivity(i3);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
         public void onClick(View view) {
        Intent i=new Intent(getApplicationContext() ,aboutus.class);
        startActivity(i);
    }
});

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getApplicationContext(),FAQs.class);
                startActivity(i4);
            }
        });


    }
}

package com.seu.seu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class specializations_and_communication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specializations_and_communication);
        ImageButton spee = (ImageButton) findViewById(R.id.spe);

        ImageButton comm =(ImageButton) findViewById(R.id.comm);

      comm.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent comm1 = new Intent(getApplicationContext(),Communication.class);
              startActivity(comm1);
          }
      });


        spee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent spe1 = new Intent(getApplicationContext(),specializations.class);
                startActivity(spe1);
            }
        });

    }
}

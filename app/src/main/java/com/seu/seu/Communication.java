package com.seu.seu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Communication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);
        ImageButton tw = (ImageButton) findViewById(R.id.tw);
        ImageButton gm = (ImageButton) findViewById(R.id.gm);

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tw1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/SEU_Care"));
                startActivity(tw1);
            }
        });
        gm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent gm2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/VunLUWKCM3S2"));
                startActivity(gm2);
            }
        });
    }
}

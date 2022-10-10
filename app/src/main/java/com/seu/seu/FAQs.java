package com.seu.seu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FAQs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);
        Button d1=(Button)findViewById(R.id.de1);
        Button d2=(Button)  findViewById(R.id.de2);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dee2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.seu.edu.sa/sites/ar/deanships/gs/Pages/FAQs.aspx"));
                startActivity(dee2);
            }
        });
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dee1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.seu.edu.sa/sites/ar/deanships/py/Pages/common-questions.aspx"));
                startActivity(dee1);
            }
        });
    }
}

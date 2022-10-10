package com.seu.seu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class specializations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specializations);
        Button coll=(Button) findViewById(R.id.col1);
        Button col2=(Button) findViewById(R.id.col2);
        Button col3=(Button) findViewById(R.id.col3);
        Button col4=(Button) findViewById(R.id.col4);
        col4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coll4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.seu.edu.sa/sites/ar/colleges/CSTS/Pages/main.aspx"));
                startActivity(coll4);
            }
        });
        col3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coll3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.seu.edu.sa/sites/ar/colleges/cohs/Pages/main.aspx"));
                startActivity(coll3);
            }
        });
col2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent coll2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.seu.edu.sa/sites/ar/colleges/cocai/Pages/main.aspx"));
        startActivity(coll2);
    }
});
coll.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent coll1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.seu.edu.sa/sites/ar/colleges/coafs/Pages/main.aspx"));
        startActivity(coll1);
    }
});
    }
}

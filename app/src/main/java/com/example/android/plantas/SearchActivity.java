package com.example.android.plantas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    String value="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        Button cactus = (Button) findViewById(R.id.cactus_button) ;
        Button aloe_vera = (Button) findViewById(R.id.aloe_vera_button) ;
        Button daisy = (Button) findViewById(R.id.daisy_button) ;
        Button mint = (Button) findViewById(R.id.mint_button) ;

        cactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="cactus";
                Intent i = new Intent(SearchActivity.this, MainActivity.class);
                i.putExtra("key",value);
                startActivity(i);
            }
        });

        aloe_vera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SearchActivity.this, MainActivity.class);
                String value="aloe_vera";
                i.putExtra("key",value);
                startActivity(i);
            }
        });

        daisy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SearchActivity.this, MainActivity.class);
                String value="daisy";
                i.putExtra("key",value);
                startActivity(i);
            }
        });

        mint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SearchActivity.this, MainActivity.class);
                String value="mint";
                i.putExtra("key",value);
                startActivity(i);
            }
        });



    }

}

package com.example.android.plantas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {


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
                Intent i = new Intent();
                i.putExtra("key",value);
                setResult(Activity.RESULT_OK, i);
                finish();
            }
        });

        aloe_vera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="aloe_vera";
                Intent i = new Intent();
                i.putExtra("key",value);
                setResult(Activity.RESULT_OK, i);
                finish();
            }
        });

        daisy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="daisy";
                Intent i = new Intent();
                i.putExtra("key",value);
                setResult(Activity.RESULT_OK, i);
                finish();
            }
        });

        mint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value="mint";
                Intent i = new Intent();
                i.putExtra("key",value);
                setResult(Activity.RESULT_OK, i);
                finish();
            }
        });



    }

}

package com.example.android.plantas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setCount(0);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(
                        new Intent(MainActivity.this, SearchActivity.class),
                        1
                );
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //if (requestCode != 1) super.onActivityResult(requestCode, resultCode, data);
        int count = getCount();
        Bundle extras = data.getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            Log.d("COUNT", count % 4  + "");
            Log.d("COUNT", value);

            if(value.equals("cactus")){
                if(count % 4 == 0){
                    ImageView imag = (ImageView) findViewById(R.id.primer);
                    imag.setImageResource(R.drawable.cactus1);
                    imag.setVisibility(ImageView.VISIBLE);
                } else if(count % 4 == 1){
                    ImageView imag = (ImageView) findViewById(R.id.segon);
                    imag.setImageResource(R.drawable.cactus1);
                    imag.setVisibility(ImageView.VISIBLE);
                } else if(count % 4 == 2){
                    ImageView imag = (ImageView) findViewById(R.id.tercer);
                    imag.setImageResource(R.drawable.cactus1);
                    imag.setVisibility(ImageView.VISIBLE);
                } else{
                    ImageView imag = (ImageView) findViewById(R.id.quart);
                    imag.setImageResource(R.drawable.cactus1);
                    imag.setVisibility(ImageView.VISIBLE);
                }
                TextView t = (TextView) findViewById(R.id.texto);
                t.setVisibility(TextView.INVISIBLE);
                setCount(count + 1);
            }
            else if(value.equals("aloe_vera")){
                if(count % 4 == 0){
                    ImageView imag = (ImageView) findViewById(R.id.primer);
                    imag.setImageResource(R.drawable.aloe1);
                    imag.setVisibility(ImageView.VISIBLE);
                } else if(count % 4 == 1){
                    ImageView imag = (ImageView) findViewById(R.id.segon);
                    imag.setImageResource(R.drawable.aloe1);
                    imag.setVisibility(ImageView.VISIBLE);
                } else if(count % 4 == 2){
                    ImageView imag = (ImageView) findViewById(R.id.tercer);
                    imag.setImageResource(R.drawable.aloe1);
                    imag.setVisibility(ImageView.VISIBLE);
                } else{
                    ImageView imag = (ImageView) findViewById(R.id.quart);
                    imag.setImageResource(R.drawable.aloe1);
                    imag.setVisibility(ImageView.VISIBLE);
                }
                TextView t = (TextView) findViewById(R.id.texto);
                t.setVisibility(TextView.INVISIBLE);
                setCount(count + 1);
            }
            else if (value.equals("daisy")){
                if(count % 4 == 0){
                    ImageView imag = (ImageView) findViewById(R.id.primer);
                    imag.setImageResource(R.drawable.daisy1);
                    imag.setVisibility(ImageView.VISIBLE);
                } else if(count % 4 == 1){
                    ImageView imag = (ImageView) findViewById(R.id.segon);
                    imag.setImageResource(R.drawable.daisy1);
                    imag.setVisibility(ImageView.VISIBLE);
                } else if(count % 4 == 2){
                    ImageView imag = (ImageView) findViewById(R.id.tercer);
                    imag.setImageResource(R.drawable.daisy1);
                    imag.setVisibility(ImageView.VISIBLE);
                } else{
                    ImageView imag = (ImageView) findViewById(R.id.quart);
                    imag.setImageResource(R.drawable.daisy1);
                    imag.setVisibility(ImageView.VISIBLE);
                }
                TextView t = (TextView) findViewById(R.id.texto);
                t.setVisibility(TextView.INVISIBLE);
                setCount(count + 1);

            }
            else{
                if(count % 4 == 0){
                    ImageView imag = (ImageView) findViewById(R.id.primer);
                    imag.setImageResource(R.drawable.mint1);
                    imag.setVisibility(ImageView.VISIBLE);
                } else if(count % 4 == 1){
                    ImageView imag = (ImageView) findViewById(R.id.segon);
                    imag.setImageResource(R.drawable.mint1);
                    imag.setVisibility(ImageView.VISIBLE);
                } else if(count % 4 == 2){
                    ImageView imag = (ImageView) findViewById(R.id.tercer);
                    imag.setImageResource(R.drawable.mint1);
                    imag.setVisibility(ImageView.VISIBLE);
                } else{
                    ImageView imag = (ImageView) findViewById(R.id.quart);
                    imag.setImageResource(R.drawable.mint1);
                    imag.setVisibility(ImageView.VISIBLE);
                }
                TextView t = (TextView) findViewById(R.id.texto);
                t.setVisibility(TextView.INVISIBLE);
                setCount(count + 1);
            }
        }

    }

    private void setCount(int count) {
        SharedPreferences.Editor sp = this.getSharedPreferences("PLANTES", Context.MODE_PRIVATE).edit();
        sp.putInt("count", count % 4);
        sp.apply();
    }

    private int getCount() {
        SharedPreferences sp = this.getSharedPreferences("PLANTES", Context.MODE_PRIVATE);
        return sp.getInt("count", 0);
    }
}

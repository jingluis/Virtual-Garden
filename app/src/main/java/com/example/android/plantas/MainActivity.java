package com.example.android.plantas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
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
            Log.d("COUNT", count   + "");
            Log.d("COUNT", value);

            if(value.equals("cactus")){
                int found = 0;
                if(found == 0) {
                    ImageView imag = (ImageView) findViewById(R.id.primer);
                    ImageView imag1 = (ImageView) findViewById(R.id.segon);
                    ImageView imag2 = (ImageView) findViewById(R.id.tercer);
                    ImageView imag3 = (ImageView) findViewById(R.id.quart);
                    String s = String.valueOf(imag.getTag());
                    String s1 = String.valueOf(imag1.getTag());
                    String s2 = String.valueOf(imag2.getTag());
                    String s3 = String.valueOf(imag3.getTag());
                    if(s.equals("cactus1")){
                        imag.setImageResource(R.drawable.cactus4);
                        imag.setTag("cactus4");
                        found = 1;
                    }
                    if(s1.equals("cactus1")){
                        imag1.setImageResource(R.drawable.cactus4);
                        imag1.setTag("cactus4");
                        found = 1;
                    }
                    if(s2.equals("cactus1")){
                        imag2.setImageResource(R.drawable.cactus4);
                        imag2.setTag("cactus4");
                        found = 1;
                    }
                    if(s3.equals("cactus1")){
                        imag3.setImageResource(R.drawable.cactus4);
                        imag3.setTag("cactus4");
                        found = 1;
                    }
                }
                if(found == 0) {
                    if(count % 4 == 0){
                        ImageView imag = (ImageView) findViewById(R.id.primer);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res")) imag.setTag("cactus1");
                        if(s.equals("cactus1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.cactus4);
                            imag.setTag("cactus4");
                        }
                        else imag.setImageResource(R.drawable.cactus1);
                        imag.setVisibility(ImageView.VISIBLE);
                    } else if(count % 4 == 1){
                        ImageView imag = (ImageView) findViewById(R.id.segon);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res1")) imag.setTag("cactus1");
                        if(s.equals("cactus1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.cactus4);
                            imag.setTag("cactus4");
                        }
                        else imag.setImageResource(R.drawable.cactus1);
                        imag.setVisibility(ImageView.VISIBLE);
                    } else if(count % 4 == 2){
                        ImageView imag = (ImageView) findViewById(R.id.tercer);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res2")) imag.setTag("cactus1");
                        if(s.equals("cactus1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.cactus4);
                            imag.setTag("cactus4");
                        }
                        else imag.setImageResource(R.drawable.cactus1);
                        imag.setVisibility(ImageView.VISIBLE);
                    } else{
                        ImageView imag = (ImageView) findViewById(R.id.quart);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res3")) imag.setTag("cactus1");
                        if(s.equals("cactus1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.cactus4);
                            imag.setTag("cactus4");
                        }
                        else imag.setImageResource(R.drawable.cactus1);
                        imag.setVisibility(ImageView.VISIBLE);
                    }
                    setCount(count + 1);

                }
                TextView t = (TextView) findViewById(R.id.texto);
                t.setVisibility(TextView.INVISIBLE);
            }
            else if(value.equals("aloe_vera")){
                int found = 0;
                if(found == 0){
                    ImageView imag = (ImageView) findViewById(R.id.primer);
                    ImageView imag1 = (ImageView) findViewById(R.id.segon);
                    ImageView imag2 = (ImageView) findViewById(R.id.tercer);
                    ImageView imag3 = (ImageView) findViewById(R.id.quart);
                    String s = String.valueOf(imag.getTag());
                    String s1 = String.valueOf(imag1.getTag());
                    String s2 = String.valueOf(imag2.getTag());
                    String s3 = String.valueOf(imag3.getTag());
                    if(s.equals("aloe1")){
                        imag.setImageResource(R.drawable.aloe4);
                        imag.setTag("aloe4");
                        found = 1;
                    }
                    if(s1.equals("aloe1")){
                        imag1.setImageResource(R.drawable.aloe4);
                        imag1.setTag("aloe4");
                        found = 1;
                    }
                    if(s2.equals("aloe1")){
                        imag2.setImageResource(R.drawable.aloe4);
                        imag2.setTag("aloe4");
                        found = 1;
                    }
                    if(s3.equals("aloe1")){
                        imag3.setImageResource(R.drawable.aloe4);
                        imag3.setTag("aloe4");
                        found = 1;
                    }
                }
                if(found == 0){
                    if(count % 4 == 0){
                        ImageView imag = (ImageView) findViewById(R.id.primer);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res")) imag.setTag("aloe1");
                        if(s.equals("aloe1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.aloe4);
                            imag.setTag("aloe4");
                        }
                        else imag.setImageResource(R.drawable.aloe1);
                        imag.setVisibility(ImageView.VISIBLE);
                    } else if(count % 4 == 1){
                        ImageView imag = (ImageView) findViewById(R.id.segon);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res1")) imag.setTag("aloe1");
                        if(s.equals("aloe1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.aloe4);
                            imag.setTag("aloe4");
                        }
                        else imag.setImageResource(R.drawable.aloe1);
                        imag.setVisibility(ImageView.VISIBLE);
                    } else if(count % 4 == 2){
                        ImageView imag = (ImageView) findViewById(R.id.tercer);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res2")) imag.setTag("aloe1");
                        if(s.equals("aloe1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.aloe4);
                            imag.setTag("aloe4");
                        }
                        else imag.setImageResource(R.drawable.aloe1);
                        imag.setVisibility(ImageView.VISIBLE);
                    } else{
                        ImageView imag = (ImageView) findViewById(R.id.quart);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res3")) imag.setTag("aloe1");
                        if (s.equals("aloe1") && imag.getVisibility() == imag.VISIBLE) {
                            imag.setImageResource(R.drawable.aloe4);
                            imag.setTag("aloe4");
                        } else {
                            imag.setImageResource(R.drawable.aloe1);
                        }
                        imag.setVisibility(ImageView.VISIBLE);
                    }
                    setCount(count + 1);
                }

                TextView t = (TextView) findViewById(R.id.texto);
                t.setVisibility(TextView.INVISIBLE);

            }
            else if (value.equals("daisy")){
                int found = 0;
                if(found == 0){
                    ImageView imag = (ImageView) findViewById(R.id.primer);
                    ImageView imag1 = (ImageView) findViewById(R.id.segon);
                    ImageView imag2 = (ImageView) findViewById(R.id.tercer);
                    ImageView imag3 = (ImageView) findViewById(R.id.quart);
                    String s = String.valueOf(imag.getTag());
                    String s1 = String.valueOf(imag1.getTag());
                    String s2 = String.valueOf(imag2.getTag());
                    String s3 = String.valueOf(imag3.getTag());
                    if(s.equals("daisy1")){
                        imag.setImageResource(R.drawable.daisy4);
                        imag.setTag("daisy4");
                        found = 1;
                    }
                    if(s1.equals("daisy1")){
                        imag1.setImageResource(R.drawable.daisy4);
                        imag1.setTag("daisy4");
                        found = 1;
                    }
                    if(s2.equals("daisy1")){
                        imag2.setImageResource(R.drawable.daisy4);
                        imag2.setTag("daisy4");
                        found = 1;
                    }
                    if(s3.equals("daisy1")){
                        imag3.setImageResource(R.drawable.daisy4);
                        imag3.setTag("daisy4");
                        found = 1;
                    }
                }
                if(found == 0){
                    if(count % 4 == 0){
                        ImageView imag = (ImageView) findViewById(R.id.primer);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res")) imag.setTag("daisy1");
                        if(s.equals("daisy1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.daisy4);
                            imag.setTag("daisy4");
                        }
                        else imag.setImageResource(R.drawable.daisy1);
                        imag.setVisibility(ImageView.VISIBLE);
                    } else if(count % 4 == 1){
                        ImageView imag = (ImageView) findViewById(R.id.segon);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res1")) imag.setTag("daisy1");
                        if(s.equals("daisy1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.daisy4);
                            imag.setTag("daisy4");
                        }
                        else imag.setImageResource(R.drawable.daisy1);
                        imag.setVisibility(ImageView.VISIBLE);
                    } else if(count % 4 == 2){
                        ImageView imag = (ImageView) findViewById(R.id.tercer);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res2")) imag.setTag("daisy1");
                        if(s.equals("daisy1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.daisy4);
                            imag.setTag("daisy4");
                        }
                        else imag.setImageResource(R.drawable.daisy1);
                        imag.setVisibility(ImageView.VISIBLE);
                    } else{
                        ImageView imag = (ImageView) findViewById(R.id.quart);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res3")) imag.setTag("daisy1");
                        if(s.equals("daisy1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.daisy4);
                            imag.setTag("daisy4");
                        }
                        else imag.setImageResource(R.drawable.daisy1);
                        imag.setVisibility(ImageView.VISIBLE);
                    }
                    setCount(count + 1);

                }

                TextView t = (TextView) findViewById(R.id.texto);
                t.setVisibility(TextView.INVISIBLE);

            }
            else{
                int found = 0;
                if(found == 0){
                    ImageView imag = (ImageView) findViewById(R.id.primer);
                    ImageView imag1 = (ImageView) findViewById(R.id.segon);
                    ImageView imag2 = (ImageView) findViewById(R.id.tercer);
                    ImageView imag3 = (ImageView) findViewById(R.id.quart);
                    String s = String.valueOf(imag.getTag());
                    String s1 = String.valueOf(imag1.getTag());
                    String s2 = String.valueOf(imag2.getTag());
                    String s3 = String.valueOf(imag3.getTag());
                    if(s.equals("mint1")){
                        imag.setImageResource(R.drawable.mint4);
                        imag.setTag("mint4");
                        found = 1;
                    }
                    if(s1.equals("mint1")){
                        imag1.setImageResource(R.drawable.mint4);
                        imag1.setTag("mint4");
                        found = 1;
                    }
                    if(s2.equals("mint1")){
                        imag2.setImageResource(R.drawable.mint4);
                        imag2.setTag("mint4");
                        found = 1;
                    }
                    if(s3.equals("mint1")){
                        imag3.setImageResource(R.drawable.mint4);
                        imag3.setTag("mint4");
                        found = 1;
                    }
                }
                if(found == 0){
                    if(count % 4 == 0){
                        ImageView imag = (ImageView) findViewById(R.id.primer);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res")) imag.setTag("mint1");
                        if(s.equals("mint1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.mint4);
                            imag.setTag("mint4");
                        }
                        else imag.setImageResource(R.drawable.mint1);
                        imag.setVisibility(ImageView.VISIBLE);
                    } else if(count % 4 == 1){
                        ImageView imag = (ImageView) findViewById(R.id.segon);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res1")) imag.setTag("mint1");
                        if(s.equals("mint1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.mint4);
                            imag.setTag("mint4");
                        }
                        else imag.setImageResource(R.drawable.mint1);
                        imag.setVisibility(ImageView.VISIBLE);
                    } else if(count % 4 == 2){
                        ImageView imag = (ImageView) findViewById(R.id.tercer);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res2")) imag.setTag("mint1");
                        if(s.equals("mint1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.mint4);
                            imag.setTag("mint4");
                        }
                        else imag.setImageResource(R.drawable.mint1);
                        imag.setVisibility(ImageView.VISIBLE);
                    } else{
                        ImageView imag = (ImageView) findViewById(R.id.quart);
                        String s = String.valueOf(imag.getTag());
                        if(s.equals("res3")) imag.setTag("mint1");
                        if(s.equals("mint1") && imag.getVisibility()==imag.VISIBLE){
                            imag.setImageResource(R.drawable.mint4);
                            imag.setTag("mint4");
                        }
                        else imag.setImageResource(R.drawable.mint1);
                        imag.setVisibility(ImageView.VISIBLE);
                    }
                    setCount(count + 1);

                }


                TextView t = (TextView) findViewById(R.id.texto);
                t.setVisibility(TextView.INVISIBLE);
            }
        }

    }

    private void setCount(int count) {
        SharedPreferences.Editor sp = this.getSharedPreferences("PLANTES", Context.MODE_PRIVATE).edit();
        sp.putInt("count", count);
        sp.apply();
    }

    private int getCount() {
        SharedPreferences sp = this.getSharedPreferences("PLANTES", Context.MODE_PRIVATE);
        return sp.getInt("count", 0);
    }
}

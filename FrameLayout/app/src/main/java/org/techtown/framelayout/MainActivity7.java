package org.techtown.framelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity7 extends AppCompatActivity {
    private ImageView imageView01, imageView02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        imageView01 = (ImageView) findViewById(R.id.imageView3);
        imageView02 = (ImageView) findViewById(R.id.imageView4);
        imageView02.setVisibility(View.INVISIBLE);

        Button up = (Button) findViewById(R.id.up);
        up.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                imageView01.setVisibility(View.VISIBLE);
                imageView02.setVisibility(View.INVISIBLE);
            }
        });

        Button down = (Button) findViewById(R.id.down);
        down.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                imageView01.setVisibility(View.INVISIBLE);
                imageView02.setVisibility(View.VISIBLE);
            }
        });
    }
}

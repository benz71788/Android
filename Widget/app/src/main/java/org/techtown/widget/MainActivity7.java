package org.techtown.widget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity7 extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void mOnClick(View view){
        ToggleButton button = (ToggleButton) view;
        System.out.println("클릭상태 = " + button.isChecked());
        if(button.isChecked()){
            imageView.setImageResource(R.drawable.dream01);
        } else {
            imageView.setImageResource(R.drawable.dream02);
        }
    }
}

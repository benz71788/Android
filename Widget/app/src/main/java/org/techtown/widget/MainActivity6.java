package org.techtown.widget;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void mOnClick(View view){
        ToggleButton btn = (ToggleButton) view;
        System.out.println(btn.getText());
        if(btn.isChecked()){
            btn.setTextColor(0xffff0000);
        } else {
            btn.setTextColor(0xff0000ff);
        }
    }
}

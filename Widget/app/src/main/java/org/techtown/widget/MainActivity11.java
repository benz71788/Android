package org.techtown.widget;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity11 extends AppCompatActivity
                                implements SeekBar.OnSeekBarChangeListener{
    private SeekBar seekBar1, seekBar2, seekBar3;
    private View view;
    private TextView textView1, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        seekBar1 = (SeekBar) findViewById(R.id.seekBar1);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar3 = (SeekBar) findViewById(R.id.seekBar3);

        view = findViewById(R.id.view);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        view.setBackgroundColor(Color.argb(255, seekBar1.getProgress(), 0, 0));
        seekBar1.setOnSeekBarChangeListener(this);
        seekBar2.setOnSeekBarChangeListener(this);
        seekBar3.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        view.setBackgroundColor(Color.argb(255, seekBar1.getProgress(), seekBar2.getProgress(), seekBar3.getProgress()));
        switch(seekBar.getId()){
            case R.id.seekBar1:
                textView1.setText("R: " + seekBar.getProgress());
                break;
            case R.id.seekBar2:
                textView2.setText("G: " + seekBar.getProgress());
                break;
            case R.id.seekBar3:
                textView3.setText("B: " + seekBar.getProgress());
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}

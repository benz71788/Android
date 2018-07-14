package org.techtown.widget;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity10 extends AppCompatActivity {
    private SeekBar seekBar1, seekBar2, seekBar3;
    private View view;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        seekBar1 = (SeekBar) findViewById(R.id.seekBar1);
        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar3 = (SeekBar) findViewById(R.id.seekBar3);

        view = findViewById(R.id.view);
        textView = (TextView) findViewById(R.id.textView);
        view.setBackgroundColor(Color.argb(255, seekBar1.getProgress(), 0, 0));
        textView.setText("R:" + seekBar1.getProgress()
                + " G:" + seekBar2.getProgress() + " B:" + seekBar3.getProgress());

        //setOnSeekBarChangeListener
        //Seekbar의 위치가 변경이 된 경우 자동 호출되는 메서드입니다.
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                //fromUser : 사용자가 변경한 경우는 true, 자바 코드로의 변경이 false입니다.
                //progress : 현재 위치값
                if(fromUser){
                    //두번째 매개 변수 int progress는 SeekBar의 값입니다.
                    view.setBackgroundColor(Color.argb(255, progress, seekBar2.getProgress(), seekBar3.getProgress()));
                }
                textView.setText("R:" + seekBar1.getProgress()
                        + " G:" + seekBar2.getProgress() + " B:" + seekBar3.getProgress());
            }

            //사용자가 터치하여 썸을 끌기를 시작합니다.
            @Override
            public void onStartTrackingTouch(SeekBar seekBar){

            }

            //사용자가 손을 떼어 썸을 끌기를 중단했습니다.
            @Override
            public void onStopTrackingTouch(SeekBar seekBar){

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                //fromUser : 사용자가 변경한 경우는 true, 자바 코드로의 변경이 false입니다.
                //progress : 현재 위치값
                if(fromUser){
                    //두번째 매개 변수 int progress는 SeekBar의 값입니다.
                    view.setBackgroundColor(Color.argb(255, seekBar1.getProgress(), progress, seekBar3.getProgress()));
                }
                textView.setText("R:" + seekBar1.getProgress()
                        + " G:" + seekBar2.getProgress() + " B:" + seekBar3.getProgress());
            }

            //사용자가 터치하여 썸을 끌기를 시작합니다.
            @Override
            public void onStartTrackingTouch(SeekBar seekBar){

            }

            //사용자가 손을 떼어 썸을 끌기를 중단했습니다.
            @Override
            public void onStopTrackingTouch(SeekBar seekBar){

            }
        });

        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                //fromUser : 사용자가 변경한 경우는 true, 자바 코드로의 변경이 false입니다.
                //progress : 현재 위치값
                if(fromUser){
                    //두번째 매개 변수 int progress는 SeekBar의 값입니다.
                    view.setBackgroundColor(Color.argb(255, seekBar1.getProgress(), seekBar2.getProgress(), progress));
                }
                textView.setText("R:" + seekBar1.getProgress()
                        + " G:" + seekBar2.getProgress() + " B:" + seekBar3.getProgress());
            }

            //사용자가 터치하여 썸을 끌기를 시작합니다.
            @Override
            public void onStartTrackingTouch(SeekBar seekBar){

            }

            //사용자가 손을 떼어 썸을 끌기를 중단했습니다.
            @Override
            public void onStopTrackingTouch(SeekBar seekBar){

            }
        });
    }
}

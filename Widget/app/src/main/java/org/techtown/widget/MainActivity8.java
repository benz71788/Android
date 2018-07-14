package org.techtown.widget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {
    private ProgressBar mProgStatus;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        mProgStatus = (ProgressBar) findViewById(R.id.progStatus);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("기본: " + mProgStatus.getProgress()
                + "\n 2차: " + mProgStatus.getSecondaryProgress());
    }

    /*
        getProgress() : 현재 기본 진행값을 얻어 옵니다.
        setProgress() : 현재 기본 진행값을 설정합니다.

        getSecondaryProgress() : 현재 2차 진행값을 얻어 옵니다.
        setSecondaryProgress() : 현재 2차 진행값을 설정합니다.
     */

    public void mOnClick(View view){
        switch(view.getId()){
            case R.id.btnDecrease1:
                if(mProgStatus.getProgress() > 0){
                    mProgStatus.setProgress(mProgStatus.getProgress() - 5);
                }
                break;
            case R.id.btnIncrease1:
                if(mProgStatus.getProgress() < mProgStatus.getSecondaryProgress()){
                    mProgStatus.setProgress(mProgStatus.getProgress() + 5);
                }
                break;
            case R.id.btnDecrease2:
                if(mProgStatus.getProgress() < mProgStatus.getSecondaryProgress()){
                    mProgStatus.setSecondaryProgress(mProgStatus.getSecondaryProgress() - 5);
                }
                break;
            case R.id.btnIncrease2:
                if(mProgStatus.getSecondaryProgress() < mProgStatus.getMax()){
                    mProgStatus.setSecondaryProgress(mProgStatus.getSecondaryProgress() + 5);
                }
                break;
        }
        textView.setText("기본: " + mProgStatus.getProgress()
                + "\n 2차: " + mProgStatus.getSecondaryProgress());
    }
}

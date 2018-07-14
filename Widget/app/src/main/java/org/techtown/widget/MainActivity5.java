package org.techtown.widget;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity5 extends AppCompatActivity {
    private LinearLayout layoutMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        layoutMain = (LinearLayout) findViewById(R.id.layoutMain);

        //초록색을 선택합니다.
        int colorid = R.id.radioGreen;
        RadioGroup colorGroup = (RadioGroup) findViewById(R.id.groupColor);
        colorGroup.check(colorid);  //라디오 그룹에서 초록을 선택합니다.
        changeColor(colorid);
    }

    public void mOnClick(View view){
        changeColor(view.getId());
    }

    public void changeColor(int id){
        switch(id){
            case R.id.radioRed:
                layoutMain.setBackgroundColor(Color.RED);
                break;
            case R.id.radioGreen:
                layoutMain.setBackgroundColor(Color.GREEN);
                break;
            case R.id.radioBlue:
                layoutMain.setBackgroundColor(Color.BLUE);
                break;
        }
    }
}

package org.techtown.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    private CheckBox checkColor, checkBackground;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        textView = (TextView) findViewById(R.id.textview);
        checkColor = (CheckBox) findViewById(R.id.checkColor);
        checkBackground = (CheckBox) findViewById(R.id.checkBackground);
    }

    public void mOnClick(View view){
        // v.getId() : 뷰의 id 값을 리턴합니다.
        switch(view.getId()) {
            case R.id.checkColor:
                //isChecked : 체크 상태를 확인합니다.
                if (checkColor.isChecked()) {
                    //setTextColor() : 텍스트 색상을 변경합니다.
                    //0xaarrggbb : 앞 두자리는 알파값(투명도-00~ff(투명~불투명))(a),
                    //두 자리 r은 red, 두 자리 g은 green, 두 자리 b은 blue,
                    //알파값을 생략하면 (00)으로 인식되어 색상이 출력되지 않습니다.
                    textView.setTextColor(0xffff0000);
                } else {
                    textView.setTextColor(0xff000000);
                }
                break;
            case R.id.checkBackground:
                if (checkBackground.isChecked()) {
                    //textView.setBackgroundResource(리소스 아이디)로 뷰의 배경을 변경합니다.
                    textView.setBackgroundResource(R.drawable.dream01);
                } else {
                    //인자값으로 0을 사용하면 배경이 제거되는 효과를 가집니다.
                    textView.setBackgroundResource(0);
                }
        }
    }
}

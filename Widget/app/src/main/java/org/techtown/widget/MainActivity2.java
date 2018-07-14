package org.techtown.widget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void mOnClick(View view){
        String message = "";
        CheckedTextView textView = (CheckedTextView)(view);
        /*
            textView.isChecked() : 체크를 확인하는 메서드의 결과값으로
                                    체크 상태이면 true
                                    해제 상태이면 false 입니다.
            textView.setChecked(true) : 체크 상태로 만듭니다.
            textView.setChecked(false) : 체크 해제 상태로 만듭니다.
         */
        if(textView.isChecked()){
            textView.setChecked(false);
            message = " 해제";
        } else {
            textView.setChecked(true);
            message = " 선택";
        }
        Toast.makeText(MainActivity2.this, textView.getText().toString() + message, Toast.LENGTH_SHORT).show();
    }
}

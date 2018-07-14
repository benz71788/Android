package org.techtown.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity9 extends AppCompatActivity {
    private ImageView mImagePic1;
    private Button mbutton1 = null;
    private boolean flag = false;
    //액티비티 생성시 안드로이드 시스템은 자동으로 onCreate()메서드를 호출합니다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //슈퍼 클래스의 onCreate()메서드를 호출하여 기본 초기화를 합니다.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear9);
        mImagePic1 = (ImageView) findViewById(R.id.imagePic1);
        mbutton1 = (Button) findViewById(R.id.button1);
    }

    //첫 번째 그림 숨기기 - 토글
    public void mOnClick1(View v){
        //그림은 없어지지만 영역은 그대로 입니다.

        if(flag == false){
            mImagePic1.setVisibility(View.INVISIBLE);
            mbutton1.setText("첫 번째 그림 나오기");
            flag=true;
        } else {
            mImagePic1.setVisibility(View.VISIBLE);
            mbutton1.setText("첫 번째 그림 숨기기");
            flag=false;
        }

    }

    //첫 번째 그림 없애기
    public void mOnClick2(View v){
        //그림이 없어지고 영역도 사라집니다.
        mImagePic1.setVisibility(View.GONE);
    }
}

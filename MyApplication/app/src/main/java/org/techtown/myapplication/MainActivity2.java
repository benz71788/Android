package org.techtown.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
    액티비티 클래스는 Activity 클래스 또는 그 서브 클래스를 상속받아 정의합니다.
    AppCompatActivity클래스는 Activity의 서브 클래스로서 구 버전 디바이스에서도
    액션 바 기능을 사용할 수 있게 해 줍니다.
 */
public class MainActivity2 extends AppCompatActivity {
    private Button mbutton = null;
    private Button mbutton2 = null;
    //액티비티 생성시 안드로이드 시스템은 자동으로 onCreate()메서드를 호출합니다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //슈퍼 클래스의 onCreate()메서드를 호출하여 기본 초기화를 합니다.
        super.onCreate(savedInstanceState);

        /*
            - setContentView() : 액티비티 화면을 초기화합니다.
            - R.Layout.activity_main : res/layout/activity_main.xml 리소스를 가리킵니다.
            - R.클래스는 자바 코드에서 리소스를 참조할 때 사용되는 클래스로 안드로이드 스튜디오에서
                리소스를 추가하거나 기본 리소스를 변경하면 R 클래스는 자동으로 재생성됩니다.
            - 액티비티 화면을 정의하는 xml 파일을 레이아웃이라고 부릅니다.
         */
        setContentView(R.layout.activity_main2);

        //레이아웃에서 버튼 객체를 찾습니다.
        mbutton = (Button) findViewById(R.id.button2);
        mbutton2 = (Button) findViewById(R.id.button3);

        //button에 리스너를 등록합니다.
        mbutton.setOnClickListener(new MyOnClickListener(mbutton.getText().toString()));

        //button에 리스너를 등록합니다.
        mbutton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity2.this, mbutton2.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    class MyOnClickListener implements View.OnClickListener{
        String message = "";
        MyOnClickListener(String message){
            this.message = message;
        }

        @Override
        public void onClick(View v){
            //MainActivity2.this(외부 클래스 객체 참조 문법 : 외부클래스명.this)
            Toast.makeText(MainActivity2.this, message, Toast.LENGTH_SHORT).show();
        }
    }
}

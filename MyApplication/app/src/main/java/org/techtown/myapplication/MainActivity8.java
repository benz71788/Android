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

    액티비티 화면은 한 개 이상의 뷰(view)로 구성됩니다.
    뷰란 view 클래스 혹은 그 서브 클래스로 만들어진 객체를 의미합니다.
    activity_main.xml을 살펴 보면 ConstraintLayout, Button 엘리먼트가 있는 데 모두 view의
    서브 클래스 입니다.
    안드로이드 시스템은 setContentView()에 전달된 XML 리소스를 해석하여 자바 객체를 만들고
    이들을 계층적으로 구성하여 액티비티 화면을 초기화합니다.
*/
public class MainActivity8 extends AppCompatActivity {
    private Button mbutton = null;
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
        setContentView(R.layout.activity_main_linear8);

        //레이아웃에서 버튼 객체를 찾습니다.
        mbutton = (Button)findViewById(R.id.button4);
        mbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity8.this, "버튼클릭", Toast.LENGTH_SHORT);
            }
        });
    }
}

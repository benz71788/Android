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

    참고)https://developer.android.com/reference/android/view/ViewGroup

    참고)https://developer.android.com/reference/android/support/constraint/ConstraintLayout
        ConstraintLayout

        public class ConstraintLayout extends ViewGroup

        java.lang.Object
           ↳	android.view.View
               ↳	android.view.ViewGroup
                   ↳	android.support.constraint.ConstraintLayout

    참고)https://developer.android.com/reference/android/view/View

        Button

        public class Button extends TextView

        java.lang.Object
           ↳	android.view.View
               ↳	android.widget.TextView
                   ↳	android.widget.Button

    뷰는 다음과 같이 크게 두 종류로 나눌 수 있습니다.
    1. 레이아웃(Layout) : View Group의 서브 클래스로서 여러 개의 뷰('자식뷰')를 규칙대로 화면에 배치합니다.
    2. 위젯(Widget) : View 또는 View Group의 서브 클래스로서 단독으로 사용되며 고유한 모양과 기능을 갖습니다.

    ***** 도움말 보고 싶을 때 ******
    * 도움말 보고 싶은 대상으로 커서를 이동하고 Ctrl + Q 를 누르면 팝업 윈도우 형태로 신속하게
    * Ctrl + Q 대신 마우스 커서를 가져다 대기만 해도 팝업 윈도우 형태로 도움말 보기를 원한다면
        [File] - [Settings..] - [Edit] - [General]에서 'Show quick documentation on mouse move'를
        체크합니다.

    *** 자동 import ***
    File - Settings - Editor - General - Auto Imports
    Add unamebiguous imports on the fly
    Optimize imports on the fly
    체크합니다.
 */
public class MainActivity10 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main_linear10);

        //레이아웃에서 버튼 객체를 찾습니다.
        mbutton = (Button) findViewById(R.id.button);
    }

    /*
        버튼을 클릭했을 때 실행하는 메서드입니다.
        activity_main.xml에서 android:onClick="mOnClick"로 설정하면
        public void mOnclick(View view){ } 메서드를 작성하면 버튼을 클릭했을 때 실행합니다.

        컨텍스트(Context)란 일반적으로 어떤일이 발생한 상황을 의미하는데
        프로그래밍 언어에서는 객체의 정보를 담고 있는 객체를 의미하며
        안드로이드 UI 구성요소인 뷰에 대한 정보를 손쉽게 확인하거나 설정할 수 있도록 뷰의 생성자에
        Context 객체를 전달하도록 되어 있습니다. AppCompatActivity 클래스는 Context를 상속하므로
        이 클래스 안에서 this를 Context 객체로 사용할 수 있습니다.
     */
    public void mOnClick(View view){
        Toast.makeText(this, "버튼을 클릭 했습니다.", Toast.LENGTH_SHORT).show();
    }
}
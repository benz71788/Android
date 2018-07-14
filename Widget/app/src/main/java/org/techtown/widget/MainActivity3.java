package org.techtown.widget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        pass = (EditText) findViewById(R.id.editPassword);
    }

    public void mOnClick(View view){
        String message = "암호는 " + pass.getText().toString();
        if(message == null || message.equals("")){
            message = "암호를 입력하세요!";
        }
        Toast.makeText(MainActivity3.this, message, Toast.LENGTH_SHORT).show();
    }
}

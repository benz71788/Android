package org.techtown.framelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {
    private EditText editText;
    private boolean page = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        editText = (EditText) findViewById(R.id.editText1);

    }

    public void onButtonClicked(View view){
        Button button = (Button)(view);
        String message = button.getText().toString();
        editText.setText(message + " 하셨군요");
    }
}

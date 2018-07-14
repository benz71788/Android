package org.techtown.framelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity6 extends AppCompatActivity {
    private ImageView mImage1, mImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        mImage1 = (ImageView) findViewById(R.id.image01);
        mImage2 = (ImageView) findViewById(R.id.image02);

        mImage2.setVisibility(View.INVISIBLE);
    }

    public void onButtonClicked(View view){
        Button button = (Button)(view);
        String message = button.getText().toString();

        if(message.equals("UP")){
            mImage1.setVisibility(View.VISIBLE);
            mImage2.setVisibility(View.INVISIBLE);
        } else {
            mImage1.setVisibility(View.INVISIBLE);
            mImage2.setVisibility(View.VISIBLE);
        }
    }
}

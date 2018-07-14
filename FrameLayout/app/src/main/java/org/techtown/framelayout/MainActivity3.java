package org.techtown.framelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    private ImageView mImagePic1, mImagePic2;
    private Button mbutton = null;
    private boolean page = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mImagePic1 = (ImageView) findViewById(R.id.imageView);
        mImagePic2 = (ImageView) findViewById(R.id.imageView2);
    }

    public void onButtonClicked(View view){
        if(page == false){
            mImagePic1.setVisibility(View.VISIBLE);
            mImagePic2.setVisibility(View.INVISIBLE);
            page = true;
        } else{
            mImagePic1.setVisibility(View.INVISIBLE);
            mImagePic2.setVisibility(View.VISIBLE);
            page = false;
        }
    }
}

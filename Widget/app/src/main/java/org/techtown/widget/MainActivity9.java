package org.techtown.widget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity {
    private RatingBar ratingVote;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        ratingVote = (RatingBar) findViewById(R.id.ratingVote);
        btnResult = (Button) findViewById(R.id.btnResult);
    }

    public void mOnClick(View view){
        switch(view.getId()){
            case R.id.btnDec:
                ratingVote.incrementProgressBy(-1);
                break;
            case R.id.btnInc:
                ratingVote.incrementProgressBy(1);
                break;
            case R.id.btnResult:
                //getRating 메서드로 현재의 평점을 얻어옵니다.
                Toast.makeText(this, "현재값 = " + ratingVote.getRating(),
                        Toast.LENGTH_LONG).show();
                break;
        }
    }
}

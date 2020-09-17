package com.example.countdowntimer25082020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnStart;
    ImageView mImg;
    boolean mIsRunning = false;
    int[] mArrayImages;
    int mCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnStart = findViewById(R.id.buttonStart);
        mImg = findViewById(R.id.imageView);

        mArrayImages = new int[]{
                R.drawable.hinh1,
                R.drawable.hinh2,
                R.drawable.hinh3,
                R.drawable.hinh4,
                R.drawable.hinh5,
        };

        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mIsRunning){
                    CountDownTimer countDownTimer = new CountDownTimer(5200, 1000) {
                        @Override
                        public void onTick(long l) {
                            if ( l > 1000){
                                mImg.setImageResource(mArrayImages[mCount++]);
                            }
                        }

                        @Override
                        public void onFinish() {

                        }
                    };
                    countDownTimer.start();
                }
            }
        });
    }
}
package com.example.naloga5;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    public static final String EXTRA_COUNTER = "COUNTER_VALUE";
    private int counterValue = 0;
    private GestureDetector gestureDetector;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        View mainView = findViewById(R.id.main);
        counterValue = getIntent().getIntExtra(EXTRA_COUNTER, 0);

        TextView tvCounter = findViewById(R.id.tv_counter_third);
        if (tvCounter != null) {
            tvCounter.setText(String.valueOf(counterValue));
        }

        Button btnToMain = findViewById(R.id.btn_third_to_main);
        if (btnToMain != null) {
            btnToMain.setOnClickListener(v -> navigateToMain());
        }

        Button btnToHello = findViewById(R.id.btn_third_to_hello);
        if (btnToHello != null) {
            btnToHello.setOnClickListener(v -> navigateToHello());
        }

        gestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
            private static final int SWIPE_THRESHOLD = 100;
            private static final int SWIPE_VELOCITY_THRESHOLD = 100;

            @Override
            public boolean onFling(@Nullable MotionEvent e1, @Nullable MotionEvent e2, float velocityX, float velocityY) {
                if (e1 == null || e2 == null) return false;
                float diffX = e2.getX() - e1.getX();
                float diffY = e2.getY() - e1.getY();

                if (Math.abs(diffX) > Math.abs(diffY)) {
                    if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                        if (diffX < 0) {
                            // Poteg proti levi (Swipe Left) -> Prehod na 1. aktivnost (MainActivity)
                            navigateToMain();
                        } else {
                            // Poteg proti desni (Swipe Right) -> Prehod na 2. aktivnost (HelloActivity)
                            navigateToHello();
                        }
                        return true;
                    }
                }
                return false;
            }

            @Override
            public boolean onDown(@Nullable MotionEvent e) {
                return true;
            }
        });

        if (mainView != null) {
            mainView.setOnTouchListener((v, event) -> gestureDetector.onTouchEvent(event));
        }
    }

    private void navigateToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        finish();
    }

    private void navigateToHello() {
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra(EXTRA_COUNTER, counterValue);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (gestureDetector != null && gestureDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }
}
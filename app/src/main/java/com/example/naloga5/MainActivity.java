package com.example.naloga5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_COUNTER = "COUNTER_VALUE";
    private static final String KEY_COUNTER = "KEY_COUNTER";

    private int count = 0;
    private TextView tvCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(KEY_COUNTER, 0);
        }

        tvCounter = findViewById(R.id.tv_counter);
        if (tvCounter != null) {
            tvCounter.setText(String.valueOf(count));
        }

        Button btnCount = findViewById(R.id.btn_count);
        if (btnCount != null) {
            btnCount.setOnClickListener(v -> {
                count++;
                if (tvCounter != null) {
                    tvCounter.setText(String.valueOf(count));
                }
            });
        }

        Button btnActivity2 = findViewById(R.id.btn_activity2);
        if (btnActivity2 != null) {
            btnActivity2.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, HelloActivity.class);
                intent.putExtra(EXTRA_COUNTER, count);
                startActivity(intent);
            });
        }

        Button btnActivity3 = findViewById(R.id.btn_activity3);
        if (btnActivity3 != null) {
            btnActivity3.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra(EXTRA_COUNTER, count);
                startActivity(intent);
            });
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNTER, count);
    }
}
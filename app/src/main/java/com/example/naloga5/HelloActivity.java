package com.example.naloga5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {

    public static final String EXTRA_COUNTER = "COUNTER_VALUE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        int counterValue = getIntent().getIntExtra(EXTRA_COUNTER, 0);

        TextView tvCounter = findViewById(R.id.tv_counter_hello);
        if (tvCounter != null) {
            tvCounter.setText(String.valueOf(counterValue));
        }

        Button btnBackMain = findViewById(R.id.btn_back_main);
        if (btnBackMain != null) {
            btnBackMain.setOnClickListener(v -> {
                Intent intent = new Intent(this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                finish();
            });
        }
    }
}
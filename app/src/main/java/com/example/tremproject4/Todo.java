package com.example.tremproject4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Todo extends AppCompatActivity {

    private Button backButton;
    private Button writeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo);

        backButton = findViewById(R.id.button3_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        writeButton = findViewById(R.id.button);
        writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalActivity();
            }
        });
    }

    public void openCalActivity() {
        Intent intent = new Intent(this, Cal.class);
        startActivity(intent);
    }
}

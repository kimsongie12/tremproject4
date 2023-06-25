package com.example.tremproject4;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Diary extends AppCompatActivity {

    private Button newButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary);

        newButton = findViewById(R.id.button);
        backButton = findViewById(R.id.button2_back);

        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // "새로 만들기" 버튼을 클릭하면 DiaryOne 액티비티를 시작합니다.
                Intent intent = new Intent(Diary.this, Diaryone.class);
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // "뒤로가기" 버튼을 클릭하면 Diary 액티비티를 종료하고 이전 액티비티로 돌아갑니다.
                finish();
            }
        });
    }
}

package com.example.tremproject4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Oneday extends AppCompatActivity {

    private EditText editTextMemo;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oneday);

        editTextMemo = findViewById(R.id.editTextMemo);
        buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveMemo();
            }
        });
    }

    private void saveMemo() {
        String memo = editTextMemo.getText().toString().trim();

        if (!memo.isEmpty()) {
            // 여기에 저장 작업을 수행합니다.
            // 예를 들어, 메모를 데이터베이스나 파일에 저장할 수 있습니다.

            Toast.makeText(this, "메모가 저장되었습니다!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "메모를 입력해주세요", Toast.LENGTH_SHORT).show();
        }
    }
}


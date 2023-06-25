package com.example.tremproject4;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Oneyear extends AppCompatActivity {

    private EditText editTextMemo;
    private Button buttonSave;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oneyear);

        editTextMemo = findViewById(R.id.editTextMemo);
        buttonSave = findViewById(R.id.buttonSave);

        // SharedPreferences 객체를 초기화합니다.
        sharedPreferences = getSharedPreferences("MemoPrefs", MODE_PRIVATE);

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
            // 메모를 SharedPreferences에 저장합니다.
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("memo", memo);
            editor.apply();

            Toast.makeText(this, "메모가 저장되었습니다!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "메모를 입력해주세요", Toast.LENGTH_SHORT).show();
        }
    }
}

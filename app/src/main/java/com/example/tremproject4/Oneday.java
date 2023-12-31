package com.example.tremproject4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Oneday extends AppCompatActivity {

    private DatePicker datePicker;
    private EditText editTextMemo;
    private Button buttonSave;

    private Calendar selectedDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oneday);

        datePicker = findViewById(R.id.datePicker);
        editTextMemo = findViewById(R.id.editTextMemo);
        buttonSave = findViewById(R.id.buttonSave);

        // 현재 날짜로 DatePicker 초기화
        selectedDate = Calendar.getInstance();
        datePicker.init(selectedDate.get(Calendar.YEAR), selectedDate.get(Calendar.MONTH), selectedDate.get(Calendar.DAY_OF_MONTH), null);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveMemo();
            }
        });
    }

    private void saveMemo() {
        // 선택한 날짜 가져오기
        int year = datePicker.getYear();
        int month = datePicker.getMonth();
        int day = datePicker.getDayOfMonth();

        // 선택한 메모 가져오기
        String memo = editTextMemo.getText().toString().trim();

        if (!memo.isEmpty()) {
            // 여기에 저장 작업을 수행합니다.
            // 예를 들어, 메모와 선택한 날짜를 데이터베이스나 파일에 저장할 수 있습니다.

            String date = year + "년 " + (month + 1) + "월 " + day + "일";
            String message = "날짜: " + date + "\n메모: " + memo;

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "메모를 입력해주세요", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.tremproject4;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cal extends AppCompatActivity {

    private LinearLayout checklistLayout;
    private CheckBox checkBoxItem1;
    private CheckBox checkBoxItem2;
    // 필요한 만큼 CheckBox 변수를 추가하세요

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal);

        // 달력 관련 요소
        TextView textViewCalendarTitle = findViewById(R.id.textViewCalendarTitle);
        CalendarView calendarView = findViewById(R.id.calendarView);

        // 체크리스트 관련 요소
        TextView textViewChecklistTitle = findViewById(R.id.textViewChecklistTitle);
        checkBoxItem1 = findViewById(R.id.checkBoxItem1);
        checkBoxItem2 = findViewById(R.id.checkBoxItem2);
        //checklistLayout = findViewById(R.id.checklistLayout); // checklistLayout 초기화

        // 필요한 만큼 CheckBox 변수를 초기화하세요

        // 필요한 만큼 체크리스트 항목을 추가하세요
        addChecklistItem("항목 1");
        addChecklistItem("항목 2");
    }

    private void addChecklistItem(String text) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(text);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(0, 0, 0, 16); // 항목 간의 간격 조정
        checkBox.setLayoutParams(layoutParams);
        checklistLayout.addView(checkBox);
    }
}

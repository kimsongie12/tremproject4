package com.example.tremproject4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 클릭 시 다이얼로그를 표시합니다.
                showOptionsDialog();
            }
        });


    }

    private void showOptionsDialog() {
        // 다이얼로그를 생성합니다.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("선택지"); // 다이얼로그 제목을 설정합니다.

        // 선택지 배열을 생성합니다.
        final String[] options = {"일기작성", "Todolist", "목표설정"};

        // 다이얼로그에 선택지 배열을 설정합니다.
        builder.setItems(options, (dialog, which) -> {
            // 선택지를 클릭했을 때의 동작을 처리합니다.
            String selectedOption = options[which];
            if (selectedOption.equals("일기작성")) {
                // 옵션 1이 선택되면 Diary 액티비티로 이동합니다.
                Intent intent = new Intent(MainActivity.this, Diary.class);
                startActivity(intent);
            } else if (selectedOption.equals("Todolist")) {
                // 옵션 2이 선택되면 추가 동작을 수행합니다.
                Intent intent = new Intent(MainActivity.this, Todo.class);
                startActivity(intent);
            } else if (selectedOption.equals("목표설정")) {
                // 옵션 3이 선택되면 Plan 액티비티로 이동합니다.
                Intent intent = new Intent(MainActivity.this, Plan.class);
                startActivity(intent);
            }
        });



        // 다이얼로그를 표시합니다.
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}

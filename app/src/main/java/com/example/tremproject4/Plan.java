package com.example.tremproject4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.content.DialogInterface;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Plan extends AppCompatActivity {

    private Button backButton;
    private Button goalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan);

        backButton = findViewById(R.id.button4_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        goalButton = findViewById(R.id.button2);
        goalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showOptionsDialog();
            }
        });
    }

    private void showOptionsDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("선택지");

        final String[] options = {"하루 목표", "1년 목표"};

        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                String selectedOption = options[which];
                if (selectedOption.equals("하루 목표")) {
                    Intent intent = new Intent(Plan.this, Oneday.class);
                    startActivity(intent);
                } else if (selectedOption.equals("1년 목표")) {
                    Intent intent = new Intent(Plan.this, Oneyear.class);
                    startActivity(intent);
                }
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}

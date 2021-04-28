package com.example.pdfbookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button motivationalButton, javaButton, pythonButton, dsaButton, oopButton, mysqlButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        motivationalButton = (Button) findViewById(R.id.motivationalButton);
        javaButton = (Button) findViewById(R.id.javaButton);
        pythonButton = (Button) findViewById(R.id.pythonButton);
        dsaButton = (Button) findViewById(R.id.dsaButton);
        oopButton = (Button) findViewById(R.id.oopButton);
        mysqlButton = (Button) findViewById(R.id.mysqlButton);

        motivationalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMotivationalBook = new Intent(MainActivity.this, MotivationalBookActivity.class);
                startActivity(intentMotivationalBook);
            }
        });

        javaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentJavaBook = new Intent(MainActivity.this, JavaBookPdf.class);
                startActivity(intentJavaBook);
            }
        });

        pythonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPythonBook = new Intent(MainActivity.this, PythonBookActivity.class);
                startActivity(intentPythonBook);
            }
        });

        dsaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDSABook = new Intent(MainActivity.this, DSABookPdf.class);
                startActivity(intentDSABook);
            }
        });
        oopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentOOPBook = new Intent(MainActivity.this, OopBookPdf.class);
                startActivity(intentOOPBook);
            }
        });

        mysqlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMysqlBook = new Intent(MainActivity.this, MysqlBookPdf.class);
                startActivity(intentMysqlBook);
            }
        });














    }
}
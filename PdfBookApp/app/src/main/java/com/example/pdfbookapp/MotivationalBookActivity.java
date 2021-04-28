package com.example.pdfbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MotivationalBookActivity extends AppCompatActivity {

    PDFView motivationalBookPdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivational_book);

        motivationalBookPdf = (PDFView) findViewById(R.id.motivationalBookPdf);
        motivationalBookPdf.fromAsset("motivational.pdf").load();
    }
}
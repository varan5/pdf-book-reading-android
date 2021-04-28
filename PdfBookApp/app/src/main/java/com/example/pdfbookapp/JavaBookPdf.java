package com.example.pdfbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class JavaBookPdf extends AppCompatActivity {

    PDFView javaBookPdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_book_pdf);

        javaBookPdf = (PDFView) findViewById(R.id.javaBookPdf);
        javaBookPdf.fromAsset("java.pdf").load();
    }
}
package com.example.pdfbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class OopBookPdf extends AppCompatActivity {

    PDFView oopBookPdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop_book_pdf);

        oopBookPdf = (PDFView) findViewById(R.id.oopBookPdf);
        oopBookPdf.fromAsset("oop.pdf").load();
    }
}
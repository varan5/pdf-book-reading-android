package com.example.pdfbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DSABookPdf extends AppCompatActivity {

    PDFView dsaBookPdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_s_a_book_pdf);

        dsaBookPdf = (PDFView) findViewById(R.id.dsaBookPdf);
        dsaBookPdf.fromAsset("dsa.pdf").load();
    }
}
package com.example.pdfbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PythonBookActivity extends AppCompatActivity {

    PDFView pythonBookPdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_book);

        pythonBookPdf = (PDFView) findViewById(R.id.pythonBookPdf);

        pythonBookPdf.fromAsset("python.pdf").load();

    }
}
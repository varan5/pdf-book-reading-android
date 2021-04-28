package com.example.pdfbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MysqlBookPdf extends AppCompatActivity {

    PDFView mysqlBookPdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysql_book_pdf);

        mysqlBookPdf = (PDFView) findViewById(R.id.mysqlBookPdf);
        mysqlBookPdf.fromAsset("mysql.pdf").load();
    }
}
package com.example.htmleditor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    WebView myWeb;
    Button btn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myWeb =(WebView)findViewById(R.id.myweb);
        btn_Back =(Button)findViewById(R.id.btn_Back);

        myWeb.getSettings().setJavaScriptEnabled(true);
        myWeb.loadData(MyVar.strHTML,"text/html; charset=utf-8",null);

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}

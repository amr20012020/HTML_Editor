package com.example.htmleditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtHTML;
    Button btn_New;
    Button btn_Run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();

        txtHTML =(EditText)findViewById(R.id.txtHTML);
        btn_New =(Button)findViewById(R.id.btn_NEW);
        btn_Run =(Button)findViewById(R.id.btn_RUN);

        String strStartHtml = "" +
              "<!DOCTYPE html>\n" +
               "<html>\n" +
                "<head>\n" +
                "    <title>Index</title>\n " +
                "</head>\n" +
                "<body>\n" +
                "     <div>\n" +
                "          \n" +
                "      </div>\n" +
                "</body>\n" +
                "</html>";

        txtHTML.setText(strStartHtml);

         final Intent MyAct = new Intent(this,Main2Activity.class);
         btn_Run.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 MyVar.strHTML = txtHTML.getText() + "";
                 startActivity(MyAct);
             }
         });

         btn_New.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String strNewHTML = "" +
                         "<html>\n" +
                         " <head>\n" +
                         "  </head>\n" +
                         "    <body>\n" +
                         "     \n" +
                         "    </body>\n" +
                         " </html>";

                 txtHTML.setText(strNewHTML);
             }
         });




    }
}

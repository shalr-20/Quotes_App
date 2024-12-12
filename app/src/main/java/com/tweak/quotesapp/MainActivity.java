package com.tweak.quotesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button sh;
    TextView qu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        sh=findViewById(R.id.share);
        qu=findViewById(R.id.quote);

        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sharetext=qu.getText().toString();
                Intent sendInt=new Intent();
                sendInt.setAction(Intent.ACTION_SEND);  //intent is for sending some data with other apps

                sendInt.setType("text/plain");  //intent will send plain text
                sendInt.putExtra(Intent.EXTRA_TEXT,sharetext);  //specifies the actual text to send

                startActivity(sendInt);
            }
        });

    }
}
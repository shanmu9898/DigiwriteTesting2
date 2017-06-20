package com.mukesh.android.digiwritetesting2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    EditText textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView = (EditText) findViewById(R.id.textView);
        String string = getIntent().getStringExtra("string");
        textView.setText(string);

    }
}

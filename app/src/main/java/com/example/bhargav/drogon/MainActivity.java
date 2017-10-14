package com.example.bhargav.drogon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView iv;
    private EditText et;
    private Button bt;
    private int a;
    public static int bin;
    private static final String TAG = "Mainactivity";

    public String dec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView)findViewById(R.id.image123);
        et = (EditText)findViewById(R.id.text123);
        bt = (Button)findViewById(R.id.button123);
        Log.i(TAG, String.valueOf(Integer.parseInt(et.getText().toString())));
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dec = et.getText().toString();
                Intent inten = new Intent(MainActivity.this,ShowBinary.class);
                inten.putExtra("Hello",dec);
                startActivity(inten);
            }
        });


    }



    }




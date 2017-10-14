package com.example.bhargav.drogon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ShowBinary extends AppCompatActivity {
    public TextView tv;
    private int a;
    private String c;
    public static String  bin;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_binary);
        tv=(TextView) findViewById(R.id.text1234);

        c=getIntent().getExtras().getString("Hello");
        a =Integer.parseInt(c);
        //bin = convert(a);

        if(a==0)
        {
            bin="000";
        }
        else if(a==1) {
            bin = "0001";
        }
        else if(a==2) {
            bin = "0010";
        }
        else if(a==3) {
            bin = "0011";
        }
        else if(a==4) {
            bin = "0100";
        }
        else if(a==5) {
            bin = "0101";
        }
        else if(a==6) {
            bin = "0110";
        }
        else if(a==7) {
            bin = "0111";
        }
        else if(a==8) {
            bin = "1000";
        }
        else
        {
            Toast.makeText(ShowBinary.this,"helo",Toast.LENGTH_LONG).show();
        }

        tv.setText(bin);
    }
    /*public int convert(int dec)
    {
        int ctr,i,j,k,n = 0;
        int a[] = new int[10000];
        int b[] = new int[10000];

        ctr=1;
        i=0;
        while(dec!=0)
        {
            a[i]=dec%2;
            dec=dec/2;
            i++;
            ctr++;
        }
        k=0;
        while(k<i)
        {
            n=n*10+a[k];
            k++;
        }
        return n;
    }*/
}


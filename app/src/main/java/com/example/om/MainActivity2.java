package com.example.om;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    TextView tv1,tv2,tv3,tv4;
    String string1,string2,string3,string4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1=findViewById(R.id.ToActivity);
        string1=getIntent().getExtras().getString("to_value");
        tv1.setText(string1);
        tv2=findViewById(R.id.FromActivity);
        string2=getIntent().getExtras().getString("from_value");
        tv2.setText(string2);
        tv3=findViewById(R.id.HeadingActivity);
        string3=getIntent().getExtras().getString("heading_value");
        tv3.setText(string3);
        tv4=findViewById(R.id.MessageActivity);
        string4=getIntent().getExtras().getString("message_value");
        tv4.setText(string4);
    }
}
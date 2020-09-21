package com.example.om;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText from,to,heading,message;
    String st1,st2,st3,st4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.buttonOne);//using the id's of view from XML code
        from= (EditText) findViewById(R.id.from);
        to= (EditText) findViewById(R.id.to);
        heading= (EditText) findViewById(R.id.heading);
        message= (EditText) findViewById(R.id.message);

        btn.setOnClickListener(new View.OnClickListener()  //attaching OnClick listener to Create button
        {
            @Override
            public void onClick(View view)           //Get the data and use it
            {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                st1=from.getText().toString();                           //getting text from EditText
                st2=to.getText().toString();
                st3=heading.getText().toString();
                st4=message.getText().toString();
                i.putExtra( "from_value",st1);//to pass information to Activity2
                i.putExtra( "to_value",st2);
                i.putExtra( "heading_value",st3);
                i.putExtra( "message_value",st4);
                startActivity(i);
                finish();
            }
        });
            }

}

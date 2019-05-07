package com.example.ex03_09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class EX03_09_1 extends AppCompatActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        /* apply mylayout.xml Layout */
        setContentView(R.layout.my_layout);
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                /* new an intent with class to be active */
                Intent intent = new Intent();
                intent.setClass(EX03_09_1.this, MainActivity.class);
                startActivity(intent);
                /* 关闭原本的Activity */
                EX03_09_1.this.finish();
            }   /* end of onClick()  */
        } /* end of Button.OnClickListener() */ ) ;
    }  /* end of onCreate()  */

    public void ChangeColor(View v){
        TextView txv = findViewById(R.id.textView2);
        txv.setTextColor( getResources().getColor(R.color.colorText2));
    }
}  /* end of class EX03_10  */


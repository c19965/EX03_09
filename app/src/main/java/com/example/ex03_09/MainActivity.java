package com.example.ex03_09;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button3);

        b1.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                /* new an Intent with a designated class */
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, EX03_09_1.class);
                /* 调用一个新的Activity */
                startActivity(intent);
                /* 关闭原本的Activity */
                MainActivity.this.finish();
            }   /* end of onClick()  */
        } /* end of Button.OnClickListener() */ ) ;



    }

    public void ChangeColor(View v){
        TextView txv = findViewById(R.id.textView1);
        Random x = new Random();
        int rand = x.nextInt(3);
        switch (rand){
            case 0:
                txv.setTextColor( getResources().getColor(R.color.colorText));
                break;
             case 1:
                txv.setTextColor( getResources().getColor(R.color.colorText2));
                break;
            case 2:
                txv.setTextColor( getResources().getColor(R.color.colorText3));
                break;
        }

    }
}

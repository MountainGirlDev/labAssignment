package com.example.assignmentlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textview.MaterialTextView;

public class MainActivity3 extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    Button btn;
    static int start=0,resume=0,create=0,restart=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        create++;
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        btn=findViewById(R.id.btn);
        tv4.setText("onRestart is called: "+restart);
        tv3.setText("onResume is called: "+resume);
        tv2.setText("onStart is called: "+start);
        tv1.setText("onCreate is called: "+create);
        Log.i("key","oncreate is called");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity3.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
    protected void onStart(){
        super.onStart();
        start++;
        tv2.setText("onStart is called: "+start);
        Log.i("key","onstart is called");

    }
    protected void onResume(){
        super.onResume();
        resume++;
        tv3.setText("onResume is called: "+resume);
        Log.i("key","onresume is called");

    }
    protected void onRestart(){
        super.onRestart();
        restart++;
        tv4.setText("onRestart is called: "+restart);
        Log.i("key","onrestart is called");

    }
    protected void onPause(){
        super.onPause();
        Log.i("key","onpause is called");


    }
    protected void onStop(){
        super.onStop();
        Log.i("key","onstop is called");


    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i("key","ondestroy is called");


    }
}




package com.example.rahul.csit551_w2_demo1;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.rahul.csit551_w2_demo1.utils.Utils.APP_TAG;

public class MainActivity extends AppCompatActivity {

   private TextView textView1,textView2;
    private Button btn1;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.btn1_act1);
        btn2=(Button)findViewById(R.id.btn2_act1) ;
        textView1=(TextView)findViewById(R.id.text1_act1) ;
        textView2=(TextView)findViewById(R.id.text2_act1) ;
        btn1.setOnClickListener(new Mylstr());

        Log.i(APP_TAG,"use this >> onCreate >>method");
//        btn1.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                textView.setText("Text Changed");
//            }
//        });

    }

//    public void changeText2(View view) {
//        textView2.setText("Another");
//    }


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.i(APP_TAG,"use this >> onCreate >>method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(APP_TAG,"use this >> onResume >>method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(APP_TAG,"use this >> onStop >>method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(APP_TAG,"use this >> onDestroy >>method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(APP_TAG,"use this >> onRestart >>method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(APP_TAG,"use this >> onCreate >>method");
    }


    class Mylstr implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.btn1_act1) {
                textView1.setText(getString(R.string.label1));
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
            else if(view.getId()==R.id.btn2_act1)
                textView2.setText("Another");
        }
    }
//    public void changetext(View view) {
//        btn1=(Button)findViewById(R.id.btn_act1);
//        textView=(TextView)findViewById(R.id.text1_act1) ;
//        btn1.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                textView.setText("Text Changed");
//            }
//        });
//    }
}

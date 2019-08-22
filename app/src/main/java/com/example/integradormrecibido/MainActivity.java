package com.example.integradormrecibido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private MsmRecibido mr;
    @Override

    protected void onResume() {
        super.onResume();
        this.mr=new MsmRecibido();
        registerReceiver(this.mr,new IntentFilter("android.intent.action.AIRPLANE_MODE"));}
    /* Log.d("ewe","mensaje Onresume");*/


    @Override
    protected void onPause(){
        unregisterReceiver(mr);
        super.onPause();
        Log.d("ewe","mensaje Pausa");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ewe","mensaje app  Iniciada");
    }
}

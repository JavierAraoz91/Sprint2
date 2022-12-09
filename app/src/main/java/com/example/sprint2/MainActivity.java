package com.example.sprint2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Context contexto1;
    Context contexto2;
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btnIniciar);
        btn2=findViewById(R.id.btnRegistrar);
        contexto1=getApplicationContext();
        btn1.setOnClickListener(rolActivity);
        btn2.setOnClickListener(registroActivity);
    }

    @Override
    public void onClick(View view) {

    }
    private View.OnClickListener rolActivity=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent int1= new Intent(contexto1, rolActivity.class);
            startActivity(int1);
        }
    };
    private View.OnClickListener registroActivity=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent int2= new Intent(contexto1, registroActivity.class);
            startActivity(int2);
        }
    };
}
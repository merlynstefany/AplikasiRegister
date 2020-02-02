package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView slotUsername;
    private TextView slotPassword;
    private TextView slotNegara;
    private TextView slotHp;
    private TextView slotJk;

    private String username;
    private String password;
    private String negara;
    private String hp;
    private String jk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        slotUsername=findViewById(R.id.input_username);
        slotPassword=findViewById(R.id.input_password);
        slotNegara=findViewById(R.id.input_negara);
        slotHp=findViewById(R.id.input_hp);
        slotJk=findViewById(R.id.input_jk);

        Intent intent= getIntent();
        username=intent.getStringExtra(MainActivity.USERNAME);
        password=intent.getStringExtra(MainActivity.PASSWORD);
        negara=intent.getStringExtra(MainActivity.NEGARA);
        hp=intent.getStringExtra(MainActivity.HP);
        jk=intent.getStringExtra(MainActivity.JK);

        slotUsername.setText(username);
        slotPassword.setText(password);
        slotNegara.setText(negara);
        slotHp.setText(hp);
        slotJk.setText(jk);


    }
}

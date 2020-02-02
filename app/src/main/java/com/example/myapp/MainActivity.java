package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private Button submitButton;
    private EditText usernamementah;
    private String usernameAsli;
    private EditText passwordMentah;
    private String passwordAsli;
    private EditText negaraMentah;
    private String negaraAsli;
    private EditText hpMentah;
    private String hpAsli;
    private String jenisKelamin;
    public static final String USERNAME = "USERNAME";
    public static final String PASSWORD = "PASSWORD";
    public static final String NEGARA = "NEGARA";
    public static final String HP = "HP";
    public static final String JK = "JK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton=findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usernamementah=findViewById(R.id.input_username);
                usernameAsli=usernamementah.getText().toString();
                passwordMentah=findViewById(R.id.input_password);
                passwordAsli=passwordMentah.getText().toString();
                negaraMentah=findViewById(R.id.input_negara);
                negaraAsli=negaraMentah.getText().toString();
                hpMentah=findViewById(R.id.input_hp);
                hpAsli=hpMentah.getText().toString();

                Intent intent= new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra(USERNAME,usernameAsli);
                intent.putExtra(PASSWORD,passwordAsli);
                intent.putExtra(NEGARA,negaraAsli);
                intent.putExtra(HP,hpAsli);
                intent.putExtra(JK,jenisKelamin);
                startActivity(intent);
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.input_pria:
                if (checked)
                    jenisKelamin = "Pria";
                break;
            case R.id.input_wanita:
                if (checked)
                    jenisKelamin = "Wanita";
                break;
        }
    }
}

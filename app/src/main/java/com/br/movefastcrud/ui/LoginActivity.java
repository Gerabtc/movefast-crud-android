package com.br.movefastcrud.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.br.movefastcrud.R;
import com.br.movefastcrud.ui.HomeActivity;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText tLogin = (EditText) findViewById(R.id.username1);
                EditText tSenha = (EditText) findViewById(R.id.password1);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if (login.equals("admin") && senha.equals("1234")) {
                    alert(("Login realizado com sucesso"));
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);
                } else {
                    alert("Login ou senha incorretos");
                }
            }

        });
    }

    private void alert(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

}
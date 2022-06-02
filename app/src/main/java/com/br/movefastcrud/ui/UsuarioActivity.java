package com.br.movefastcrud.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.br.movefastcrud.database.DBHelper;
import com.br.movefastcrud.R;

public class UsuarioActivity extends AppCompatActivity {

    EditText username, password, repassword;
    Button btn_registrar;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        Button btn_registrar = (Button) findViewById(R.id.btn_registrar);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText tLogin = (EditText) findViewById(R.id.username);
                EditText tSenha = (EditText) findViewById(R.id.password);
                EditText tConfirmaSenha = (EditText) findViewById(R.id.repassword);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                String confirmaSenha = tConfirmaSenha.getText().toString();

                if (login.equals("admin") && senha.equals("1234") && confirmaSenha.equals("1234")) {
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


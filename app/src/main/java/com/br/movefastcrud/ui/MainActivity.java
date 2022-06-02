package com.br.movefastcrud.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.br.movefastcrud.ui.UsuarioActivity;
import com.br.movefastcrud.ui.LoginActivity;
import com.br.movefastcrud.R;

public class MainActivity extends AppCompatActivity {

    Button cadastrar_btn, entrar_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadastrar_btn=findViewById(R.id.cadastrar_btn);
        entrar_btn=findViewById(R.id.entrar_btn);

        entrar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLoginActivity();
            }
        });

        cadastrar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startUsuarioActivity();
            }
        });
    }

    private void startLoginActivity() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    private void startUsuarioActivity() {
        Intent intent = new Intent (MainActivity.this, UsuarioActivity.class);
        startActivity(intent);

    }

}
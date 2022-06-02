package com.br.movefastcrud.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.br.movefastcrud.ui.CadastroPacoteEnviarActivity;
import com.br.movefastcrud.R;

public class HomeActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Pacotes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setTitle(TITULO_APPBAR);

        Button btn_enviar= (Button) findViewById(R.id.btn_enviar);
        Button btn_transportar= (Button) findViewById(R.id.btn_transportar);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startCadastroPacoteEnviarActivity();
            }
        });

        btn_transportar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartListaPacotesActivity();
            }
        });
    }

    private void StartListaPacotesActivity() {
        Intent intent = new Intent(HomeActivity.this, ListaPacotesActivity.class);
        startActivity(intent);
    }

    private void startCadastroPacoteEnviarActivity() {
        Intent intent = new Intent(HomeActivity.this, CadastroPacoteEnviarActivity.class);
        startActivity(intent);
    }
}
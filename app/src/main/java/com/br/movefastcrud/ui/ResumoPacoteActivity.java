package com.br.movefastcrud.ui;

import static com.br.movefastcrud.ui.ConstantesActivities.CHAVE_PACOTE;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.br.movefastcrud.R;
import com.br.movefastcrud.model.Pacote;
import com.br.movefastcrud.util.DataUtil;
import com.br.movefastcrud.util.DiasUtil;
import com.br.movefastcrud.util.MoedaUtil;
import com.br.movefastcrud.util.ResourceUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ResumoPacoteActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Resumo do pacote";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);
        setTitle(TITULO_APPBAR);
        carregaPacoteRecebido();
    }

    private void carregaPacoteRecebido() {
        Intent intent = getIntent();
        if (intent.hasExtra(CHAVE_PACOTE)) {
            final Pacote pacote = (Pacote) intent.getSerializableExtra(CHAVE_PACOTE);
            inicializaCampos(pacote);
            configuraBotao(pacote);
        }
    }

    private void configuraBotao(Pacote pacote) {
        Button botaoRealizaPagamento = findViewById(R.id.resumo_pacote_botao_realiza_pagamento);
        botaoRealizaPagamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vaiParaPagamento(pacote);
            }
        });
    }

    private void vaiParaPagamento(Pacote pacote) {
        Intent intent = new Intent(ResumoPacoteActivity.this,
                PagamentoActivity.class);
        intent.putExtra(CHAVE_PACOTE, pacote);
        startActivity(intent);
    }

    private void inicializaCampos(Pacote pacote) {
        mostraLocal(pacote);
        mostraImagem(pacote);
        mostraDias(pacote);
        mostraPreco(pacote);
        mostraData(pacote);
    }

    private void mostraData(Pacote pacote) {
        TextView data = findViewById(R.id.resumo_pacote_data);
        String dataFormataDoPacote = DataUtil.periodoEmTexto(pacote.getDias());
        data.setText(dataFormataDoPacote);
    }

    private void mostraPreco(Pacote pacote) {
        TextView preco = findViewById(R.id.resumo_pacote_preco);
        String moedaBrasileira = MoedaUtil
                .formataParaBrasileiro(pacote.getPreco());
        preco.setText(moedaBrasileira);
    }

    private void mostraDias(Pacote pacote) {
        TextView dias = findViewById(R.id.resumo_pacote_dias);
        String diasEmTexto = DiasUtil.formataEmTexto(pacote.getDias());
        dias.setText(diasEmTexto);
    }

    private void mostraImagem(Pacote pacote) {
        ImageView imagem = findViewById(R.id.resumo_pacote_imagem);
        Drawable drawablreDoPacote = ResourceUtil
                .devolveDrawable(this, pacote.getImagem());
        imagem.setImageDrawable(drawablreDoPacote);
    }

    private void mostraLocal(Pacote pacote) {
        TextView local = findViewById(R.id.resumo_pacote_local);
        local.setText(pacote.getLocal());
    }
}
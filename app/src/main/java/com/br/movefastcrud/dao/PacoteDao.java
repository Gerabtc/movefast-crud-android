package com.br.movefastcrud.dao;

import com.br.movefastcrud.model.Pacote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacoteDao {

    public List<Pacote> lista() {
        List<Pacote> pacotes = new ArrayList<>(Arrays.asList(
        new Pacote("São Paulo", "sao_paulo_cidade", 1, new BigDecimal(20.00)),
        new Pacote("Belo Horizonte", "belo_horizonte_cidade", 2, new BigDecimal(20.00)),
        new Pacote("Recife", "recife_cidade", 3, new BigDecimal(20.00)),
        new Pacote("Rio de Janeiro", "rio_de_janeiro_cidade", 4, new BigDecimal(20.00)),
        new Pacote("Salvador", "salvador_cidade", 5, new BigDecimal(20.00)),
        new Pacote("Foz do Iguaçu", "foz_do_iguacu_cidade", 5, new BigDecimal(20.00))));
        return pacotes;
    }
}

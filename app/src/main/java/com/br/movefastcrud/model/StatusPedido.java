package com.br.movefastcrud.model;

public enum StatusPedido {
    EM_TRANSITO("EM_TRANSITO"),
    SAIU_ENTREGA("SAIU_ENTREGA"),
    ENTREGUE("ENTREGUE"),
    RECUSADO("RECUSADO");
    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }


}

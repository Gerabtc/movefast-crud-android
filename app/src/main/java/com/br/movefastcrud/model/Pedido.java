package com.br.movefastcrud.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Pedido{
    private long idPedido;
    private Usuario usuario;
    private long Identregador;
    private List<ItemPedido> itemPedidos;
    private Date data;
    private BigDecimal valorTotal;
    private StatusPedido statusPedido;

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public Usuario getCliente() {
        return usuario;
    }

    public void setCliente(Usuario usuario) {
        this.usuario = usuario;
    }

    public long getIdentregador() {
        return Identregador;
    }

    public void setIdentregador(long identregador) {
        Identregador = identregador;
    }

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(List<ItemPedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }
}
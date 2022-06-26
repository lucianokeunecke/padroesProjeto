package com.infnet.padroesprojeto.abstractFactory;

import java.time.LocalDate;

public abstract class EmpenhoPregao {

    private Long numero;
    private String nomeFornecedor;
    private LocalDate data;
    private Double valor;

    public EmpenhoPregao(Long numero, String nomeFornecedor, LocalDate data, Double valor) {
        this.numero = numero;
        this.nomeFornecedor = nomeFornecedor;
        this.data = data;
        this.valor = valor;
    }

    public Long getNumero() {
        return numero;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getValor() {
        return valor;
    }

    public abstract void exibirDetalhes();
}

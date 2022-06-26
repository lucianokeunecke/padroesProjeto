package com.infnet.padroesprojeto.abstractFactory;

import java.time.LocalDate;

public abstract class EmpenhoPregao {

    private Long numero;
    private String nomeFornecedor;
    private LocalDate data;
    private Double valor;
    private Boolean ehMaiorDescontoTabelaPreco;

    public EmpenhoPregao(Long numero, String nomeFornecedor, LocalDate data, Double valor, Boolean ehMaiorDescontoTabelaPreco) {
        this.numero = numero;
        this.nomeFornecedor = nomeFornecedor;
        this.data = data;
        this.valor = valor;
        this.ehMaiorDescontoTabelaPreco = ehMaiorDescontoTabelaPreco;
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

    public String getEhMaiorDescontoTabelaPreco() {
        if (this.ehMaiorDescontoTabelaPreco) {
            return "Sim";
        }
        return "Não";
    }

    public abstract void exibirDetalhes();
}

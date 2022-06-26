package com.infnet.padroesprojeto.abstractFactory;

import java.time.LocalDate;

public abstract class EmpenhoConcorrencia {

    private Long numero;
    private String nomeFornecedor;
    private LocalDate data;
    private Double valor;
    private Boolean ehConcessao;

    public EmpenhoConcorrencia(Long numero, String nomeFornecedor, LocalDate data, Double valor, Boolean ehConcessao) {
        this.numero = numero;
        this.nomeFornecedor = nomeFornecedor;
        this.data = data;
        this.valor = valor;
        this.ehConcessao = ehConcessao;
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

    public String getEhConcessao() {
        if (this.ehConcessao) {
            return "Sim";
        }
        return "Não";
    }

    public abstract void exibirDetalhes();
}

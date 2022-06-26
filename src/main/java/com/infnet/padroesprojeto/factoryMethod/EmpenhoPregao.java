package com.infnet.padroesprojeto.factoryMethod;

import java.time.LocalDate;

public class EmpenhoPregao extends Empenho {

    public EmpenhoPregao(Long numero, String nomeFornecedor, LocalDate data, Double valor) {
        super(numero, nomeFornecedor, data, valor);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Número do Empenho do Pregão: " + this.getNumero() +
                         ", Nome do Fornecedor " + this.getNomeFornecedor() +
                         ", Data da Emissão: " + this.getData() +
                         ", Valor: " + this.getValor());
    }
}

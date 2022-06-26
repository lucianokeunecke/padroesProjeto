package com.infnet.padroesprojeto.abstractFactory;

import java.time.LocalDate;

public class ConcreteEmpenhoPregao extends EmpenhoPregao {

    public ConcreteEmpenhoPregao(Long numero, String nomeFornecedor, LocalDate data, Double valor, Boolean ehMaiorDescontoTabelaPreco) {
        super(numero, nomeFornecedor, data, valor, ehMaiorDescontoTabelaPreco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Número do Empenho Pregão: " + this.getNumero() +
                           ", Nome do Fornecedor " + this.getNomeFornecedor() +
                           ", Data da Emissão: " + this.getData() +
                           ", Valor: " + this.getValor());
    }
}

package com.infnet.padroesprojeto.abstractFactory;

import java.time.LocalDate;

public class ConcreteEmpenhoPregao extends EmpenhoPregao {

    public ConcreteEmpenhoPregao(Long numero, String nomeFornecedor, LocalDate data, Double valor, Boolean ehMaiorDescontoTabelaPreco) {
        super(numero, nomeFornecedor, data, valor, ehMaiorDescontoTabelaPreco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("================================================================");
        System.out.println("Informações do Empenho emitido para a modalidade de Pregão:");
        System.out.println("Número: " + this.getNumero());
        System.out.println("Data da Emissão: " + this.getData());
        System.out.println("Nome do Fornecedor: " + this.getNomeFornecedor());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Utiliza maior desconto de tabela de preço?: " + this.getEhMaiorDescontoTabelaPreco());
        System.out.println("================================================================");
        System.out.println("");
    }
}

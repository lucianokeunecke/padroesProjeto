package com.infnet.padroesprojeto.abstractFactory;

import java.time.LocalDate;

public class ConcreteEmpenhoConcorrencia extends EmpenhoConcorrencia {

    public ConcreteEmpenhoConcorrencia(Long numero, String nomeFornecedor, LocalDate data, Double valor, Boolean ehConcessao) {
        super(numero, nomeFornecedor, data, valor, ehConcessao);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("================================================================");
        System.out.println("Informações do Empenho emitido para a modalidade de Concorrência:");
        System.out.println("Número: " + this.getNumero());
        System.out.println("Data da Emissão: " + this.getData());
        System.out.println("Nome do Fornecedor: " + this.getNomeFornecedor());
        System.out.println("Valor: " + this.getValor());
        System.out.println("É concessão?: " + this.getEhConcessao());
        System.out.println("================================================================");
        System.out.println("");
    }
}

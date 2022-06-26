package com.infnet.padroesprojeto.abstractFactory;

import java.time.LocalDate;

public class ConcreteEmpenhoConcorrencia extends EmpenhoConcorrencia {

    public ConcreteEmpenhoConcorrencia(Long numero, String nomeFornecedor, LocalDate data, Double valor, Boolean ehConcessao) {
        super(numero, nomeFornecedor, data, valor, ehConcessao);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Informações do Empenho emitido Concorrência: " + this.getNumero() +
                           ", Nome do Fornecedor " + this.getNomeFornecedor() +
                           ", Data da Emissão: " + this.getData() +
                           ", Valor: " + this.getValor());
    }
}

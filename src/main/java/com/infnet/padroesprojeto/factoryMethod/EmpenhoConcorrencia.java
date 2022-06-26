package com.infnet.padroesprojeto.factoryMethod;

import java.time.LocalDate;

public class EmpenhoConcorrencia extends Empenho {

    public EmpenhoConcorrencia(Long numero, String nomeFornecedor, LocalDate data, Double valor) {
        super(numero, nomeFornecedor, data, valor);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Número do Empenho da Concorrência: " + this.getNumero() +
                         ", Nome do Fornecedor " + this.getNomeFornecedor() +
                         ", Data da Emissão: " + this.getData() +
                         ", Valor: " + this.getValor());
    }
}

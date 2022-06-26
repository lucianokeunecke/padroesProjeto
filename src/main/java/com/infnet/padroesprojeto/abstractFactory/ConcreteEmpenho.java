package com.infnet.padroesprojeto.abstractFactory;

import java.time.LocalDate;

public class ConcreteEmpenho extends Empenho {

    @Override
    public EmpenhoConcorrencia emitirEmpenhoConcorrencia(Long numero, String nomeFornecedor, LocalDate data, Double valor, Boolean ehConcessao) {
        return new ConcreteEmpenhoConcorrencia(numero, nomeFornecedor, data, valor, ehConcessao);
    }

    @Override
    public EmpenhoPregao emitirEmpenhoPregao(Long numero, String nomeFornecedor, LocalDate data, Double valor, Boolean ehMaiorDescontoTabelaPreco) {
        return new ConcreteEmpenhoPregao(numero, nomeFornecedor, data, valor, ehMaiorDescontoTabelaPreco);
    }
}

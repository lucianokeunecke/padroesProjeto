package com.infnet.padroesprojeto.abstractFactory;

import java.time.LocalDate;

public class ConcreteEmpenho extends Empenho {

    @Override
    public EmpenhoConcorrencia emitirEmpenhoConcorrencia(Long numero, String nomeFornecedor, LocalDate data, Double valor) {
        return new ConcreteEmpenhoConcorrencia(numero, nomeFornecedor, data, valor);
    }

    @Override
    public EmpenhoPregao emitirEmpenhoPregao(Long numero, String nomeFornecedor, LocalDate data, Double valor) {
        return new ConcreteEmpenhoPregao(numero, nomeFornecedor, data, valor);
    }
}

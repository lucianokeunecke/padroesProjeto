package com.infnet.padroesprojeto.factoryMethod;

import java.time.LocalDate;

public class ProcessoLicitatorioConcorrencia extends ProcessoLicitatorio {

    @Override
    public Empenho emitirEmpenho(Long numero, String nomeFornecedor, LocalDate data, Double valor) {
        return new EmpenhoConcorrencia(numero, nomeFornecedor, data, valor);
    }
}

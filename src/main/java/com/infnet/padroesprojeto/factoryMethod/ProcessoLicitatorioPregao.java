package com.infnet.padroesprojeto.factoryMethod;

import java.time.LocalDate;

public class ProcessoLicitatorioPregao extends ProcessoLicitatorio {

    @Override
    public Empenho emitirEmpenho(Long numero, String nomeFornecedor, LocalDate data, Double valor) {
       return  new EmpenhoPregao(numero, nomeFornecedor, data, valor);
    }
}

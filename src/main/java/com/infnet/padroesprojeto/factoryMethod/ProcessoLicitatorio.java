package com.infnet.padroesprojeto.factoryMethod;

import java.time.LocalDate;

public abstract class ProcessoLicitatorio {

    public abstract Empenho emitirEmpenho(Long numero, String nomeFornecedor, LocalDate data, Double valor);

}

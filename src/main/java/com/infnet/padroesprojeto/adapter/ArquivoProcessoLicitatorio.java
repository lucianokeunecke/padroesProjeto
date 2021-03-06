package com.infnet.padroesprojeto.adapter;

import java.math.BigDecimal;

public abstract class ArquivoProcessoLicitatorio<P> {
    private long numero;
    private long ano;
    private String objetoDaLicitacao;
    private BigDecimal valorCotacao;

    public abstract void exportar(P arquivo);
}

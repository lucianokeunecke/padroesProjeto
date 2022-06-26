package com.infnet.padroesprojeto.adapter;

public class ArquivoProcessoLicitatorioTceRj extends ArquivoProcessoLicitatorio<ArquivoCsv> {
    @Override
    public void exportar(ArquivoCsv arquivoCsv) {
        arquivoCsv.gerar();
    }
}

package com.infnet.padroesprojeto.adapter;

public class ArquivoProcessoLicitatorioTcePr extends ArquivoProcessoLicitatorio<ArquivoJson> {

    @Override
    public void exportar(ArquivoJson arquivoJson) {
        arquivoJson.gerar();
    }
}

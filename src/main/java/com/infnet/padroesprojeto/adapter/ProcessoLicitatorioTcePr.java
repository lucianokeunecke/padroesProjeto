package com.infnet.padroesprojeto.adapter;

public class ProcessoLicitatorioTcePr extends ProcessoLicitatorio<ArquivoJson> {

    @Override
    public void exportar(ArquivoJson arquivoJson) {
        arquivoJson.gerar();
    }
}

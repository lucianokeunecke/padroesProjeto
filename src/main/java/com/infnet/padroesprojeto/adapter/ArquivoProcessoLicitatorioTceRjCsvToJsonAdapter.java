package com.infnet.padroesprojeto.adapter;

public class ArquivoProcessoLicitatorioTceRjCsvToJsonAdapter extends ArquivoProcessoLicitatorioTceRj {
    ArquivoJson arquivoJson;

    ArquivoProcessoLicitatorioTceRjCsvToJsonAdapter(ArquivoJson arquivoJson) {
        this.arquivoJson = arquivoJson;
    }
    public void exportarParaJson() {
        this.arquivoJson.gerar();
    }
}

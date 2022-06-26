package com.infnet.padroesprojeto.adapter;

public class ProcessoLicitatorioTceRjCsvToJsonAdapter extends ProcessoLicitatorioTceRj {
    ArquivoJson arquivoJson;

    ProcessoLicitatorioTceRjCsvToJsonAdapter(ArquivoJson arquivoJson) {
        this.arquivoJson = arquivoJson;
    }
    public void exportarParaJson() {
        this.arquivoJson.gerar();
    }
}

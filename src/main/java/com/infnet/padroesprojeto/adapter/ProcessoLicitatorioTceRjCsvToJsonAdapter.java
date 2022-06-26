package com.infnet.padroesprojeto.adapter;

public class ProcessoLicitatorioTceRjCsvToJsonAdapter extends ProcessoLicitatorioTceRj {
    ArquivoJson arquivoJson;

    ProcessoLicitatorioTceRjCsvToJsonAdapter() {
        this.arquivoJson = new ArquivoJson();
    }
    public void exportarParaJson() {
        this.arquivoJson.gerar();
    }
}

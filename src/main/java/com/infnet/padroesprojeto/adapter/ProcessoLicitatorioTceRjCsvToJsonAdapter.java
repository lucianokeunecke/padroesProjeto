package com.infnet.padroesprojeto.adapter;

public class ProcessoLicitatorioTceRjCsvToJsonAdapter extends ProcessoLicitatorioTceRj {

    public void exportarParaJson(ArquivoJson arquivoJson) {
        arquivoJson.gerar();
    }
}

package com.infnet.padroesprojeto.adapter;

public class ProcessoLicitatorioTceRjCsvToJsonAdapter extends ProcessoLicitarioTceRj {

    public void exportarParaJson(ArquivoJson arquivoJson) {
        arquivoJson.gerar();
    }
}

package com.infnet.padroesprojeto.adapter;

public class Runner {
    public static void main(String[] args) {
        ArquivoJson arquivoJson = new ArquivoJson();

        ArquivoProcessoLicitatorioTceRjCsvToJsonAdapter processoLicitatiorioTceRjCsvToJsonAdapter = new ArquivoProcessoLicitatorioTceRjCsvToJsonAdapter(arquivoJson);
        processoLicitatiorioTceRjCsvToJsonAdapter.exportarParaJson();
    }
}

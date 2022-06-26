package com.infnet.padroesprojeto.adapter;

public class Runner {
    public static void main(String[] args) {
        ArquivoJson arquivoJson = new ArquivoJson();

        ProcessoLicitatorioTceRjCsvToJsonAdapter processoLicitatiorioAdapter = new ProcessoLicitatorioTceRjCsvToJsonAdapter(arquivoJson);
        processoLicitatiorioAdapter.exportarParaJson();
    }
}

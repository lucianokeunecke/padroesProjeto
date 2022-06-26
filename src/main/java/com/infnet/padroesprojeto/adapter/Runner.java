package com.infnet.padroesprojeto.adapter;

public class Runner {
    public static void main(String[] args) {
        ProcessoLicitarioTceRj processoLicitarioTceRj = new ProcessoLicitarioTceRj();
        ArquivoJson arquivoJson = new ArquivoJson();

        ProcessoLicitatorioTceRjCsvToJsonAdapter processoLicitatiorioAdapter = new ProcessoLicitatorioTceRjCsvToJsonAdapter();
        processoLicitatiorioAdapter.exportarParaJson(arquivoJson);
    }
}

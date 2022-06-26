package com.infnet.padroesprojeto.adapter;

public class Runner {
    public static void main(String[] args) {
        ProcessoLicitatorioTceRj processoLicitatorioTceRj = new ProcessoLicitatorioTceRj();

        ProcessoLicitatorioTceRjCsvToJsonAdapter processoLicitatiorioAdapter = new ProcessoLicitatorioTceRjCsvToJsonAdapter();
        processoLicitatiorioAdapter.exportarParaJson();
    }
}

package com.infnet.padroesprojeto.adapter;

public class Runner {
    ProcessoLicitarioTceRj processoLicitarioTceRj = new ProcessoLicitarioTceRj();
    ArquivoJson arquivoJson = new ArquivoJson();

    ProcessoLicitatorioTceRjCsvToJsonAdapter processoLicitatiorioAdapter = new ProcessoLicitatorioTceRjCsvToJsonAdapter();
    processoLicitatiorioAdapter.exportarParaJson(arquivoJson);
}

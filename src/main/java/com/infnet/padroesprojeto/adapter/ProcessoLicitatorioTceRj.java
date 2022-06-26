package com.infnet.padroesprojeto.adapter;

public class ProcessoLicitatorioTceRj extends ProcessoLicitatorio<ArquivoCsv> {
    @Override
    public void exportar(ArquivoCsv arquivoCsv) {
        arquivoCsv.gerar();
    }
}

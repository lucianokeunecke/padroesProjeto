package com.infnet.padroesprojeto.adapter;

public class ProcessoLicitarioTceRj extends ProcessoLicitatorio<ArquivoCsv> {
    @Override
    public void exportar(ArquivoCsv arquivoCsv) {
        arquivoCsv.gerar();
    }
}

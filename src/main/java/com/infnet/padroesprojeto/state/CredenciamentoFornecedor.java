package com.infnet.padroesprojeto.state;

public class CredenciamentoFornecedor implements EstadoFaseProcessoLicitatorio {

    @Override
    public void proximo(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new LancesPregao());
    }

    @Override
    public void anterior(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new HabilitacaoCredenciamento());
    }

    @Override
    public void visualizar() {
        System.out.println("Fase do Credenciamento do Fornecedor.");
    }
}

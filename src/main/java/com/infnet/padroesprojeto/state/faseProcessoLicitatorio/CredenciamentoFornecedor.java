package com.infnet.padroesprojeto.state.faseProcessoLicitatorio;

import com.infnet.padroesprojeto.state.EstadoFaseProcessoLicitatorio;
import com.infnet.padroesprojeto.state.FaseProcessoLicitatorio;

public class CredenciamentoFornecedor implements EstadoFaseProcessoLicitatorio {

    @Override
    public void proximo(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new LancesPregao());
    }

    @Override
    public void anterior(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        System.out.println("Fase do Credenciamento do Fornecedor removida.");
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new HabilitacaoCredenciamento());
    }

    @Override
    public void visualizar() {
        System.out.println("Fase do Credenciamento do Fornecedor.");
    }
}

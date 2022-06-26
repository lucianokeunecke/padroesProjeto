package com.infnet.padroesprojeto.state.faseProcessoLicitatorio;

import com.infnet.padroesprojeto.state.EstadoFaseProcessoLicitatorio;
import com.infnet.padroesprojeto.state.FaseProcessoLicitatorio;
import com.infnet.padroesprojeto.state.faseProcessoLicitatorio.CredenciamentoFornecedor;

public class HabilitacaoCredenciamento implements EstadoFaseProcessoLicitatorio {

    @Override
    public void proximo(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new CredenciamentoFornecedor());
    }

    @Override
    public void anterior(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        System.out.println("Essa é a 1º fase da Sessão Pública do Pregão.");
    }

    @Override
    public void visualizar() {
        System.out.println("Fase da Habilitação do Credenciamento.");
    }
}

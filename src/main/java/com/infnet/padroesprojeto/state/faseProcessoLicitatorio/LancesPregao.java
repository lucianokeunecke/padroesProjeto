package com.infnet.padroesprojeto.state.faseProcessoLicitatorio;

import com.infnet.padroesprojeto.state.EstadoFaseProcessoLicitatorio;
import com.infnet.padroesprojeto.state.FaseProcessoLicitatorio;

public class LancesPregao implements EstadoFaseProcessoLicitatorio {

    @Override
    public void proximo(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new Adjudicacao());
    }

    @Override
    public void anterior(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        System.out.println("Fase dos Lances do Pregão removida.");
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new HabilitacaoCredenciamento());
    }

    @Override
    public void visualizar() {
        System.out.println("Fase dos Lances do Pregão.");
    }
}

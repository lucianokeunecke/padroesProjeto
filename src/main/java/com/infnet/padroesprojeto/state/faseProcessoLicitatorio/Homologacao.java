package com.infnet.padroesprojeto.state.faseProcessoLicitatorio;

import com.infnet.padroesprojeto.state.EstadoFaseProcessoLicitatorio;
import com.infnet.padroesprojeto.state.FaseProcessoLicitatorio;
import com.infnet.padroesprojeto.state.faseProcessoLicitatorio.Adjudicacao;

public class Homologacao implements EstadoFaseProcessoLicitatorio {

    @Override
    public void proximo(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        System.out.println("Essa é a última fase da Sessão Pública do Pregão.");
    }

    @Override
    public void anterior(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        System.out.println("Fase da Homologação removida.");
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new Adjudicacao());
    }

    @Override
    public void visualizar() {
        System.out.println("Fase da Homologação.");
    }
}

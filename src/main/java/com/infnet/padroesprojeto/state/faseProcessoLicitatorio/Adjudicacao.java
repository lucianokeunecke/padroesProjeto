package com.infnet.padroesprojeto.state.faseProcessoLicitatorio;

import com.infnet.padroesprojeto.state.EstadoFaseProcessoLicitatorio;
import com.infnet.padroesprojeto.state.FaseProcessoLicitatorio;

public class Adjudicacao implements EstadoFaseProcessoLicitatorio {

    @Override
    public void proximo(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new Homologacao());
    }

    @Override
    public void anterior(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        System.out.println("Fase da Adjudicação removida.");
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new LancesPregao());
    }

    @Override
    public void visualizar() {
        System.out.println("Fase da Adjudicação.");
    }
}

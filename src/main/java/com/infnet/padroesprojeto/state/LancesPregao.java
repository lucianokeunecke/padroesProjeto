package com.infnet.padroesprojeto.state;

public class LancesPregao implements EstadoFaseProcessoLicitatorio {

    @Override
    public void proximo(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new Adjudicacao());
    }

    @Override
    public void anterior(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new HabilitacaoCredenciamento());
    }

    @Override
    public void visualizar() {
        System.out.println("Fase dos Lances do Pregão.");
    }
}

package com.infnet.padroesprojeto.state;

public class Adjudicacao implements EstadoFaseProcessoLicitatorio {

    @Override
    public void proximo(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new Homologacao());
    }

    @Override
    public void anterior(FaseProcessoLicitatorio faseProcessoLicitatorio) {
        faseProcessoLicitatorio.setEstadoFaseProcessoLicitatorio(new LancesPregao());
    }

    @Override
    public void visualizar() {
        System.out.println("Fase da Adjudicação.");
    }
}

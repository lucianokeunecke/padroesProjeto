package com.infnet.padroesprojeto.state;

import com.infnet.padroesprojeto.state.faseProcessoLicitatorio.HabilitacaoCredenciamento;

public class FaseProcessoLicitatorio {

    private EstadoFaseProcessoLicitatorio estadoFaseProcessoLicitatorio = new HabilitacaoCredenciamento();

    public void faseAnterior() {
        estadoFaseProcessoLicitatorio.anterior(this);
    }

    public void proximaFase() {
        estadoFaseProcessoLicitatorio.proximo(this);
    }

    public EstadoFaseProcessoLicitatorio getEstadoFaseProcessoLicitatorio() {
        return estadoFaseProcessoLicitatorio;
    }

    public void setEstadoFaseProcessoLicitatorio(EstadoFaseProcessoLicitatorio estadoFaseProcessoLicitatorio) {
        this.estadoFaseProcessoLicitatorio = estadoFaseProcessoLicitatorio;
    }
}

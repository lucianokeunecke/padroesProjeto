package com.infnet.padroesprojeto.state;

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

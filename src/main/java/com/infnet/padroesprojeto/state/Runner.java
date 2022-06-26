package com.infnet.padroesprojeto.state;

public class Runner {

    public static void main(String[] args) {
        FaseProcessoLicitatorio faseProcessoLicitatorio = new FaseProcessoLicitatorio();
        faseProcessoLicitatorio.getEstadoFaseProcessoLicitatorio().visualizar();
        faseProcessoLicitatorio.proximaFase();
        faseProcessoLicitatorio.getEstadoFaseProcessoLicitatorio().visualizar();
        faseProcessoLicitatorio.proximaFase();
        faseProcessoLicitatorio.getEstadoFaseProcessoLicitatorio().visualizar();
        faseProcessoLicitatorio.proximaFase();
        faseProcessoLicitatorio.getEstadoFaseProcessoLicitatorio().visualizar();
        faseProcessoLicitatorio.proximaFase();
        faseProcessoLicitatorio.getEstadoFaseProcessoLicitatorio().visualizar();
        faseProcessoLicitatorio.proximaFase();
        faseProcessoLicitatorio.getEstadoFaseProcessoLicitatorio().visualizar();
        faseProcessoLicitatorio.faseAnterior();
        faseProcessoLicitatorio.getEstadoFaseProcessoLicitatorio().visualizar();
        faseProcessoLicitatorio.proximaFase();
        faseProcessoLicitatorio.getEstadoFaseProcessoLicitatorio().visualizar();
        faseProcessoLicitatorio.proximaFase();
    }
}

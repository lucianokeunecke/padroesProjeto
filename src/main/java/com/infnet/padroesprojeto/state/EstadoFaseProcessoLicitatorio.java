package com.infnet.padroesprojeto.state;

public interface EstadoFaseProcessoLicitatorio {

    void proximo(FaseProcessoLicitatorio faseProcessoLicitatorio);
    void anterior(FaseProcessoLicitatorio faseProcessoLicitatorio);
    void visualizar();

}

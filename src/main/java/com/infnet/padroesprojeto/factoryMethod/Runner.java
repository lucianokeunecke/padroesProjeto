package com.infnet.padroesprojeto.factoryMethod;

import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {

        ProcessoLicitatorio pregao = new ProcessoLicitatorioPregao();
        Empenho empenhoPregao = pregao.emitirEmpenho((long) 123, "Luciano Keunecke", LocalDate.now(), 5.000);
        empenhoPregao.exibirDetalhes();

        ProcessoLicitatorio concorrencia = new ProcessoLicitatorioConcorrencia();
        Empenho empenhoConcorrencia = concorrencia.emitirEmpenho((long) 8563, "Eduardo Carriel", LocalDate.now(), 7.856);
        empenhoConcorrencia.exibirDetalhes();
    }

}

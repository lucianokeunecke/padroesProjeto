package com.infnet.padroesprojeto.abstractFactory;

import java.time.LocalDate;

public abstract class Empenho {

    public abstract EmpenhoConcorrencia emitirEmpenhoConcorrencia(Long numero, String nomeFornecedor, LocalDate data, Double valor, Boolean ehConcessao);

    public abstract EmpenhoPregao emitirEmpenhoPregao(Long numero, String nomeFornecedor, LocalDate data, Double valor, Boolean ehMaiorDescontoTabelaPreco);

}

package com.infnet.padroesprojeto.abstractFactory;

import java.time.LocalDate;

public abstract class Empenho {

    public abstract EmpenhoConcorrencia emitirEmpenhoConcorrencia(Long numero, String nomeFornecedor, LocalDate data, Double valor);

    public abstract EmpenhoPregao emitirEmpenhoPregao(Long numero, String nomeFornecedor, LocalDate data, Double valor);

}

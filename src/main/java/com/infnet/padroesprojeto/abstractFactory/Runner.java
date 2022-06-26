package com.infnet.padroesprojeto.abstractFactory;

import java.time.LocalDate;
import java.util.Date;

public class Runner {

    public static void main(String[] args) {

        Empenho empenho = new ConcreteEmpenho();

        EmpenhoConcorrencia empenhoConcorrencia = empenho.emitirEmpenhoConcorrencia((long) 96856, "Lucas Simon", LocalDate.now(), 986.36, true  );

        EmpenhoPregao empenhoPregao = empenho.emitirEmpenhoPregao((long) 4563, "Lojas Americas", LocalDate.now(), 256.75, false );

        empenhoConcorrencia.exibirDetalhes();

        empenhoPregao.exibirDetalhes();
    }

}

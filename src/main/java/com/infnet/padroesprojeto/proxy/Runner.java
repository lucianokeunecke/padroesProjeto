package com.infnet.padroesprojeto.proxy;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        try {
            List<String> listaEmailAssinantes = new ArrayList<>();
            listaEmailAssinantes.add("eduardo@gmail.com");
            listaEmailAssinantes.add("luciano@gmail.com");
            DocumentoProcessoLicitatorio documentoProcessoLicitatorio = new DocumentoProcessoLicitatorio(EnumProvedorAssinaturaDocumento.DocuSign,
                                                                                                         "documento_edital.pdf",
                                                                                                         EnumTipoDocumento.EDITAL,
                                                                                                         listaEmailAssinantes);

            AssinaturaDocumentoProxy assinaturaDocumentoProxy = new AssinaturaDocumentoProxy(documentoProcessoLicitatorio);
            assinaturaDocumentoProxy.assinar();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

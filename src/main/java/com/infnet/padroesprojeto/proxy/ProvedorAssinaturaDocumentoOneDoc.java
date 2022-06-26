package com.infnet.padroesprojeto.proxy;

public class ProvedorAssinaturaDocumentoOneDoc implements ProvedorAssinaturaDocumento {

    private DocumentoProcessoLicitatorio documentoProcessoLicitatorio;

    public ProvedorAssinaturaDocumentoOneDoc(DocumentoProcessoLicitatorio documentoProcessoLicitatorio) {
        this.documentoProcessoLicitatorio = documentoProcessoLicitatorio;
    }

    @Override
    public void assinar() {
        System.out.println("Documento assinado através do provedor OneDoc.");
    }
}

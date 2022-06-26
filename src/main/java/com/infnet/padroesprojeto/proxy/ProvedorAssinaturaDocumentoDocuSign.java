package com.infnet.padroesprojeto.proxy;

public class ProvedorAssinaturaDocumentoDocuSign implements ProvedorAssinaturaDocumento {
    private DocumentoProcessoLicitatorio documentoProcessoLicitatorio;

    public ProvedorAssinaturaDocumentoDocuSign(DocumentoProcessoLicitatorio documentoProcessoLicitatorio) {
        this.documentoProcessoLicitatorio = documentoProcessoLicitatorio;
    }
    @Override
    public void assinar() {
        System.out.println("Documento assinado através do provedor DocuSign.");
    }
}

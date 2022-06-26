package com.infnet.padroesprojeto.proxy;

public class ProvedorAssinaturaDocumentoD4Sign implements ProvedorAssinaturaDocumento {
    private DocumentoProcessoLicitatorio documentoProcessoLicitatorio;
    public ProvedorAssinaturaDocumentoD4Sign(DocumentoProcessoLicitatorio documentoProcessoLicitatorio) {
        this.documentoProcessoLicitatorio = documentoProcessoLicitatorio;
    }

    @Override
    public void assinar() {
        System.out.println("Documento assinado através do provedor D4Sign.");
    }
}

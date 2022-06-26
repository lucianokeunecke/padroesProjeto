package com.infnet.padroesprojeto.proxy;

public class AssinaturaDocumentoProxy implements ProvedorAssinaturaDocumento {
    private DocumentoProcessoLicitatorio documentoProcessoLicitatorio;
    private ProvedorAssinaturaDocumento provedorAssinaturaDocumento;

    public AssinaturaDocumentoProxy(DocumentoProcessoLicitatorio documentoProcessoLicitatorio) throws Exception {
        this.documentoProcessoLicitatorio = documentoProcessoLicitatorio;
        this.inicializarProvedorAssinaturaDocumento();
    }

    @Override
    public void assinar() {
        this.provedorAssinaturaDocumento.assinar();
    }

    private void inicializarProvedorAssinaturaDocumento() throws Exception {
        if (this.documentoProcessoLicitatorio.getProvedorAssinaturaDocumento() == EnumProvedorAssinaturaDocumento.OneDoc) {
            this.provedorAssinaturaDocumento = new ProvedorAssinaturaDocumentoOneDoc(this.documentoProcessoLicitatorio);
        }

        if (this.documentoProcessoLicitatorio.getProvedorAssinaturaDocumento() == EnumProvedorAssinaturaDocumento.D4Sign) {
            this.provedorAssinaturaDocumento = new ProvedorAssinaturaDocumentoD4Sign(this.documentoProcessoLicitatorio);
        }

        if (this.documentoProcessoLicitatorio.getProvedorAssinaturaDocumento() == EnumProvedorAssinaturaDocumento.DocuSign) {
            this.provedorAssinaturaDocumento = new ProvedorAssinaturaDocumentoDocuSign(this.documentoProcessoLicitatorio);
        }

        if (this.provedorAssinaturaDocumento == null) {
            throw new Exception("Provedor de assinatura de documento não identificado!");
        }
    }
}

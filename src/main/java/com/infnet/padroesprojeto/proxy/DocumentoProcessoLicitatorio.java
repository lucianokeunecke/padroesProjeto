package com.infnet.padroesprojeto.proxy;

import java.util.List;

public class DocumentoProcessoLicitatorio {
    private EnumProvedorAssinaturaDocumento provedorAssinaturaDocumento;
    private String nomeArquivo;
    private EnumTipoDocumento tipoDocumento;
    private List<String> listaEmailAssinantes;

    public DocumentoProcessoLicitatorio(EnumProvedorAssinaturaDocumento provedorAssinaturaDocumento, String nomeArquivo, EnumTipoDocumento tipoDocumento, List<String> listaEmailAssinantes) {
        this.provedorAssinaturaDocumento = provedorAssinaturaDocumento;
        this.nomeArquivo = nomeArquivo;
        this.tipoDocumento = tipoDocumento;
        this.listaEmailAssinantes = listaEmailAssinantes;
    }

    public EnumProvedorAssinaturaDocumento getProvedorAssinaturaDocumento() {
        return provedorAssinaturaDocumento;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public EnumTipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public List<String> getListaEmailAssinantes() {
        return listaEmailAssinantes;
    }
}

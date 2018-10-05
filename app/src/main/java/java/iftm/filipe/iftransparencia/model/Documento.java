package java.iftm.filipe.iftransparencia.model;

import com.google.gson.annotations.SerializedName;

public class Documento {
    private String data;
    private String documento;
    private String documentoResumido;
    private String subtitulo;
    private String localizadorGasto;
    private String fase;
    private String especie;
    private String favorecido;
    private String codigoFavorecido;
    private String nomeFavorecido;
    private String ufFavorecido;
    private String valor;
    @SerializedName("ug")
    private String unidadeGestora;
    private String orgao;
    private String orgaoSuperior;
    private String favorecidoIntermediario;

    public Documento(String data, String documento, String documentoResumido, String subtitulo, String localizadorGasto, String fase, String especie, String favorecido, String codigoFavorecido, String nomeFavorecido, String ufFavorecido, String valor, String unidadeGestora, String orgao, String orgaoSuperior, String favorecidoIntermediario) {
        this.data = data;
        this.documento = documento;
        this.documentoResumido = documentoResumido;
        this.subtitulo = subtitulo;
        this.localizadorGasto = localizadorGasto;
        this.fase = fase;
        this.especie = especie;
        this.favorecido = favorecido;
        this.codigoFavorecido = codigoFavorecido;
        this.nomeFavorecido = nomeFavorecido;
        this.ufFavorecido = ufFavorecido;
        this.valor = valor;
        this.unidadeGestora = unidadeGestora;
        this.orgao = orgao;
        this.orgaoSuperior = orgaoSuperior;
        this.favorecidoIntermediario = favorecidoIntermediario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumentoResumido() {
        return documentoResumido;
    }

    public void setDocumentoResumido(String documentoResumido) {
        this.documentoResumido = documentoResumido;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getLocalizadorGasto() {
        return localizadorGasto;
    }

    public void setLocalizadorGasto(String localizadorGasto) {
        this.localizadorGasto = localizadorGasto;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFavorecido() {
        return favorecido;
    }

    public void setFavorecido(String favorecido) {
        this.favorecido = favorecido;
    }

    public String getCodigoFavorecido() {
        return codigoFavorecido;
    }

    public void setCodigoFavorecido(String codigoFavorecido) {
        this.codigoFavorecido = codigoFavorecido;
    }

    public String getNomeFavorecido() {
        return nomeFavorecido;
    }

    public void setNomeFavorecido(String nomeFavorecido) {
        this.nomeFavorecido = nomeFavorecido;
    }

    public String getUfFavorecido() {
        return ufFavorecido;
    }

    public void setUfFavorecido(String ufFavorecido) {
        this.ufFavorecido = ufFavorecido;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getUnidadeGestora() {
        return unidadeGestora;
    }

    public void setUnidadeGestora(String unidadeGestora) {
        this.unidadeGestora = unidadeGestora;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getOrgaoSuperior() {
        return orgaoSuperior;
    }

    public void setOrgaoSuperior(String orgaoSuperior) {
        this.orgaoSuperior = orgaoSuperior;
    }

    public String getFavorecidoIntermediario() {
        return favorecidoIntermediario;
    }

    public void setFavorecidoIntermediario(String favorecidoIntermediario) {
        this.favorecidoIntermediario = favorecidoIntermediario;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "data='" + data + '\'' +
                ", documento='" + documento + '\'' +
                ", documentoResumido='" + documentoResumido + '\'' +
                ", subtitulo='" + subtitulo + '\'' +
                ", localizadorGasto='" + localizadorGasto + '\'' +
                ", fase='" + fase + '\'' +
                ", especie='" + especie + '\'' +
                ", favorecido='" + favorecido + '\'' +
                ", codigoFavorecido='" + codigoFavorecido + '\'' +
                ", nomeFavorecido='" + nomeFavorecido + '\'' +
                ", ufFavorecido='" + ufFavorecido + '\'' +
                ", valor='" + valor + '\'' +
                ", unidadeGestora='" + unidadeGestora + '\'' +
                ", orgao='" + orgao + '\'' +
                ", orgaoSuperior='" + orgaoSuperior + '\'' +
                ", favorecidoIntermediario='" + favorecidoIntermediario + '\'' +
                '}';
    }
}

package java.iftm.filipe.iftransparencia.service;

import java.iftm.filipe.iftransparencia.model.Documento;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DocumentoService {
    @GET("resultado?paginacaoSimples=true&tamanhoPagina=100&offset=0&direcaoOrdenacao=desc&colunaOrdenacao=valor&colunasSelecionadas=data%2CdocumentoResumido%2ClocalizadorGasto%2Cfase%2Cespecie%2Cfavorecido%2CufFavorecido%2Cvalor%2Cug%2Corgao%2CorgaoSuperior&orgaos=UG158099&elemento=18")
    Call<Documento> getAllDocumentos(@Query("de") String dataInicial, @Query("ate") String dataFinal, @Query("faseDespesa") String fase );


}

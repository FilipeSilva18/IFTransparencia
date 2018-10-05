package java.iftm.filipe.iftransparencia.service;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {
    private final Retrofit retrofit;


    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://www.portaltransparencia.gov.br/despesas/favorecido/")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }

    public DocumentoService getDocumentoService() {
        return this.retrofit.create(DocumentoService.class);
    }
}

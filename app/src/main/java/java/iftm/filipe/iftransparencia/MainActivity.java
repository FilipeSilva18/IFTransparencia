package java.iftm.filipe.iftransparencia;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.iftm.filipe.iftransparencia.model.Documento;
import java.iftm.filipe.iftransparencia.service.RetrofitConfig;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Documento> todos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        char porcents = (char) 37;
        String data = ("01"+"2F082F2018");
   Call<Documento> call = new RetrofitConfig().getDocumentoService().getAllDocumentos("01"+ "0x25"+"2F08" + "0x25" + "2F2018", "19"+ "0x25"+"2F08" + "0x25" + "2F2018", "3");
        call.enqueue(new Callback<Documento>() {
            @Override
            public void onResponse(Call<Documento> call, Response<Documento> response) {
                System.out.println(response);


            }

            @Override
            public void onFailure(Call<Documento> call, Throwable t) {
                System.out.println("erro");
            }
        });

    }
}

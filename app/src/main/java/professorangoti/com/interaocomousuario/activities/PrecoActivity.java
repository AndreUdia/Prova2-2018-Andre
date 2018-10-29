package professorangoti.com.interaocomousuario.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.LogPrinter;
import android.widget.TextView;

import java.util.List;

import professorangoti.com.interaocomousuario.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PrecoActivity extends AppCompatActivity {

    private static final String TAG = "teste";
    private List<Preco> contacts;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preco);

        //Call<List<Preco>> call = apiInterface.getPrecos();

        /*Call<Preco> call = apiInterface.getPrecos();

        call.enqueue(new Callback<Preco>() {
            @Override
            public void onResponse(Call<Preco> call, Response<Preco> response) {
                if(call.equals("Voce pediu um FroYo.")){
                    TextView t = findViewById(R.id.resp3);
                    t.setText(call.toString());
                }
            }

            @Override
            public void onFailure(Call<Preco> call, Throwable t) {
            }
        });*/
    }
}

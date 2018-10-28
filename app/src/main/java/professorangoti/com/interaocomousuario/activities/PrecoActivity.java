package professorangoti.com.interaocomousuario.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import professorangoti.com.interaocomousuario.R;
import retrofit2.Call;

public class PrecoActivity extends AppCompatActivity {

    private static final String TAG = "teste";
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<Preco> contacts;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preco);

        //Call<List<Preco>> call = apiInterface.getPrecos();

    }
}

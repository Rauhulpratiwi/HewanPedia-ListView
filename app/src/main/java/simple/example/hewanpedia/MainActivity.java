package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKelinci,btnMarmut,btnKuda;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKelinci = findViewById(R.id.btn_buka_ras_kelinci);
        btnMarmut = findViewById(R.id.btn_buka_ras_marmut);
        btnKuda = findViewById(R.id.btn_buka_ras_kuda);
        btnKelinci.setOnClickListener(view -> bukaGaleri("Kelinci"));
        btnMarmut.setOnClickListener(view -> bukaGaleri("Marmut"));
        btnKuda.setOnClickListener(view -> bukaGaleri("Kuda"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity kelinci");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, Profil.class);
        startActivity(intent);
    }
}
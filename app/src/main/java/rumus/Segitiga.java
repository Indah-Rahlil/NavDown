package rumus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navdown.R;

import Bangun_kod.Bangun_datar;
import Bangun_kod.Bangun_ruang;

public class Segitiga extends AppCompatActivity {
    EditText sisitinggi;
    EditText sisialas;
    TextView hasil;
    Button btnhasil;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);

        sisitinggi = findViewById(R.id.sisitinggi);
        sisialas = findViewById(R.id.sisialas);
        hasil = findViewById(R.id.hasil);
        btnhasil = findViewById(R.id.btnhasil);
        btnback = findViewById(R.id.btnback);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alas = sisialas.getText().toString();
                String tinggi = sisitinggi.getText().toString();
                int Alas = Integer.parseInt(alas);
                int Tinggi = Integer.parseInt(tinggi);
                int luas = Alas * Tinggi * 1/2;
                hasil.setText(luas + "");
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk berpindah ke aktivitas tujuan (Bangun_ruang)
                Intent intent = new Intent(Segitiga.this, Bangun_datar.class);

                // Memulai aktivitas tujuan
                startActivity(intent);
            }
        });
    }
}

package rumus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navdown.R;

import Bangun_kod.Bangun_ruang;

public class Balok extends AppCompatActivity {
    EditText sisipanjang;
    EditText sisilebar;
    EditText sisitinggi;
    TextView hasil;
    Button btnhasil;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balok);

        sisipanjang = findViewById(R.id.sisipanjang);
        sisilebar = findViewById(R.id.sisilebar);
        sisitinggi = findViewById(R.id.sisitinggi);
        hasil = findViewById(R.id.hasil);
        btnhasil = findViewById(R.id.btnhasil);
        btnback = findViewById(R.id.btnback);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = sisipanjang.getText().toString();
                String lebar = sisilebar.getText().toString();
                String tinggi = sisitinggi.getText().toString();
                int Panjang = Integer.parseInt(panjang);
                int Lebar = Integer.parseInt(lebar);
                int Tinggi = Integer.parseInt(tinggi);
                int sisi = Panjang * Lebar + Panjang * Tinggi + Tinggi * Lebar ;
                int luasBalok = 6 * sisi;
                hasil.setText(luasBalok + "");
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk berpindah ke aktivitas tujuan (Bangun_ruang)
                Intent intent = new Intent(Balok.this, Bangun_ruang.class);

                // Memulai aktivitas tujuan
                startActivity(intent);
            }
        });
    }

}

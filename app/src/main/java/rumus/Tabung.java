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

public class Tabung extends AppCompatActivity {
    EditText jari2;
    EditText sisitinggi;
    TextView hasil;
    Button btnhasil;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabung);

        jari2 = findViewById(R.id.jari2);
        sisitinggi = findViewById(R.id.sisitinggi);
        hasil = findViewById(R.id.hasil);
        btnhasil = findViewById(R.id.btnhasil);
        btnback = findViewById(R.id.btnback);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jari = jari2.getText().toString();
                String tinggi = sisitinggi.getText().toString();
                int Jari = Integer.parseInt(jari);
                int Tinggi = Integer.parseInt(tinggi);
                int luasTabung = 2 * 22/7 * Jari * (Jari + Tinggi);
                hasil.setText(luasTabung + "");
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk berpindah ke aktivitas tujuan (Bangun_ruang)
                Intent intent = new Intent(Tabung.this, Bangun_ruang.class);

                // Memulai aktivitas tujuan
                startActivity(intent);
            }
        });
    }
}

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

public class Kubus extends AppCompatActivity {
    EditText angka;
    TextView hasil;
    Button btnhasil;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kubus);

        angka = findViewById(R.id.angka);
        hasil = findViewById(R.id.hasil);
        btnhasil = findViewById(R.id.btnhasil);
        btnback = findViewById(R.id.btnback);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = angka.getText().toString();
                int Angka1 = Integer.parseInt(angka1);
                int sisi = Angka1 * Angka1 ;
                int luasKubus = 6 * sisi;
                hasil.setText(luasKubus + "");
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk berpindah ke aktivitas tujuan (Bangun_ruang)
                Intent intent = new Intent(Kubus.this, Bangun_ruang.class);

                // Memulai aktivitas tujuan
                startActivity(intent);
            }
        });

    }

}

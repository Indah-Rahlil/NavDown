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

public class Persegi_Panjang extends AppCompatActivity {
    EditText sisilebar;
    EditText sisipanjang;
    TextView hasil;
    Button btnhasil;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi_panjang);

        sisipanjang = findViewById(R.id.sisipanjang);
        sisilebar = findViewById(R.id.sisilebar);
        hasil = findViewById(R.id.hasil);
        btnhasil = findViewById(R.id.btnhasil);
        btnback = findViewById(R.id.btnback);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = sisipanjang.getText().toString();
                String lebar = sisilebar.getText().toString();
                int Panjang = Integer.parseInt(panjang);
                int Lebar = Integer.parseInt(lebar);
                int luas = Panjang * Lebar;
                hasil.setText(luas + "");
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk berpindah ke aktivitas tujuan (Bangun_ruang)
                Intent intent = new Intent(Persegi_Panjang.this, Bangun_datar.class);

                // Memulai aktivitas tujuan
                startActivity(intent);
            }
        });
    }
}

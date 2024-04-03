package Bangun_kod;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navdown.Adapter;
import com.example.navdown.Bangun;
import com.example.navdown.R;

import java.util.ArrayList;
import java.util.List;

public class Bangun_datar extends Fragment {
    private RecyclerView bangunDatar;
    private List<Bangun> listBangunDatar;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.bangun_datar, container, false);

        // Cari referensi ke RecyclerView di dalam rootView
        bangunDatar = rootView.findViewById(R.id.bangunDatar);
        listBangunDatar = new ArrayList<>();

        Bangun persegi = new Bangun();
        persegi.setNamaBangun("Persegi");
        persegi.setImgBangun(R.drawable.persegi);
        listBangunDatar.add(persegi);

        Bangun persegiPanjang = new Bangun();
        persegiPanjang.setNamaBangun("Persegi Panjang");
        persegiPanjang.setImgBangun(R.drawable.persegi_panjang);
        listBangunDatar.add(persegiPanjang);

        Bangun segitiga = new Bangun();
        segitiga.setNamaBangun("Segitiga");
        segitiga.setImgBangun(R.drawable.segitiga);
        listBangunDatar.add(segitiga);

        bangunDatar.setLayoutManager(new LinearLayoutManager(getActivity()));
        Adapter adapter = new Adapter(listBangunDatar, getActivity());
        bangunDatar.setAdapter(adapter);

        // Atur listener klik di dalam onCreateView()
        adapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                // Ketika item diklik, lakukan apa yang Anda inginkan di sini
                Bangun selectedBangun = listBangunDatar.get(position);
                Intent intent = new Intent(getActivity(), Bangun_datar.class); // Ganti DetailMenuActivity dengan kelas aktivitas tujuan yang benar
                intent.putExtra("selectedBangun", (CharSequence) selectedBangun);
                startActivity(intent);
            }
        });
        return rootView;
    }

}

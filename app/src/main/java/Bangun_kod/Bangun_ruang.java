package Bangun_kod;

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

public class Bangun_ruang extends Fragment {
        private RecyclerView bangunRuang;
        private List<Bangun> listBangunRuang;

        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            // Inflate the layout for this fragment
            View rootView = inflater.inflate(R.layout.bangun_ruang, container, false);

            // Cari referensi ke RecyclerView di dalam rootView
            bangunRuang = rootView.findViewById(R.id.bangunRuang);
            listBangunRuang = new ArrayList<>();

            Bangun kubus = new Bangun();
            kubus.setNamaBangun("Kubus");
            kubus.setImgBangun(R.drawable.kubus);
            listBangunRuang.add(kubus);

            Bangun balok = new Bangun();
            balok.setNamaBangun("Balok");
            balok.setImgBangun(R.drawable.balok);
            listBangunRuang.add(balok);

            Bangun tabung = new Bangun();
            tabung.setNamaBangun("Tabung");
            tabung.setImgBangun(R.drawable.tabung);
            listBangunRuang.add(tabung);

            bangunRuang.setLayoutManager(new LinearLayoutManager(getActivity()));
            Adapter adapter = new Adapter(listBangunRuang, getActivity());
            bangunRuang.setAdapter(adapter);

            return bangunRuang;
        }
}

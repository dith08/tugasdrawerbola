package com.example.tugasdrawerbola.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasdrawerbola.Adapter;
import com.example.tugasdrawerbola.Data;
import com.example.tugasdrawerbola.R;

import java.util.ArrayList;
import java.util.List;

public class PemainTerbaik extends Fragment implements Adapter.ItemClickListener {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private List<Data> dataList;

    public PemainTerbaik() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.pemainterbaik, container, false);

        recyclerView = view.findViewById(R.id.rvList2);
        dataList = new ArrayList<>();

        dataList.add(new Data("De Bruyne", "5.0", R.drawable.debruyne, "Add to favourite"));
        dataList.add(new Data("Bakayoko Saka", "5.0", R.drawable.saka, "Add to favourite"));
        dataList.add(new Data("Rashford", "5.0", R.drawable.rashford, "Add to favourite"));
        dataList.add(new Data("Halland", "4.7", R.drawable.haaland, "Add to favourite"));
        dataList.add(new Data("Salah", "4.8", R.drawable.salah, "Add to favourite"));


        adapter = new Adapter(dataList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter); // Menggunakan variabel adapter, bukan kelas Adapter
        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}

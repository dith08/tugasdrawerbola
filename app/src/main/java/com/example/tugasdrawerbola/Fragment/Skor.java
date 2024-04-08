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

public class Skor extends Fragment implements Adapter.ItemClickListener  {
    private RecyclerView recyclerView;
    private com.example.tugasdrawerbola.Adapter adapter;
    private List<Data> dataList;

    public Skor() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.skor, container, false);

        recyclerView = view.findViewById(R.id.rvList3);
        dataList = new ArrayList<>();

        dataList.add(new Data("Liverpool VS MU", "5.0", R.drawable.lvmu, "Added in favourite"));
        dataList.add(new Data("NewCastel VS Sheffield", "5.0", R.drawable.newcastel, "Added in favourite"));
        dataList.add(new Data("Liverpool VS Bornemouth", "4.8", R.drawable.lvrpl, "Added in favourite"));
        dataList.add(new Data("MU VS Shouthampton", "4.9", R.drawable.mu, "Added in favourite"));
        dataList.add(new Data("Tontenham VS MU", "5.0", R.drawable.tontenham6, "Added in favourite"));

        adapter = new Adapter(dataList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}



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

public class PremierLeague extends Fragment implements Adapter.ItemClickListener {

    private RecyclerView recyclerView;
    private com.example.tugasdrawerbola.Adapter adapter;
    private List<Data> dataList;

    public PremierLeague() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.premierleague, container, false);

        recyclerView = view.findViewById(R.id.rvList);
        dataList = new ArrayList<>();

        dataList.add(new Data("Liverpool", "5.0", R.drawable.lvrpol, "Added in favourite"));
        dataList.add(new Data("Man City", "5.0", R.drawable.city, "Added in favourite"));
        dataList.add(new Data("Arsenal", "5.0", R.drawable.arsenal, "Added in favourite"));
        dataList.add(new Data("Aston Villa", "4.9", R.drawable.astonvila, "Added in favourite"));
        dataList.add(new Data("Totenham", "4.8", R.drawable.totenham, "Added in favourite"));

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

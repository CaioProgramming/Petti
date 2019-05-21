package com.silentsystems.petti;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {
    private AppBarLayout appbarlayout;
    private TextView address;
    private Toolbar toolbar;
    private RecyclerView products;
    private RecyclerView services;
    private RecyclerView shops;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);




        appbarlayout = (AppBarLayout) view.findViewById(R.id.appbarlayout);
        address = (TextView) view.findViewById(R.id.address);
        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        products = (RecyclerView) view.findViewById(R.id.products);
        services = (RecyclerView) view.findViewById(R.id.services);
        shops = (RecyclerView) view.findViewById(R.id.shops);


        
        return view;
    }
}

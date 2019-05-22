package com.silentsystems.petti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

public class StoreActivity extends AppCompatActivity {
RecyclerView recyclerDestaques, recyclerProdutos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);


    }
}

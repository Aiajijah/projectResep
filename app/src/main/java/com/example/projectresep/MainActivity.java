package com.example.projectresep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiInterface apiInterfacenya;
    RecyclerView rvResep;
    RecyclerView.LayoutManager layoutnya;
    ResepAdapter adapternya;
    List<IsiResep> semuaResep;
    ImageView imgNya;
    Resep xxx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgNya=(ImageView)findViewById(R.id.img_resep);
        rvResep=(RecyclerView) findViewById(R.id.txt_home);
        layoutnya= new GridLayoutManager(this,2);
        rvResep.setLayoutManager(layoutnya);
        apiInterfacenya=ApiClient.ambilData().create(ApiInterface.class);
        Call<Resep> call=apiInterfacenya.ambilResep();
        call.enqueue(new Callback<Resep>() {
            @Override
            public void onResponse(Call<Resep> call, Response<Resep> response) {
               xxx=response.body();
               semuaResep= xxx.getResults();
               adapternya=new ResepAdapter(semuaResep,MainActivity.this);
               rvResep.setAdapter(adapternya);


            }

            @Override
            public void onFailure(Call<Resep> call, Throwable t) {

            }
        });





    }
}

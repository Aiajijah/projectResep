package com.example.projectresep;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projectresep.detailnya.Hasil;
import com.squareup.picasso.Picasso;

import java.io.File;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResepActivity extends AppCompatActivity {
    TextView txtTitle, txtTitle1, txtkey, txttimes, txtportion, txtdificulty;
    ImageView txtGambar;
    ApiInterface apiInterface;
    IsiResep resepnya;
    Activity activity;
    ImageView imgNya;
    Button btn;
    ObjekBesar objekBesar;
    ApiInterface apiInterface2;
    Hasil resepDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep);

        txtTitle1 = (TextView) findViewById(R.id.txt_title_1);
        txtkey = (TextView) findViewById(R.id.txt_key);
        txttimes = (TextView) findViewById(R.id.txt_times);
        txtportion = (TextView) findViewById(R.id.txt_portion);
        txtdificulty = (TextView) findViewById(R.id.txt_dificutly);
        imgNya = (ImageView) findViewById(R.id.img_Masak);
        btn=(Button)findViewById(R.id.btn_next);

        Intent dapet=getIntent();
        resepnya=(IsiResep)dapet.getSerializableExtra("Paket");
        txtTitle1.setText(resepnya.getTitle());
        txtkey.setText(resepnya.getKey());
        txttimes.setText(resepnya.getTimes());
        txtportion.setText(resepnya.getPortion());
        txtdificulty.setText(resepnya.getDificulty());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String key=resepnya.getKey();
                apiInterface2=ApiClient.ambilData().create(ApiInterface.class);
                Call<ObjekBesar>call=apiInterface2.ambilObject(key);
                call.enqueue(new Callback<ObjekBesar>() {
                    @Override
                    public void onResponse(Call<ObjekBesar> call, Response<ObjekBesar> response) {
                        objekBesar=response.body();
                        resepDetail=objekBesar.getResults();
                        Intent kirim=new Intent(ResepActivity.this,DetailActivity.class);
                        kirim.putExtra("Paket",resepDetail);
                        startActivity(kirim);
                    }

                    @Override
                    public void onFailure(Call<ObjekBesar> call, Throwable t) {

                    }
                });
                Picasso.with(ResepActivity.this).load(resepnya.getThumb()).into(imgNya);
            }
        });



            }


        }
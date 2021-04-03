package com.example.projectresep;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.projectresep.detailnya.Hasil;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    TextView txtTitle3, txtServing, txtItemName;
    ImageView ImgDetail;
    ApiInterface apiInterface;
    Hasil hasilnya;
    Activity activity;
    ListView Ingredients, steps;
    ArrayAdapter<String> adapterString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtTitle3 = (TextView) findViewById(R.id.txt_title_detail);
        txtServing=(TextView)findViewById(R.id.txt_Servings);
        txtItemName=(TextView)findViewById(R.id.txt_item_name);
        ImgDetail=(ImageView)findViewById(R.id.img_detail);
        Ingredients=(ListView)findViewById(R.id.txt_ingredients);
        steps=(ListView)findViewById(R.id.txt_Steps);

        Intent dapat=getIntent();
        hasilnya=(Hasil)dapat.getSerializableExtra("Paket");
        txtTitle3.setText(hasilnya.getTitle());
        txtServing.setText(hasilnya.getServings());
        txtItemName.setText(hasilnya.getNeedItem().get(0).getItem_name());
        Picasso.with(DetailActivity.this).load(hasilnya.getThumb()).into(ImgDetail);
        adapterString=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hasilnya.getIngredient());
        Ingredients.setAdapter(adapterString);
        adapterString=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hasilnya.getStep());
        steps.setAdapter(adapterString);
    }
}

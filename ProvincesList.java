package com.example.assignment3_rida_aftab;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;



public class ProvincesList extends AppCompatActivity {

   // final int secondActivityRequestCode = 100;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinces_list);

        final ListView listView = findViewById(R.id.listView_Provinces);
        final ArrayList<Provincial> provincialList = ProvincesData.getList();
        final MyAdapter adapter = new MyAdapter(this, R.layout.customlist, provincialList);
        listView.setAdapter(adapter);


        final Provincial provincial = (Provincial) getIntent().getSerializableExtra("PROVINCIAL");
        final Intent intent = new Intent(ProvincesList.this, MainActivity.class);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                           Provincial provincial = (Provincial) getIntent().getSerializableExtra("PROVINCIAL");
                           Intent intent = new Intent(ProvincesList.this, MainActivity.class);

                           String name = provincialList.get(position).getName();
                           intent.putExtra("Name", name);
                           String capital = provincialList.get(position).getCapital();
                           intent.putExtra("Capital", capital);
                          startActivity(intent);


           }




       });


        ActionBar actionBar = getSupportActionBar();

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));


    }

}


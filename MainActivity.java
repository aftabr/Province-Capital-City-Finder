package com.example.assignment3_rida_aftab;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final private int SECOND_ACTIVITY = 2;

    Button selectProvince ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectProvince  = findViewById(R.id.btn_SelectProvinces);



        ActionBar actionBar = getSupportActionBar();

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blue)));



        String province = getIntent().getStringExtra("Name");
         TextView Name = (TextView) findViewById(R.id.tV_Province);
         String capitalCity = getIntent().getStringExtra("Capital");
        TextView Capital = (TextView) findViewById(R.id.tV_Capital);

        if(province != null){
            Name.setText(province);
        }
        if(capitalCity !=null){
            Capital.setText(capitalCity);
        }



    }


    public void selectprovinces(View view) {
        final Intent intent = new Intent(this, ProvincesList.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Would you Like to Open Second Activity?")
        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                startActivityForResult(intent, SECOND_ACTIVITY);
            }
        })
        .setNegativeButton("No", null)
        .show();


    }
}

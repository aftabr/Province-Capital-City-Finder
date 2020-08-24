package com.example.assignment3_rida_aftab;

import java.util.ArrayList;

public class ProvincesData {

    public static ArrayList<Provincial> getList() {


        Provincial ontario;
        Provincial manitoba;
        Provincial alberta;
        Provincial britishColumbia;
        Provincial newbrunswick;
        Provincial newfoundlandandLabrador;
        Provincial novascotia;
        Provincial princeedwardIsland;
        Provincial quebec;
        Provincial saskatchewan;
        //final ListView provinces = findViewById(R.id.listView_Provinces);
        final ArrayList<Provincial> provincesList = new ArrayList<>();

        ontario = new Provincial("Ontario","Toronto",R.drawable.ontario);
        provincesList.add(ontario);
        manitoba = new Provincial("Manitoba","Winnipeg", R.drawable.manitoba);
        provincesList.add(manitoba);
        alberta = new Provincial("Alberta","Edmonton", R.drawable.alberta);
        provincesList.add(alberta);
        britishColumbia = new Provincial("British Columbia", "Victoria", R.drawable.british_columbia);
        provincesList.add(britishColumbia);
        newbrunswick = new Provincial("New Brunswick", "Fredriction", R.drawable.new_brunswick);
        provincesList.add(newbrunswick);
        newfoundlandandLabrador = new Provincial("Newfoundland and Labrador", "St.John's", R.drawable.newfoundland_and_labrador);
        provincesList.add(newfoundlandandLabrador);
        novascotia = new Provincial("Nove Scotia ", "Halifax", R.drawable.nova_scotia);
        provincesList.add(novascotia);
        princeedwardIsland = new Provincial("Prince Edward Island", "Charlottetown", R.drawable.prince_edward_island);
        provincesList.add(princeedwardIsland);
        quebec = new Provincial("Quebec", "Quebec City", R.drawable.quebec);
        provincesList.add(quebec);
        saskatchewan = new Provincial("Saskatchewan", "Regina", R.drawable.saskatchewan);
        provincesList.add(saskatchewan);

        return provincesList;


    }
}

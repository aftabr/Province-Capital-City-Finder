package com.example.assignment3_rida_aftab;

public class Provincial {


    String Name;

    String capital;

    int armid;

    public Provincial(String name, String capital, int armid) {
        Name = name;
        this.capital = capital;
        this.armid = armid;
    }


    public String getName() {
        return Name;
    }

    public String getCapital() {
        return capital;
    }


    public int getArmid() {
        return armid;
    }


}

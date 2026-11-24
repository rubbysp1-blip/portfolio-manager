package com.pluralsight.portfoliomanager.model;

import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable asset){

    }

    public double getValue(){
        return 0;
    }

    public Valuable getMostValuable(){
        return null;
    }

    public Valuable getLeastValuable(){
        return null;
    }
}

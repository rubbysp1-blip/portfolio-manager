package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable valuable){
        //assets = new ArrayList<>();
        assets.add(valuable);
    }

    public BigDecimal getValue(){
        BigDecimal totalValue = BigDecimal.ZERO;
        for(Valuable value : assets){
            totalValue = totalValue.add(value.getValue());
        }
        return totalValue;
    }

    public Valuable getMostValuable(){
        return null;
    }

    public Valuable getLeastValuable(){
        return null;
    }
}

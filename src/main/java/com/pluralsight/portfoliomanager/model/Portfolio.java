package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Valuable{
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

    @Override
    public BigDecimal getValue(){
        BigDecimal totalValue = BigDecimal.ZERO;
        for(Valuable value : assets){
            totalValue = totalValue.add(value.getValue());
        }
        return totalValue;
    }

    public Valuable getMostValuable(){
        Valuable best = assets.get(0);
        BigDecimal valuePrice = BigDecimal.ZERO;
        for(Valuable value : assets){
            if(value.getValue().compareTo(valuePrice) > 0){
                best = value;
                valuePrice = value.getValue();
            }
        }
        return best;
    }

    public Valuable getLeastValuable(){
        Valuable valuable = null;
        BigDecimal valuePrice = BigDecimal.ZERO;
        for(Valuable value : assets){
            if(value.getValue().compareTo(valuePrice) < 0){
                valuable = value;
                valuePrice = value.getValue();
            }
        }
        return valuable;
    }
}

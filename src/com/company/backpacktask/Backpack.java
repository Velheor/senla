package com.company.backpacktask;

import java.util.List;

public class Backpack {
    private List<Item> bestItems;

    private Double maxWeight;
    private Double maxPrice;

    public Backpack(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Item> getBestItems() {
        return bestItems;
    }

    public void setBestItems(List<Item> bestItems) {
        this.bestItems = bestItems;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

}

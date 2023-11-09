package com.karel.program;

import java.util.ArrayList;

public class Box {
    private double maximumWeight;
    private ArrayList<ToBeStored> items;

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void add(ToBeStored item) {
        if (weight() + item.weight() <= maximumWeight) {
            items.add(item);
        }
    }

    public double weight() {
        double totalWeight = 0.0;
        for (ToBeStored item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    public String toString() {
        return "Box: " + items.size() + " things, total weight " + weight() + " kg";
    }
}

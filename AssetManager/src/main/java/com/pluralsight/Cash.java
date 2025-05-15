package com.pluralsight;

public class Cash extends Asset {
    // Constructor
    public Cash(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    // Implement getValue() (no custom logic needed)
    @Override
    public double getValue() {
        return this.getOriginalCost();
    }

}

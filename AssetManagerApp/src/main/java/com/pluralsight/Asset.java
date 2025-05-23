package com.pluralsight;

public class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;

    // Constructor
    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    // Getters and Setters
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getDateAcquired() { return dateAcquired; }
    public void setDateAcquired(String dateAcquired) { this.dateAcquired = dateAcquired; }

    public double getOriginalCost() { return originalCost; }
    public void setOriginalCost(double originalCost) { this.originalCost = originalCost; }

    @Override
    public String toString() {
        return  "\n "+ getClass().getSimpleName() +"  Asset{    " +
                "description=>" + description  + "    |" +
                ", dateAcquired='" +"   |" +dateAcquired + '\'' + "    |"+
                ", originalCost=    " + originalCost +
                ", current value=   " + getValue() +
                '}';
    }

    // Method to get value (default behavior)
    public double getValue() {
        return originalCost;
    }
}

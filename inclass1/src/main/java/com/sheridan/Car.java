package com.sheridan;

public class Car {
    private String carModel;
    private double depriciationRate;
    private double purchasePrice;

    public Car(String carModel, double depriciationRate, double purchasePrice) {
        this.carModel = carModel;
        this.depriciationRate = depriciationRate;
        this.purchasePrice = purchasePrice;
    }
    
    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public double getDepriciationRate() {
        return depriciationRate;
    }
    public void setDepriciationRate(double depriciationRate) {
        this.depriciationRate = depriciationRate;
    }
    public double getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}

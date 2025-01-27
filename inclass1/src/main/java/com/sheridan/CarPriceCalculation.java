package com.sheridan;

import java.util.HashMap;
import java.util.Map;

public class CarPriceCalculation {
    private Map<String, Car> cars = new HashMap<>();

    public boolean addCar(Car car){
        if(car == null)
            return false;
        else
            cars.put(car.getCarModel(), car);
            return true;
    }

    public Car getCar(String carModel){
        return cars.get(carModel);
    }

    public double calculateCarPrice(Car carToCalc, int years){
        Car car = cars.get(carToCalc.getCarModel());
        double price = car.getPurchasePrice();
        for(int i = 0; i < years; i++){
            price = price - (price * car.getDepriciationRate());
        }
        return price;
    }
}

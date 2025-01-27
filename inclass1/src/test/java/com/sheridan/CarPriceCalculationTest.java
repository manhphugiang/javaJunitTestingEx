package com.sheridan;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarPriceCalculationTest {
    

    @Test
    public void testAddCar(){
        CarPriceCalculation calc = new CarPriceCalculation();
        Car car = new Car("Toyota", 0.05, 20000);
        
        assertTrue(calc.addCar(car));
    }

    @Test
    public void testCalculatePrice(){
        CarPriceCalculation calc = new CarPriceCalculation();
        Car car = new Car("Toyota", 0.05, 20000);
        calc.addCar(car);
        double price = calc.calculateCarPrice(car, 1);
        assertTrue(price == 19000);
    }



    public static class nestedTestClass {
        @Test
        public void testCalculatePriceMultipleYears(){
            CarPriceCalculation calc = new CarPriceCalculation();
            Car car = new Car("Toyota", 0.05, 20000);
            calc.addCar(car);
            double price = calc.calculateCarPrice(car, 3);
            assertTrue(price == 17147.5); 
        }

        @Test
        public void testAddNullCar(){
            CarPriceCalculation calc = new CarPriceCalculation();
            assertFalse(calc.addCar(null));
        }

        @Test
        public void testUpdateCar(){
            CarPriceCalculation calc = new CarPriceCalculation();
            Car car = new Car("Toyota", 0.05, 20000);
            calc.addCar(car);
            Car updatedCar = new Car("Honda", 0.06, 20000);
            calc.addCar(updatedCar);
            assertEquals(updatedCar, calc.getCar("Honda"));
        }

        @Test
        public void testGetCar(){
            CarPriceCalculation calc = new CarPriceCalculation();
            Car car = new Car("Toyota", 0.05, 20000);
            calc.addCar(car);
            Car retrievedCar = calc.getCar("Toyota");
            assertEquals(car, retrievedCar);
        }
    }
}

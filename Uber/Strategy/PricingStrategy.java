package Uber.Strategy;

import Uber.Models.Coordinates;

public interface PricingStrategy {

    public double calculatePrice(Coordinates source, Coordinates destination);
}

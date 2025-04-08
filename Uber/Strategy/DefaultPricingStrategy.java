package Uber.Strategy;

import Uber.Models.Coordinates;

public class DefaultPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(Coordinates source, Coordinates destination) {
        double distance = Math.sqrt(
                Math.pow(source.getX() - destination.getX(), 2) + Math.pow(source.getY() - destination.getY(), 0));

        return distance * 1.5;
    }
}

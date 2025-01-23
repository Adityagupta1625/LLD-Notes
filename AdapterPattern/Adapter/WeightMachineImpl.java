package AdapterPattern.Adapter;

import AdapterPattern.Adaptee.WeightMachine;

public class WeightMachineImpl implements WeightMachineAdapter {

    private WeightMachine weightMachine;

    public WeightMachineImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeight();

        return weightInPound * 0.453592;
    }
}

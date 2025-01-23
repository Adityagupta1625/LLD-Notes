package AdapterPattern;

import AdapterPattern.Adaptee.WeightMachine;
import AdapterPattern.Adaptee.WeightMachineForBabies;
import AdapterPattern.Adapter.WeightMachineAdapter;
import AdapterPattern.Adapter.WeightMachineImpl;

public class client {

    public static void main(String[] args) {
        WeightMachine weightMachine = new WeightMachineForBabies();

        WeightMachineAdapter weightMachineImpl = new WeightMachineImpl(weightMachine);

        System.out.println(weightMachineImpl.getWeightInKg());

    }
}

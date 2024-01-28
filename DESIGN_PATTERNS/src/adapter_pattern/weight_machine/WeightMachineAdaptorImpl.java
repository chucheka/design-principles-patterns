package adapter_pattern.weight_machine;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor {

    private WeightMachine weightMachine;

    public WeightMachineAdaptorImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public Double getWeightInKg() {

        int weightInPounds = weightMachine.getWeightInPounds();

        return weightInPounds * 0.45;
    }
}

package adapter_pattern;

import adapter_pattern.sqaure_peg_in_round_hole.RoundHole;
import adapter_pattern.sqaure_peg_in_round_hole.RoundPeg;
import adapter_pattern.sqaure_peg_in_round_hole.SquarePeg;
import adapter_pattern.sqaure_peg_in_round_hole.SquarePegAdapter;
import adapter_pattern.weight_machine.WeightMachine;
import adapter_pattern.weight_machine.WeightMachineAdaptor;
import adapter_pattern.weight_machine.WeightMachineAdaptorImpl;
import adapter_pattern.weight_machine.WeightMachineImpl;

public class AdapterPattern {

    public static void main(String[] args) {

        /*
            This client code is used to calculating weight a weight machine in kg.
            As situation will have it a weight machine calibrated in Pounds is the
            only machine available.So the client code will need to adapt to a machine
            that measures weight in Pounds
         */

        WeightMachine weightMachine = new WeightMachineImpl();

        WeightMachineAdaptor weightMachineAdaptor = new WeightMachineAdaptorImpl(weightMachine);

        weightMachineAdaptor.getWeightInKg();


        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        hole.fits(rpeg); // true

        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);
//        hole.fits(small_sqpeg) // this won't compile (incompatible types)

        SquarePegAdapter small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
        SquarePegAdapter large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);
        System.out.println(hole.fits(small_sqpeg_adapter)); // true
        System.out.println(hole.fits(large_sqpeg_adapter)); // false
    }
}

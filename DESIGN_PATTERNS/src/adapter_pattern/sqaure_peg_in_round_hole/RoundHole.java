package adapter_pattern.sqaure_peg_in_round_hole;

public class RoundHole {

    double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {

        return this.radius >= peg.getRadius();
    }
}

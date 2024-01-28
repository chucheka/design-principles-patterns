package adapter_pattern.sqaure_peg_in_round_hole;

/* An adapter class lets you fit square pegs into round holes.
 It extends the RoundPeg class to let the adapter objects act as round pegs.
*/
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}

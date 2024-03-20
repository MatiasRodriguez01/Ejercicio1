public class Officer extends Operational {

    /// Attributes;
    private String shift;

    /// Constructs;
    public Officer(){};
    public Officer(String name, int dni, String shift) {
        super(name, dni);
        this.shift = shift;
    }

    /// Getters and Setters;
    public String getShift() {
        return shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }

    /// toString;
    @Override
    public String toString(){
        String x = (super.toString() + ", trabaja en el turno " + this.shift + ".");
        return x;
    }
}

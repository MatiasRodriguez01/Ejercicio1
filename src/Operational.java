public class Operational extends Employee {

    /// Attributes;
    private int dni;

    /// Constructs;
    public Operational(){};
    public Operational(String name, int dni) {
        super(name);
        this.dni = dni;
    }

    /// Getters and Setters;
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    /// toString;
    @Override
    public String toString(){
        String x = (super.toString() + ", su DNI = " + this.dni);
        return x;
    }
}

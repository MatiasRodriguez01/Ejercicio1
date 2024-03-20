public abstract class Employee {

    /// Attributes;
    private String name;

    /// Constructs;
    public Employee(){}
    public Employee(String name){
        this.name = name;
    }

    /// getters and setters;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /// toString;
    @Override
    public String toString() {
        return ("El nombre del empleado es " + this.name);
    }
}

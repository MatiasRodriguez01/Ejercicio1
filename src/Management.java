public class Management extends Employee {

    /// Attributes;
    private String Department;

    /// Constructs;
    public Management(){};
    public Management(String name, String Department) {
        super(name);
        this.Department = Department;
    }

    /// Getters and Setters;
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /// toString;
    @Override
    public String toString(){
        String x = (super.toString() + ", Trabaja en el departamento de " + this.Department + ".");
        return x;
    }
}

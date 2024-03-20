public class Techician extends Operational {

    /// Attribute;
    private String mail;

    /// Constructs;
    public Techician(){};
    public Techician(String name, int dni, String mail) {
        super(name, dni);
        this.mail = mail;
    }

    /// Getters and Setters;
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    /// toString;
    @Override
    public String toString(){
        String x = (super.toString() + ", su correo es " + this.mail);
        return x;
    }
}

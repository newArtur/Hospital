package hospital.People;

public class Employee extends Person  {

    private String doljnost;

    public Employee(String name, String familie, int dataRojenie, String adrElPoch, String doljnost) {
        super(name, familie, dataRojenie, adrElPoch);
        this.doljnost = doljnost;
    }

    public Employee() {
    }

    public String getDoljnost() {
        return doljnost;
    }

    public void setDoljnost(String doljnost) {
        this.doljnost = doljnost;
    }
}

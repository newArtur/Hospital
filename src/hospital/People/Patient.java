package hospital.People;

public class  Patient extends Person {

    private String diagnos;

    public Patient(String name, String familie, int dataRojenie, String adrElPoch, String diagnos) {
        super(name, familie, dataRojenie, adrElPoch);
        this.diagnos = diagnos;
    }

    public Patient() {
    }

    public String getDiagnos() {
        return diagnos;
    }

    public void setDiagnos(String diagnos) {
        this.diagnos = diagnos;
    }
}

package hospital.People;

public class Person {

    private String name;
    private String familie;
    private int DataRojenie;
    private String AdrElPoch;



    public Person(String name, String familie, int dataRojenie, String adrElPoch) {
        this.name = name;
        this.familie = familie;
        DataRojenie = dataRojenie;
        AdrElPoch = adrElPoch;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilie() {
        return familie;
    }

    public void setFamilie(String familie) {
        this.familie = familie;
    }

    public int getDataRojenie() {
        return DataRojenie;
    }

    public void setDataRojenie(int dataRojenie) {
        DataRojenie = dataRojenie;
    }

    public String getAdrElPoch() {
        return AdrElPoch;
    }

    public void setAdrElPoch(String adrElPoch) {
        AdrElPoch = adrElPoch;
    }
}

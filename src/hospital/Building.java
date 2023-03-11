package hospital;

public class Building {

    private int numberEtajei;
    private int PlossatZdaniya;
    private String adres;

    public Building(int numberEtajei, int plossatZdaniya, String adres) {
        this.numberEtajei = numberEtajei;
        PlossatZdaniya = plossatZdaniya;
        this.adres = adres;
    }

    public Building() {
    }

    public int getNumberEtajei() {
        return numberEtajei;
    }

    public void setNumberEtajei(int numberEtajei) {
        this.numberEtajei = numberEtajei;
    }

    public int getPlossatZdaniya() {
        return PlossatZdaniya;
    }

    public void setPlossatZdaniya(int plossatZdaniya) {
        PlossatZdaniya = plossatZdaniya;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;


    }
}

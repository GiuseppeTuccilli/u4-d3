package Es2;

public class Chiamata {
    private String numeroChiamato;
    private double durataMin;

    public Chiamata(String num, double durata) {
        this.numeroChiamato = num;
        this.durataMin = durata;
    }

    public String getNumber() {
        return this.numeroChiamato;
    }

    public double getDuration() {
        return this.durataMin;
    }
}

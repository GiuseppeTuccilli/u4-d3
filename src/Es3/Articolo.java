package Es3;

import java.util.Random;

public class Articolo {
    private int codice;
    private String descrizione;
    private double prezzo;
    private int disponibili;

    public Articolo(String descrizione, double prezzo, int disponibili) {
        Random rdm = new Random();

        this.codice = rdm.nextInt(100);
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.disponibili = disponibili;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codice=" + codice +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", disponibili=" + disponibili +
                '}';
    }
}

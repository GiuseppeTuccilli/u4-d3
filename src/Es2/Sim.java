package Es2;

import java.util.Arrays;

public class Sim {
    private Chiamata[] chiamate;
    private String numero;
    private double credito;

    public Sim(String num) {
        this.numero = num;
        this.credito = 0;
        chiamate = new Chiamata[5];
    }

    public String getNumero() {
        return this.numero;
    }

    public double getCredito() {
        return this.credito;
    }

    public void nuovaChiamata(double durata, String num) {
        for (int i = this.chiamate.length; i >= 1; i--) {
            if (chiamate[i - 1] != null) {
                chiamate[i] = chiamate[i - 1];
            }

        }
        chiamate[0] = new Chiamata(num, durata);
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "chiamate=" + Arrays.toString(chiamate) +
                ", numero='" + numero + '\'' +
                ", credito=" + credito +
                '}';
    }
}

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

    public void nuovaChiamata(double durata) {
        for (int i = 0; i < this.chiamate.length - 1; i++) {
            if (chiamate[i] == null) {
                break;
            }
            chiamate[i + 1] = chiamate[i];
        }
        chiamate[0] = new Chiamata(this.numero, durata);
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

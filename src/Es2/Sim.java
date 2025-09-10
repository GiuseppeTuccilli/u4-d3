package Es2;

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

}

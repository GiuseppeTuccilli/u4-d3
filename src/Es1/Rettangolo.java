package Es1;

public class Rettangolo {
    private int altezza;
    private int larghezza;

    //Costruttore
    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // Metodo static
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {

        int sommaPer = r1.getPerimetro() + r2.getPerimetro();
        int sommaAree = r1.getArea() + r2.getArea();
        System.out.println("la somma dei perimetri è: " + sommaPer);
        System.out.println("la somma delle aree é: " + sommaAree);
    }

    //Metodi non static
    public int getPerimetro() {
        return (2 * this.altezza) + (2 * this.larghezza);
    }

    public int getArea() {
        return this.altezza * this.larghezza;
    }

    public void stampaRettangolo() {
        System.out.println("perimetro: " + this.getPerimetro() + "; area: " + this.getArea());
    }
}

package Es3;

import java.util.Arrays;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private double tot;

    public Carrello(Cliente cliente) {
        this.cliente = new Cliente(cliente.getNome(), cliente.getCognome(), cliente.getEmail(), cliente.getTel());
        articoli = new Articolo[10];
        double tot = 0;
        for (int i = 0; i < articoli.length; i++) {
            if (articoli[i] == null) {
                break;
            }
            tot = tot + articoli[i].getPrezzo();
        }
        this.tot = tot;

    }

    public Cliente getCliente() {
        return this.cliente;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "cliente=" + this.cliente.getNome() +
                ", articoli=" + Arrays.toString(articoli) +
                ", tot=" + tot +
                '}';
    }


}

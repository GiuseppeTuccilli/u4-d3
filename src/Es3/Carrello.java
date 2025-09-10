package Es3;

import java.util.Arrays;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private double tot;

    public Carrello(Cliente cliente) {
        // this.cliente = new Cliente(cliente.getNome(), cliente.getCognome(), cliente.getEmail(), cliente.getTel());
        this.cliente = cliente;
        articoli = new Articolo[10];
        this.tot = 0;

    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void addArticle(Articolo art) {
        for (int i = 0; i < this.articoli.length - 1; i++) {
            if (articoli[i] == null) {
                break;
            }
            articoli[i + 1] = articoli[i];
        }
        articoli[0] = art;
        this.tot = this.tot + art.getPrezzo();
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

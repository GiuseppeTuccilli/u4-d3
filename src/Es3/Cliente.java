package Es3;

import java.util.Random;

public class Cliente {
    private final int codice;
    private final String nome;
    private final String cognome;
    private String email;
    private String telefono;

    public Cliente(String nome, String cognome, String email, String telefono) {
        Random rdm = new Random();
        this.codice = rdm.nextInt(100);
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;

    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTel() {
        return this.telefono;
    }

    public int getCodice() {
        return this.codice;

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

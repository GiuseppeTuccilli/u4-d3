package Es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tel;
        System.out.println("nuova sim, inserire un numero di telefono...");
        tel = scanner.nextLine();
        Sim sim1 = new Sim(tel);
        System.out.println("Sim creata:");
        System.out.println("Numero: " + sim1.getNumero() + "; credito: " + sim1.getCredito());
       

    }
}

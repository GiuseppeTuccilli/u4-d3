package Es2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* String tel;
        System.out.println("nuova sim, inserire un numero di telefono...");
        tel = scanner.nextLine();
        Sim sim1 = new Sim(tel);
        System.out.println("Sim creata:");
        System.out.println("Numero: " + sim1.getNumero() + "; credito: " + sim1.getCredito()); */

        Sim sim2 = new Sim("3333333333");
        sim2.nuovaChiamata(10, "3344515487");
        System.out.println(Arrays.toString(sim2.getChiamate()));

    }
}

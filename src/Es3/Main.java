package Es3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int disp;
        String desc;
        double prezzo;

        System.out.println("Nuovo Articolo:");
        System.out.println("descrizione:");
        desc = scanner.nextLine();
        System.out.println("prezzo:");
        prezzo = Double.parseDouble(scanner.nextLine());
        System.out.println("quantità disponibile:");
        disp = Integer.parseInt(scanner.nextLine());

        Articolo art1 = new Articolo(desc, prezzo, disp);

        Cliente tizio = new Cliente("Tizio", "Caio", "pippohmailcom", "333333333");

        Carrello carrelloDiTizio = new Carrello(tizio);
        System.out.println(carrelloDiTizio.toString());


    }

    ;
}

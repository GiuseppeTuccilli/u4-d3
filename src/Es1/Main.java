package Es1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        int l1, l2;

        System.out.println("inserire l' altezza del rettangolo (intero)");
        l1 = Integer.parseInt(scanner.nextLine());
        System.out.println("inserire la larghezza del rettangolo (intero)");
        l2 = Integer.parseInt(scanner.nextLine());

        Rettangolo ret1 = new Rettangolo(l1, l2);
        Rettangolo ret2 = new Rettangolo(5, 10);

        System.out.println("rettangolo inserito:");
        ret1.stampaRettangolo();

        System.out.println("rettangolo pre - inserito:");
        ret2.stampaRettangolo();

        Rettangolo.stampaDueRettangoli(ret1, ret2);

    }
}
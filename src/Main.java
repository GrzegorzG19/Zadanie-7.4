import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);


        do {

            System.out.println("podaj liczbe");
            a = scan.nextInt();
            if (a < 100) {
                System.out.println("Podana liczba jest za mała  ");
            } else if (a > 200) {
                System.out.println("Podana liczba jest za duża");
            } else if (a % 3 != 0) {
                System.out.println("podana liczba nie jest podzielna przez 3");
            }

        } while (a % 3 != 0 || a <= 100 || a >= 200);

        System.out.println("podana liczba jest ok");

    }
}

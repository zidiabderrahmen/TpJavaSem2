import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Ch, Ch1 = "";
        int i;

        System.out.print("Donner une chaine de caractere : ");
        Ch = sc.nextLine();
        sc.close();

        for (i = Ch.length() - 1; i >= 0; i--) {
            Ch1 += Ch.charAt(i);
        }

        System.out.println("L'inverse de la chaine '" + Ch + "' est : " + Ch1);
    }
}
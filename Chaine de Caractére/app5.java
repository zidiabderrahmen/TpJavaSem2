import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Ch, Ch1="";
        int i;

        System.out.print("Donner une chaine de caractere : ");
        Ch = sc.nextLine();
        sc.close();

        for (i = 0; i < Ch.length(); i++) {
            Ch1 += Ch.charAt(i) + "*";
        }

        System.out.println("La chaine apres le modification est : " + Ch1);
    }
}
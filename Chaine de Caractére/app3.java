import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Ch;
        int start, end;
        Boolean valid = true;

        System.out.print("Donner une chaine de caractere : ");
        Ch = sc.nextLine();
        sc.close();

        start = 0;
        end = Ch.length() / 2;

        while (valid && start <= end) {
            if (Ch.toLowerCase().charAt(start) != Ch.toLowerCase().charAt(Ch.length() - start - 1)) {
                valid = false;
            }else{
                start++;
            }
        }

        if (valid) {
            System.out.println(Ch + " est palindromique!");
        }else{
            System.out.println("'" + Ch + "' est non palindromique!");
        }
    }
}
import java.util.Scanner;

public class app1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Ch;
        char Car;
        int i, occurance = 0;

        System.out.print("Donner une chaine de caractere : ");
        Ch = sc.nextLine();

        System.out.print("Donner une caractere : ");
        Car = sc.nextLine().charAt(0);

        for (i = 0; i < Ch.length(); i++) {
            if(Ch.charAt(i) == Car){
                occurance += 1;
            }
        }

        if (occurance == 0) {
            System.out.println("Il na pas d'occurance de " + Car + " dans le chaine " + Ch);
        }else{
            System.out.println("Le nombre d'occurance de '" + Car + "' dans le chaine '" + Ch + "' est : " + occurance);
        }
    }
}
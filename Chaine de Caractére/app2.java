import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Ch;

        System.out.print("Donner une chaine de caractere : ");
        Ch = sc.nextLine();

        if(Ch.indexOf(" ") == -1){
            System.out.println("La chaine Ch contient une seule mot donc le premier mot de la chaine est : " + Ch);
        }else{
            System.out.println("La premier mot de la chaine Ch est : " + Ch.substring(0, Ch.indexOf(" ")));
        }
    }
}
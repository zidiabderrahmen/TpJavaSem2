import java.util.Scanner;

public class App5 {

    public static String Lecture(){
        Scanner sc = new Scanner(System.in);
        String ch;

        do {
            System.out.print("Donner un chaine de caractere : ");
            ch = sc.next();
        }while(ch.length() > 50);

        sc.close();

        return ch;
    }

    public static int Nbr_Occ_rec(char c, String ch){
        if (ch == ""){
            return 0;
        }else if (ch.charAt(0) == c){
            return 1 + Nbr_Occ_rec(c, ch.substring(1));
        }else{
            return 0 + Nbr_Occ_rec(c, ch.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner un caractere : ");
        char c = sc.next().charAt(0);

        String ch = Lecture();
        
        int nbr = Nbr_Occ_rec(c, ch);

        System.out.println("Le nombre de caractere " + c + " dans le chaine '" + ch + "' est : " + nbr);

        sc.close();
    }
}

import java.util.Scanner;

public class traduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Mot1, Mot2, Text;

        System.out.print("Donner le chaine de caracter : ");
        Text = sc.nextLine();
        
        System.out.print("Donner le premier mot : ");
        Mot1 = sc.nextLine();

        System.out.print("Donner le deuxieme mot : ");
        Mot2 = sc.nextLine();


        if (Text.indexOf(Mot1) == -1){
            System.out.println(Mot1 + " n'existe pas dans " + Text);
        }else{
            Text = Text.replace(Mot1, Mot2);

            System.out.println("Le nauveaux Text est : " + Text);
        }


    }
}
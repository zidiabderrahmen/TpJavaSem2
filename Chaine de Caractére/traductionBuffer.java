import java.util.Scanner;

public class traductionBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Mot1, Mot2;
        StringBuffer Text;

        System.out.print("Donner le chaine de caracter : ");
        Text = new StringBuffer(sc.nextLine());
        
        System.out.print("Donner le premier mot : ");
        Mot1 = sc.nextLine();

        System.out.print("Donner le deuxieme mot : ");
        Mot2 = sc.nextLine();

        if (Text.indexOf(Mot1) == -1){
            System.out.println(Mot1 + " n'existe pas dans " + Text);
        }else{
            Text = new StringBuffer(Text.toString().replace(Mot1, Mot2));
            System.out.println("Le nouveaux Text est : " + Text);
        }
    }
}
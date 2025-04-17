import java.util.Scanner;
public class Exercice3{

    public static String Groupe(String verbe){
        if (verbe.endsWith("er") && ! verbe.equals("aller")){
            return "Premier Groupe";
        }else if(verbe.endsWith("ir")){
            return "Deuxieme Groupe";
        }else{
            return "Troisieme Groupe";
        }
    }

    public static Boolean EstInf(String verbe){
        return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String verbe;

        do {
            System.out.print("Donner un verbe a l'infinitif : ");
            verbe = sc.next();
        }while(!EstInf(verbe.toLowerCase()));

        System.out.println(verbe + " est a " + Groupe(verbe.toLowerCase()));
    }
}
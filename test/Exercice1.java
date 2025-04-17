import java.util.Scanner;
public class Exercice1{

    public static int Lecture(){
        String ch;
        int nb;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Donner un valeur positif : ");
            ch = sc.next();
            try{
                nb = Integer.parseInt(ch);
            }catch(Exception e){
                nb = 0;
            }
        }while(nb <= 0);

        return nb;
    }

    public static int Compter(int nb){
        int n = 0;
        while (nb != 0){
            nb /= 10;
            n ++;
        }

        return n;
    }

    public static void main(String[] args){
        int nb = Lecture();
        System.out.println("Le nombre '" + nb + "' contient " + Compter(nb) + " Chiffres");
    }
}
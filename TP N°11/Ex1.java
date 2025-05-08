import java.util.Scanner;
public class Ex1{

    public static double Somme (double[] tab){
        double s = 0;

        for (int i = 0; i < tab.length; i++){
            s+= tab[i];
        }

        return s;
    }

    public static void Incre (double[] tab, double value){
        for (int i = 0; i < tab.length; i++){
            tab[i] += value;
        }
    }

    public static void Affiche (double[] tab){
        for (int i = 0; i < tab.length; i++){
            if (i == 0){
                System.out.print("[" + tab[i]);
            }else if (i == tab.length - 1){
                System.out.println("," + tab[i] +"]");
            }else{
                System.out.print("," + tab[i]);
            }
        }
    }

    public static void main(String[] args){
        double[] tab = {1, 2, 5.7, 15.5};

        System.out.print("Le tableaux est : ");

        Affiche(tab);

        System.out.println("La somme de tableaux est : " + Somme(tab));

        Scanner sc = new Scanner(System.in);

        System.out.print("Donner un double : ");

        double value = sc.nextDouble();

        Incre(tab, value);

        System.out.print("Le tableaux apres l'incrementation est : ");

        Affiche(tab);
    }
} 
import java.util.Scanner;
public class App1{

    public static int LectureN(){
        Scanner sc = new Scanner(System.in);
        int nb;
        String ch;

        do {
            System.out.print("Donner un entier positif : ");
            ch = sc.next();
            try{
                nb = Integer.parseInt(ch);
            }catch(Exception e){
                nb = 0;
            }
        }while(nb <= 0);

        return nb;
    }

    public static void RemplirTab(int[] tab, int nb){
        Scanner sc = new Scanner(System.in);
        String ch;

        for(int i = 0; i < nb; i++){
            ch = "";
            do{
                System.out.print("Donner un entier N°" + (i+1) + " : ");
                ch = sc.next();
                try{
                    tab[i] = Integer.parseInt(ch);
                }catch(Exception e){
                    ch = "";
                }
            }while(ch == "");
        }
    }

    public static void Remplacer(int[] tab, int nb, int x1, int x2){
        for (int i = 0; i < nb; i++){
            if (tab[i] == x1){
                tab[i] = x2;
            }
        }
    }

    public static void Afficher(int[] tab, int nb){
        for (int i = 0; i < nb; i++){
            System.out.println(tab[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = 0, x2 = 0;
        String ch;

        int nb = LectureN();

        int[] tab1 = new int[nb];

        RemplirTab(tab1, nb);

        System.out.println("Tableau Avant : ");
        Afficher(tab1, nb);

        do{
            System.out.print("Donner x1 : ");
            ch = sc.next();
            try{
                x1 = Integer.parseInt(ch);
            }catch(Exception e){
                ch = "";
            }
        }while(ch == "");

        do{
            System.out.print("Donner x2 : ");
            ch = sc.next();
            try{
                x2 = Integer.parseInt(ch);
            }catch(Exception e){
                ch = "";
            }
        }while(ch == "");

        Remplacer(tab1, nb, x1, x2);

        System.out.println("Tableau apres : ");
        Afficher(tab1, nb);
    }
}
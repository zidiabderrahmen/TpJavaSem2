import java.util.Scanner;

public class App6 {

    public static int Lecture(){
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

        sc.close();

        return nb;
    }

    public static void RemplirTab(int[] tab, int n){
        Scanner sc = new Scanner(System.in);
        String ch;

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Donner la case N°" + (i+1) +" : ");
                ch = sc.next();
                try{
                    tab[i] = Integer.parseInt(ch);
                }catch(Exception e){
                    tab[i] = 0;
                }
            }while(tab[i] <= 0);
        }

        sc.close();
    }

    public static int SommeTab_rec(int[] tab, int n){
        if (n == -1){
            return 0;
        }else{
            return tab[n] + SommeTab_rec(tab, n - 1);
        }
    }

    public static void main(String[] args) {
        int n = Lecture();
        int[] t = new int[n];
        RemplirTab(t, n);
        int somme = SommeTab_rec(t, n);
        System.out.println("la somme du tableau recursivement est : " + somme);
    }
}

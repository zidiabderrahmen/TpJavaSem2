import java.util.Scanner;

public class App3 {

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

    public static boolean EstPremier_rec(int n, int i){
        if (i == n){
            return true;
        }else if (n % i == 0 && i != 1){
            return false;
        }else{
            return EstPremier_rec(n, i + 1);
        }
    }

    public static void main(String[] args) {
        int n = Lecture();
        boolean isPremier = EstPremier_rec(n, 1);

        if (isPremier){
            System.out.println("L'entier " + n + " est premier!");
        }else{
            System.out.println("L'entier " + n + " est non premier!");
        }
    }
}

import java.util.Scanner;

public class App2 {

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
    
    public static int Factoriel_rec(int n){
        if (n == 0){
            return 1;
        }else{
            return n * Factoriel_rec(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = Lecture();
        int fact = Factoriel_rec(n);
        System.out.println("Le factoriel de " + n + " est " + fact);
    }
}

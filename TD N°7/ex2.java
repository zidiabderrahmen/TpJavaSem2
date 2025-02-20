import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] M;
        int n, i, j, s=0;

        do{
            System.out.print("Donner les lignes et collonne de matrice M : ");
            n = sc.nextInt();
        }while(n < 0);

        M = new int[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++){
                System.out.print("M[" + i + "]" + "[" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < n; i++) {
            s+= M[i][i];
        }

        System.out.println("La somme des element de la diagonal est : " + s);
    }
}
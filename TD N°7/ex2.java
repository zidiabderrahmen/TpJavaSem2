import java.util.Scanner;

public class ex2{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j, sDiag = 0;
        int[][] M;

        do{
            System.out.print("Donner le nombre des lignes et des colonne de matrice carée M : ");
            n = sc.nextInt();
        }while(n < 0);

        M = new int[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("M[" + i + "]" + "[" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < n; i++){
            sDiag+= M[i][i];
        }

        System.out.println("La somme de la diagonal est : " + sDiag);
    }
}
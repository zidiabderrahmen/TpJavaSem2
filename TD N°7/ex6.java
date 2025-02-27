import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] M;
        int i, j, n1, n2, sLn;

        do{
            System.out.print("Donner les lignes de matrice M : ");
            n1 = sc.nextInt();
        }while(n1 < 0);

        do{
            System.out.print("Donner les colonnes de matrice M : ");
            n2 = sc.nextInt();
        }while(n2 < 0);

        M = new int[n1][n2];

        for (i = 0; i < n1; i++) {
            for (j = 0; j < n2; j++){
                System.out.print("M[" + i + "]" + "[" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < n1; i++) {
            sLn = 0;
            for (j = 0; j < n2; j++){
                sLn+= M[i][j];
            }
            System.out.println("La somme de ligne N°" + (i+1) + " : " + sLn);
        }
    }
}
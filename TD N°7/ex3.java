import java.util.Scanner;

public class ex3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] M;
        int n1, n2, i, j, s = 0, p = 1;
        double m;

        do{
            System.out.print("Donner les lignes du Matrice M: ");
            n1 = sc.nextInt();
        }while(n1 < 0);

        do{
            System.out.print("Donner les colonnes du Matrice M: ");
            n2 = sc.nextInt();
        }while(n2 < 0);

        M = new int[n1][n2];

        for (i = 0; i < n1; i++) {
            for (j = 0; j < n2; j++) {
                System.out.print("M[" + i + "," + j + "]= ");
                M[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < n1; i++) {
            for (j = 0; j < n2; j++) {
                s+= M[i][j];
                p*= M[i][j];
            }
        }

        m = s / ((double) n1 * (double) n2);

        System.out.println("Le somme du la matrice M est : " + s);
        System.out.println("Le produit du la matrice M est : " + p);
        System.out.println("Le moyenne du la matrice M est : " + m);
    }
}
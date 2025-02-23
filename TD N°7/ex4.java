import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, j;
        Boolean sym = true;
        int[][] M;

        do{
            System.out.print("Donner le nombre des lignes et des colonne de matrice caree M : ");
            n = sc.nextInt();
        }while(n < 0);

        M = new int[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("M[" + i + "]" + "[" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }

        i = 0;
        j = 0;
        while (sym && i < n) {
            if (M[i][j] != M[j][i]) {
                sym = false;
            }else if (i < n && j == (n - 1)) {
                j = 0;
                i++;
            }else{
                j++;
            }
        }

        if (sym) {
            System.out.println("La matrice est symetrique!");
        }else{
            System.out.println("La matrice est non symetrique!");
        }
    }
}
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nl, nc, maxL, minL;
        int[][] M;
        int[] minT, maxT;

        do{
            System.out.print("Donner les lignes de matrice M : ");
            nl = sc.nextInt();
        }while(nl < 0);

        do{
            System.out.print("Donner les colonnes de matrice M : ");
            nc = sc.nextInt();
        }while(nc < 0);

        M = new int[nl][nc];
        minT = new int[nl];
        maxT = new int[nl];

        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++){
                System.out.print("M[" + i + "]" + "[" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < nl; i++) {
            maxL = 0;
            minL = M[i][0];
            for (j = 0; j < nc; j++){
                if (M[i][j] > maxL){
                    maxL = M[i][j];
                }
                if (M[i][j] < minL) {
                    minL = M[i][j];
                }
            }
            maxT[i] = maxL;
            minT[i] = minL;
        }

        for (i = 0; i < nl; i++) {
            System.out.println("Ligne N" + (i + 1) + ": Le maximum est: " + maxT[i] + " le minimum est: " + minT[i]);
        }
    }
}
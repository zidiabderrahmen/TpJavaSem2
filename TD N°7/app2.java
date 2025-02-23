import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nl, nc, i, j, s, p;
        double m;
        int[][] M;

        do{
            System.out.print("Donner les lignes de matrice M : ");
            nl = sc.nextInt();
        }while(nl < 1 || nl > 29);

        do{
            System.out.print("Donner les colonnes de matrice M : ");
            nc = sc.nextInt();
        }while(nc < 1 || nc > 29);

        M = new int[nl][nc];

        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++){
                System.out.print("M[" + i + "]" + "[" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }

        s = 0;
        p = 1;

        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++){
                s+= M[i][j];
                p*= M[i][j];
            }
        }

        m = (double) s / (nl * nc);

        System.out.println("La somme des element du matrice est " + s);
        System.out.println("Le produit des element du matrice est " + p);
        System.out.println("La moyenne des element du matrice est " + m);
    }
}
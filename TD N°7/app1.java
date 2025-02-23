import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nl, nc, x, i, j;
        int[][] M;
        boolean valid;

        do{
            System.out.print("Donner les lignes de matrice M : ");
            nl = sc.nextInt();
        }while(nl < 1 || nl > 49);

        do{
            System.out.print("Donner les colonnes de matrice M : ");
            nc = sc.nextInt();
        }while(nc < 1 || nc > 49);

        M = new int[nl][nc];

        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++) {
                do{
                    System.out.print("M[" + i + "]" + "[" + j + "] = ");
                    M[i][j] = sc.nextInt();
                }while(M[i][j] % 2 != 0);
            }
        }

        do{
            System.out.print("Donner un entier pair x : ");
            x = sc.nextInt();
        }while(x % 2 != 0);

        i = 0;
        j = 0;

        valid = false;
        
        while(valid == false && i < nl && j < nc){
            if (M[i][j] == x) {
                valid = true;
            }else if (i < nl && j == (nc - 1)) {
                j = 0;
                i++;
            }else{
                j++;
            }
        }

        if (valid) {
            System.out.println(x + " existe dans la matrice M!");
        }else{
            System.out.println(x + " n'existe pas dans la matrice M!");
        }
    }
}

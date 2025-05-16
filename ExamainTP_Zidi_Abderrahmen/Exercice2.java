package ExamainTP_Zidi_Abderrahmen;

import java.util.Scanner;

public class Exercice2 {

    public static void AfficheDonne(String[][] M, char c, int nl){
        for (int j = 1; j < nl; j++) {
            if (String.valueOf(M[2][j].charAt(0)).equalsIgnoreCase(String.valueOf(c))) {
                System.out.println("NumVol : " + M[0][j] + "| VDep : " + M[1][j] + "| VDest : " + M[2][j] + "| CodeAv : " + M[3][j] + "| ClassAv : " + M[4][j] + "| PrixVol : " + M[5][j]);
            }
        }
        System.out.println();
    }

    public static void AfficheRemise(String[][] M, int nl) {
        for (int j = 1; j < nl; j++) {
            M[5][j] = String.valueOf(Exercice1.Convertir(M[5][j]) * 0.8);
        }
        Exercice1.AffichageM(M, nl);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] M = {
            {"NumVol", "1", "2", "3", "4"},
            {"VDep", "Tozeur", "Tozeur", "Tunis", "Djerba"},
            {"VDest", "Djerba", "Tunis", "Djerba", "Sfax"},
            {"CodeAv", "Ab01", "Ab02", "Ab03", "Ab04"},
            {"ClassAv", "A1", "A2", "A1", "A2"},
            {"PrixVol", "156", "250", "140", "120"}
        };

        System.out.print("Entrez la premiére lettre de la ville de destination : ");
        char car = sc.next().charAt(0);

        System.out.println("Vols correspondant : ");
        AfficheDonne(M, car, 5);

        System.out.println("Application d'une remise de 20% sur tous les vols...");
        System.out.println("\nTableau aprés remise :");
        AfficheRemise(M, 5);

        sc.close();
    }
}

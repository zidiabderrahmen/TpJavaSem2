package ExamainTP_Zidi_Abderrahmen;

public class Exercice1 {

    public static double Convertir(String ch){
        return Double.parseDouble(ch);
    }

    public static void AffichageM(String[][] M, int nl) {
        for (int j = 1; j < nl; j++) {
            System.out.println("NumVol : " + M[0][j] + "| VDep : " + M[1][j] + "| VDest : " + M[2][j] + "| CodeAv : " + M[3][j] + "| ClassAv : " + M[4][j] + "| PrixVol : " + M[5][j]);
        }
    }
}

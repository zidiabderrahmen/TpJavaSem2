import java.util.Scanner;
public class App2{

    public static int LectureN(){
        Scanner sc = new Scanner(System.in);
        int nb;
        String ch;

        do {
            System.out.print("Donner un entier positif : ");
            ch = sc.next();
            try{
                nb = Integer.parseInt(ch);
            }catch(Exception e){
                nb = 0;
            }
        }while(nb <= 0);

        return nb;
    }

    public static void RemplirTab(float[] tab, int nb){
        Scanner sc = new Scanner(System.in);
        String ch;

        for(int i = 0; i < nb; i++){
            ch = "";
            do{
                System.out.print("Donner un entier N°" + (i+1) + " : ");
                ch = sc.next();
                try{
                    tab[i] = Float.parseFloat(ch);
                }catch(Exception e){
                    ch = "";
                }
            }while(ch == "" || tab[i] < 0 || tab[i] > 20);
        }
    }

    public static float Calcul_Moy(float[] tab){
        float moy = 0;
        
        for(int i = 0; i < tab.length; i++){
            moy+= tab[i];
        }

        return moy / tab.length;
    }

    public static int NombreNote(float[] tab, float moy){
        int nbrs = 0;

        for(int i = 0; i < tab.length; i++){
            if (tab[i] > moy){
                nbrs++;
            }
        }

        return nbrs;
    }

    public static void main(String[] args){
        int n, nbrs;
        float[] tab;
        float moy;

        n = LectureN();
        tab = new float[n];

        RemplirTab(tab, n);


        moy = Calcul_Moy(tab);
        System.out.println("Le moyenne est : " + moy);

        nbrs = NombreNote(tab, moy);
        System.out.println("Les nombres > de " + moy + " est " + nbrs);
    }

}
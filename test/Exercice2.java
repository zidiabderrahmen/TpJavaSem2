import java.util.Scanner;
public class Exercice2{

    public static String Lecture(){
        Scanner sc = new Scanner(System.in);
        String op, result, ch, nb1, nb2;
        Boolean valid = false;
        float nb1F = 0, nb2F = 0;

        do{
            System.out.print("Donner un operation : ");
            op = sc.next();
            switch (op){
                case "+" : valid = true;
                break;
                case "-" : valid = true;
                break;
                case "*" : valid = true;
                break;
                case "/" : valid = true;
                break;
                default : valid = false;
            }
        }while(valid == false);

        do {
            System.out.print("Donner La premier nombre : ");
            ch = sc.next();
            try{
                nb1F = Float.parseFloat(ch);
            }catch (Exception e){
                ch = "";
            }
        }while (ch == "");

        if (nb1F == (int) nb1F){
            nb1 = String.valueOf((int) nb1F);
        }else{
            nb1 = String.valueOf(nb1F);
        }

        do {
            System.out.print("Donner La deuzieme nombre : ");
            ch = sc.next();
            try{
                nb2F = Float.parseFloat(ch);
            }catch (Exception e){
                ch = "";
            }
        }while (ch == "");

        if (nb2F == (int) nb2F){
            nb2 = String.valueOf((int) nb2F);
        }else{
            nb2 = String.valueOf(nb2F);
        }

        switch (op){
            case "+" : result = Addition(nb1F, nb2F);
            break;
            case "-" : result = Soustraction(nb1F, nb2F);
            break;
            case "*" : result = Multiplication(nb1F, nb2F);
            break;
            default : result = Division(nb1F, nb2F);
        }

        return nb1 + " " + op + " " + nb2 + " = " + result;
    }

    public static String Addition(float nb1, float nb2){
        float resultF = nb1 + nb2;
        int resultI = (int) (nb1 + nb2);
        if (resultF == resultI){
            return String.valueOf(resultI);
        }else{
            return String.valueOf(resultF);
        }
    }

    public static String Soustraction(float nb1, float nb2){
        float resultF = nb1 - nb2;
        int resultI = (int) (nb1 - nb2);
        if (resultF == resultI){
            return String.valueOf(resultI);
        }else{
            return String.valueOf(resultF);
        }
    }

    public static String Multiplication(float nb1, float nb2){
        float resultF = nb1 * nb2;
        int resultI = (int) (nb1 * nb2);
        if (resultF == resultI){
            return String.valueOf(resultI);
        }else{
            return String.valueOf(resultF);
        }
    }

    public static String Division(float nb1, float nb2){
        if (nb2 == 0){
            return "Erreur";
        }else{
            float resultF = nb1 / nb2;
            int resultI = (int) (nb1 / nb2);
            if (resultF == resultI){
                return String.valueOf(resultI);
            }else{
                return String.valueOf(resultF);
            }
        }
    }

    public static void main(String[] args){
        System.out.println(Lecture());
    }
}
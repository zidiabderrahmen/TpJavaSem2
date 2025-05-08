import java.util.Scanner;

public class App4 {

    public static String Lecture(){
        Scanner sc = new Scanner(System.in);
        String ch;

        do {
            System.out.print("Donner un chaine de caractere : ");
            ch = sc.next();
        }while(ch.length() > 30);

        sc.close();

        return ch;
    }

    public static boolean Palindrome_rec(String ch){
        if (ch == "" || ch.length() == 1){
            return true;
        }else if (ch.charAt(0) != ch.charAt(ch.length() - 1)){
            return false;
        }else{
            return Palindrome_rec(ch.substring(1, ch.length() - 1));
        }
    }

    public static void main(String[] args) {
        String ch = Lecture();
        boolean palin = Palindrome_rec(ch);

        if (palin){
            System.out.println("Le chaine '" + ch + "' est palindromique!");
        }else{
            System.out.println("Le chaine '" + ch + "' est non palindromique!");
        }
    }
}

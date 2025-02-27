public class chaineExp {
    public static void main(String[] args) {
        String ch1 = "Coucou";
        String ch2 = new String("C'est moi !\n");
        String ch3 = ch1 + ch2;
        System.out.println(ch3);
        System.out.println("Longeur de ch1 :" + ch1.length());
        System.out.println("Caractere en position 2 : " + ch1.charAt(2));
        System.out.println(ch1.equals("Coucou"));
        System.out.println(ch1.equals(ch2));
        System.out.println("Position de o dans ch1 ? " + ch1.indexOf('o'));
        System.out.println("Position de cou dans ch1 ?" + ch1.indexOf("cou"));
        System.out.println("Position de moi dans ch1 ?" + ch1.indexOf("moi"));
        System.out.println("Ch1 en majuscules : " + ch1.toUpperCase());
        System.out.println("Ch1 en minuscule : " + ch1.toLowerCase());
    }
}
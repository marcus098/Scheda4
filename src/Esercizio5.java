import java.util.Scanner;

/* Anagrammi
Due stringhe a e b sono dette anagrammi se contengono gli stessi caratteri con le stesse
frequenze. Ad esempio, gli anagrammi di CAT sono CAT, ACT, TAC, TCA, ATC, e CTA.
Date due stringhe a e b in input, stampare «anagrammi» se sono anagrammi (case-insensitive),
«non anagrammi» altrimenti*/
public class Esercizio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire la prima stringa: ");
        String s1 = sc.nextLine();
        System.out.print("Inserire la seconda stringa: ");
        String s2 = sc.nextLine();
        System.out.println(check(s1.toLowerCase().trim(), s2.toLowerCase().trim()));
    }

    public static String check(String str1, String str2) {
        String s1 = str1, s2 = str2;
        if (str1.length() < str2.length()) {
            s1 = str2;
            s2 = str1;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ') {
                if (s2.indexOf(s1.charAt(i)) == -1) {
                    return "Non Anagramma";
                } else {
                    if (s1.charAt(i) != ' ' && !count(s1.charAt(i), s1, s2))
                        return "Non Anagramma";
                }
            }
        }
        return "Anagramma";
    }

    public static boolean count(char c, String s1, String s2) {
        int cont1 = 0, cont2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == c)
                cont1++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == c)
                cont2++;
        }
        if (cont1 == cont2)
            return true;

        return false;
    }
}


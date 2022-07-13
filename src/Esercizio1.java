import java.util.Scanner;

public class Esercizio1 {
    /*Scrivete una funzione che dato in input un numero di secondi, restituisce una
    stringa che dice «Giorni: numero di giorni, Ore: numero di ore etc…»*/
    public static void main(String[] args) {
        double prova = 0.4;
        System.out.println(Math.ceil(prova));
        Scanner sc = new Scanner(System.in);
        System.out.println(("Inserire i secondi: "));
        //int seconds = sc.nextInt();
        System.out.println(calcolaSecondi(sc.nextInt()));
    }

    public static String calcolaSecondi(int seconds) {
        double tmp = 0.0, tmp2 = 0.0;
        String str = "";
        if (seconds < 60) {
            return "Secondi: " + seconds;
        }
        //calcolo i minuti con resto minutsecondi
        tmp = seconds / 60.0;
        int minuti = (int) (tmp);
        tmp2 = tmp - minuti;
        int secondi = (int) Math.ceil(tmp2 * 60);
        if (minuti < 60) {
            return "Minuti: " + minuti + " Secondi: " + secondi;
        }
        //calcolo le ore con resto minuti
        tmp = minuti / 60.0;
        int ore = (int) (tmp);
        tmp2 = tmp - ore;
        minuti = (int) Math.ceil(tmp2 * 60);
        if (ore < 24) {
            return "Ore: " + ore + " Minuti: " + minuti + " Secondi: " + secondi;
        }
        //calcolo i giorni con resto ore
        tmp = ore / 24;
        int giorni = (int) (tmp);
        tmp2 = tmp - giorni;
        ore = (int) Math.ceil(tmp2) * 24;
        return "Giorni: " + giorni + "Ore: " + ore + "vMinuti: " + minuti + " Secondi: " + secondi;
    }

}

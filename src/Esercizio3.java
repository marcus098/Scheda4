import java.util.Arrays;
import java.util.Scanner;

public class Esercizio3 {
    /*Tabelline
    Scrivete una funzione che dato in input due numeri n ed m, crea un array lungo m
    che in ogni cella ha il valore di indice della cella moltiplicato per n
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        int n = sc.nextInt();
        System.out.print("Inserisci lunghezza array: ");
        int m = sc.nextInt();
        System.out.println(Arrays.toString(tabellina(n, m)));
    }

    public static int[] tabellina(int n, int m) {
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = n * i;
        }
        return arr;
    }
}

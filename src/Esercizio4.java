import java.util.Arrays;
import java.util.Scanner;

public class Esercizio4 {
    /* Fibonacci
        Scrivere un metodo che stampa l’ennesimo elemento della sequenza di Fibonacci, nella quale
        ogni numero è definito dalla somma dei due precedenti, eccetto i primi due che sono per
        definizione 0 e 1. Esempio: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... E così via.
        Assumete di iniziare da 0, dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e così via.
        Suggerimento: inserite il codice della vostra soluzione all’interno del metodo fibonacci del
        codice che trovate a questo indirizzo:
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci lunghezza array: ");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(fibonacci(n)));
    }

    public static int[] fibonacci(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr[i] = 0;
            } else if (i == 1) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
        }
        return arr;
    }
}

import java.util.Arrays;

public class Esercizio2 {
    /*Da dispari a pari
    Scrivete una funzione che dato un array di valori ne restituisce una copia dove i
    numeri dispari sono stati moltiplicati per 2
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 13, 10, 15};
        System.out.println(Arrays.toString(pariToDispari(arr)));
    }

    public static int[] pariToDispari(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] *= 2;
            }
        }
        return arr;
    }
}

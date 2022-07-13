import java.util.Arrays;
import java.util.Scanner;

public class Esercizio6 {
    /*Dato un array di interi (inseriti dall’utente, separati da virgola e senza spazi), effettuare la
    conversione dei valori in interi e stampare in ordine minimo e massimo (separati da virgola).
    Gli interi inseriti possono anche assumere valori negativi*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci numeri semarati da virgola: ");
        String a = sc.nextLine();
        int[] arr = parseNumbers(a);
        printMinMax(arr);
        minMax(arr);
    }

    public static int[] parseNumbers(String s) {
        String[] str = s.trim().split(",");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    public static void printMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int element : arr) {
            if (element > max)
                max = element;
            if (element < min)
                min = element;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }

    public static void minMax(int[] arr) {
        System.out.println("Metodo con ordinamento");
        int[] newArr = arr.clone();
        int tmp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(newArr[j] < newArr[j-1]){ // 2 < 5
                    tmp = newArr[j];    //2
                    newArr[j] = newArr[j-1]; //2 -> 5
                    newArr[j-1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(newArr));
        System.out.println("Min: " + newArr[0] + ", Max: " + newArr[newArr.length-1]);
    }
}

import java.util.Arrays;

public class Esercizio7 {

    /*Somma Diagonale
    Scrivete una funzione che data una matrice quadrata in input, restituisce la somma
della diagonale da sinistra a destra.
• Scrivete una seconda funzione che presa una matrice quadrata e un booleano a
seconda del valore del booleano restituisce o la somma della diagonale da sinistra
a destra o quella da destra a sinistra.
• Hint: usate la prima funzione nella seconda!
     */
    public static void main(String[] args) {
        int n = 0;
        while(n==0){
            n = (int) (Math.random() * 5);
        }
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println(sum(matrix) + "");
        System.out.println(sum(matrix, true) + "");
        System.out.println(sum(matrix, false) + "");
    }

    public static int sum(int[][] matrix) {
        int s = 0;
        for (int i = 0; i < matrix.length; i++) {
            s += matrix[i][i];
        }
        return s;
    }

    public static int sum(int[][] matrix, boolean bool) {
        int s = 0;
        if (bool) {
            return sum(matrix);
        } else {
            for (int i = 0; i < matrix.length; i++) {
                s += matrix[i][matrix.length - 1 - i];
            }
        }
        return s;
    }

}

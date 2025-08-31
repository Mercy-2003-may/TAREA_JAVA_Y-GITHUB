import java.util.Arrays;

public class OrdenarMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {34, 21, 5},
            {12, 45, 9},
            {8, 19, 27}
        };

        // Mostrar matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Ordenar cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
        }

        // Mostrar matriz con todas las filas ordenadas
        System.out.println("\nMatriz con todas las filas ordenadas:");
        mostrarMatriz(matriz);
    }

    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}

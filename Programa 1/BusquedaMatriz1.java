/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class BusquedaMatriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 // Definimos una matriz 3x3
        int[][] matriz = {
            {5, 8, 3},
            {2, 9, 4},
            {7, 1, 6}
        };

        int valorBuscado = 9; // Puedes cambiar este valor
        boolean encontrado = false;

        // Recorremos la matriz para buscar el valor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorBuscado) {
System.out.println("Valor " + valorBuscado + " encontrado en la posicion [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Valor " + valorBuscado + " no encontrado en la matriz.");
        }
    }
    }
   

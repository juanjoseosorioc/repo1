package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

	private static Scanner entrada;

	public static void main(String[] args) {

		int[] arrNoOrdenado, arrOrdenado;
		Random rn = new Random();

		int longitud = 0, opcion = 0;
		entrada = new Scanner(System.in);

		//System.out.print("Ingrese la cantidad de elementos del arreglo: ");
		System.out.print("Ingrese el numero de elementos del arreglo: ");
		longitud = entrada.nextInt();

		arrNoOrdenado = new int[longitud];
		arrOrdenado = new int[longitud];

		for (int i = 0; i < longitud; i++) {
			arrNoOrdenado[i] = rn.nextInt(20) + 1;
		}
		System.out.println("Areglo Desordenado: "
				+ Arrays.toString(arrNoOrdenado));

		while (opcion != 3) {
			System.out
					.print("Ingrese el algoritmo a usar:\n[1] QuickSort\n[2] Bubble Sort\n[3] Salir\n");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				QuickSort objAlgoritmoQuickSort = new QuickSort();
				objAlgoritmoQuickSort.sort(arrNoOrdenado);
				arrOrdenado = arrNoOrdenado;
				System.out
						.println("Areglo Ordenado por algoritmo 'Quicksort': "
								+ Arrays.toString(arrOrdenado));
				break;
			case 2:
				BubbleSort objAlgoritmoBubbleSort = new BubbleSort();
				objAlgoritmoBubbleSort.sort(arrNoOrdenado);
				System.out
						.println("Areglo Ordenado por algoritmo 'Bubble Sort': "
								+ Arrays.toString(arrNoOrdenado));
				break;
			case 3:				
				return;				
			default:
				System.out.println("Opcion inválida.");
			}
		}

	}

}

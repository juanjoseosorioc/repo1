package app;

import java.util.Arrays;

public class QuickSort {
	
	private int[] numbers;
	private int tamanio;

	public void sort(int[] values) {
		/* revisa si el arreglo esta vacio inicialmente */
		if (values == null || values.length == 0) {
			return;
		}
		this.numbers = values;
		tamanio = values.length;
		quicksort(0, tamanio - 1);
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;
		/* Obtiene el elemento pivot desde el medio de la lista */
		int pivot = numbers[low + (high - low) / 2];

		/* Divide la lista en dos */
		while (i <= j) {
			/* Si el elemento actual de la lista de la izquierda es mas pequeño que el pivot
			 entonces obtenemos el siguiente elemento de la lista de la izquierda */
			while (numbers[i] < pivot) {
				i++;
			}
			/* Si el elemento actual de la lista de la derecha es mayor que el pivot
			 entonces obtenemos el siguiente elemento de la lista de la derecha */ 
			while (numbers[j] > pivot) {
				j--;
			}

			/* Si hemos encontrado los valores en la lista de la izquierda el cual es mayor que el elemento pivot
			 y hemos encontrado un valor en la lista de la derecha que es menor que el elemento pivot
			 entonces deberemos incercambiar los valores encontrados. Es ahi donde incrementamos i y decrementamos j. */			
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		System.out.println("Ubicacion de inicio: " + low);
		System.out.println("Ubicacion de fin: " + high);
		System.out.println("Areglo parcialmente ordenado: "+ Arrays.toString(this.numbers));
		/* Llamada recursiva al metodo Quicksort */
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}

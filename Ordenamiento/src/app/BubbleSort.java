package app;

public class BubbleSort {
	
	private int[] numbers;
	@SuppressWarnings("unused")
	private int tamanio;
	
	public void sort(int[] values) {
		/* revisa si el arreglo esta vacio inicialmente */
		if (values == null || values.length == 0) {
			return;
		}
		this.numbers = values;
		this.tamanio = values.length;
		bubbleSort(this.numbers);
	}
		
	public void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i ++ ) {
			for(int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
		}
	}
}

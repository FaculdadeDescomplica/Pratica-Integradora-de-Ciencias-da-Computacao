public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Um por um, coloque o menor elemento no início
        for (int i = 0; i < n - 1; i++) {
            // Encontre o índice do menor elemento no restante do array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Troque o menor elemento encontrado com o primeiro elemento
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        System.out.println("Array desordenado:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nExecutando Selection Sort...");
        selectionSort(numbers);

        System.out.println("\nArray ordenado:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

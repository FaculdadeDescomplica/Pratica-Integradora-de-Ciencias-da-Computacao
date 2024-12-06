public class BuscaBinaria {
    public static int buscaBinaria(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                return mid; // Retorna o índice do elemento encontrado
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 8}; // Array deve estar ordenado
        int x = 5;
        int resultado = buscaBinaria(arr, x);
        if (resultado == -1) {
            System.out.println("Elemento não encontrado.");
        } else {
            System.out.println("Elemento encontrado no índice: " + resultado);
        }
    }
}

/*
*
* Complexidade de Tempo:
*
* Pior Caso: O(log n)– o número de comparações cresce logaritmicamente em relação ao número de elementos.
* Melhor Caso: O(1) – quando o elemento está na posição média.
* Caso Médio: O(log n) – em média, o número de comparações também é logarítmico.
* Complexidade de Espaço: O(1) – para a implementação iterativa, não utiliza espaço adicional significativo.
* */
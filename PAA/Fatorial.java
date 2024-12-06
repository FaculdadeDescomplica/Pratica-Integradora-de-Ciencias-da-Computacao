public class Fatorial {
    public static int fatorial(int n) {
        if (n == 0) { // Caso base
            return 1;
        }
        return n * fatorial(n - 1); // Caso recursivo
    }

    public static void main(String[] args) {
        int numero = 5; // Exemplo: calcular 5!
        System.out.println("Fatorial de " + numero + " é: " + fatorial(numero));
    }
}

/*
* Complexidade de Tempo: O(n)
* Complexidade de Espaço: O(n) (devido à pilha de chamadas)
* */
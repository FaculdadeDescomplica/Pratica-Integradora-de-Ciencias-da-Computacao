import java.util.*;

public class DFS {
    public static void dfs(Map<Integer, List<Integer>> grafo, int inicio) {
        Set<Integer> visitados = new HashSet<>();
        Stack<Integer> pilha = new Stack<>();

        pilha.push(inicio); // Adiciona o nó inicial na pilha
        visitados.add(inicio); // Marca como visitado

        while (!pilha.isEmpty()) {
            int vertice = pilha.pop(); // Remove o nó da pilha
            System.out.print(vertice + " "); // Visita o nó

            // Adiciona os vizinhos não visitados à pilha
            for (int vizinho : grafo.get(vertice)) {
                if (!visitados.contains(vizinho)) {
                    pilha.push(vizinho);
                    visitados.add(vizinho);
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> grafo = new HashMap<>();
        /*
         * 0 -> 1, 2
         * 1 -> 0, 3, 4
         * 2 -> 0
         * 3 -> 1
         * 4 -> 1
         */
        grafo.put(0, Arrays.asList(1, 2));
        grafo.put(1, Arrays.asList(0, 3, 4));
        grafo.put(2, List.of(0));
        grafo.put(3, List.of(1));
        grafo.put(4, List.of(1));

        System.out.print("DFS a partir do nó 0: ");
        dfs(grafo, 0);
    }
}
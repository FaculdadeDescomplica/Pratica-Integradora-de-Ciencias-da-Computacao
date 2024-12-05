import java.util.*;

public class BFS {
    public static void bfs(Map<Integer, List<Integer>> grafo, int inicio) {
        Set<Integer> visitados = new HashSet<>();
        Queue<Integer> fila = new LinkedList<>();

        fila.add(inicio); // Adiciona o nó inicial na fila
        visitados.add(inicio); // Marca como visitado

        while (!fila.isEmpty()) {
            int vertice = fila.poll(); // Remove o nó da fila
            System.out.print(vertice + " "); // Visita o nó

            // Adiciona os vizinhos não visitados à fila
            for (int vizinho : grafo.get(vertice)) {
                if (!visitados.contains(vizinho)) {
                    fila.add(vizinho);
                    visitados.add(vizinho);
                }
            }
        }
    }

    public static void main(String[] args) {
        /*
        * 0 -> 1, 2
        * 1 -> 0, 3, 4
        * 2 -> 0
        * 3 -> 1
        * 4 -> 1
        */
        Map<Integer, List<Integer>> grafo = new HashMap<>();
        grafo.put(0, Arrays.asList(1, 2));
        grafo.put(1, Arrays.asList(0, 3, 4));
        grafo.put(2, List.of(0));
        grafo.put(3, List.of(1));
        grafo.put(4, List.of(1));

        System.out.print("BFS a partir do nó 0: ");
        bfs(grafo, 0);
    }
}
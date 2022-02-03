package vertexJava;

import java.util.*;

public class graphAlgorithms {
    public static void DFS(Vertex source) {
        HashSet<Vertex> visited = new HashSet<Vertex>();
        visited.add(source);
        System.out.println(source.ID);
        for (Vertex neighbor : source.neighbors) {
            if(!visited.contains(neighbor)){
                visited.add(neighbor);
                System.out.println(neighbor.ID);
                DFS(neighbor);
            }
        }

    }

    public static void BFS(Vertex source) {
        // HashSet<Integer> beforeVisited = new HashSet<Integer>();
        // beforeVisited.contains()
        // beforeVisited.add();

    }
}

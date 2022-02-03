package vertexJava;

import java.util.*;

public class Vertex {
    Vertex ID;
    List<Vertex> neighbors;

    //Constructor
    Vertex(Vertex v1){
        ID = v1;
        neighbors = new ArrayList<Vertex>();
    }

    //add neighbor
    void addNeighbor(Vertex neighbor){
        neighbors.add(neighbor);
    }

    //get the i-th neighbors ID
    Vertex getNeighbor(int i){
        return neighbors.get(i);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu913;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author Reddy
 */
public class BelajarAdjList {
    
    


    static class Graph{
        private Map<String, List<Node>> adjacencyList;

        public Graph() {
            this.adjacencyList = new HashMap<>();
        }

        public void addEdge(String source, String destination, int weight) {
//            List<Node> temp = adjacencyList.getOrDefault(source, new ArrayList<>());
//            temp.add(new Node(destination, weight));
//            adjacencyList.put(source, temp );
            
            
            this.adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(new Node(destination, weight));
            this.adjacencyList.computeIfAbsent(destination, k -> new ArrayList<>()).add(new Node(source, weight));
        }

        public int dijkstra(String start, String end) {
            PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
            Map<String, Integer> distances = new HashMap<>();
            Map<String, String> previous = new HashMap<>();
            Set<String> visited = new HashSet<>();

            for (String vertex : this.adjacencyList.keySet()) {
                distances.put(vertex, Integer.MAX_VALUE);
            }
            distances.put(start, 0);
            queue.add(new Node(start, 0));

            while (!queue.isEmpty()) {
                Node current = queue.poll();
                if (!visited.add(current.name)) {
                    continue;
                }

                for (Node neighbor : this.adjacencyList.get(current.name)) {
                    if (!visited.contains(neighbor.name)) {
                        int newDist = distances.get(current.name) + neighbor.weight;
                        if (newDist < distances.get(neighbor.name)) {
                            distances.put(neighbor.name, newDist);
                            previous.put(neighbor.name, current.name);
                            queue.add(new Node(neighbor.name, newDist));
                        }
                    }
                }
            }

            printPath(previous, end);
            return distances.get(end);
        }

        private void printPath(Map<String, String> previous, String end) {
            if (previous.containsKey(end)) {
                printPath(previous, previous.get(end));
            }
            System.out.print(end + " ");
        }

        static class Node {
            String name;
            int weight;

            Node(String name, int weight) {
                this.name = name;
                this.weight = weight;
            }
        }
    }
    
//    A
//   / \
// 1/   \4
// /     \
// B---1---C
//  \    / 
// 3 \  / 1  
//    D    
//  1/   
//  E
//    
    
//
//A - B (1)
//A - C (4)
//B - C (1)
//B - D (3)
//C - D (1)
//D - E (1)
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge("A", "B", 1);
        graph.addEdge("A", "C", 4);
        graph.addEdge("B", "C", 1);
        graph.addEdge("B", "D", 3);
        graph.addEdge("C", "D", 1);
        graph.addEdge("D", "E", 1);

        System.out.println("Shortest path from A to E:");
        System.out.println("Distance: " + graph.dijkstra("A", "E"));
    }
    
    
    
    
    
}

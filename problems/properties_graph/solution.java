import java.util.*;
class Solution {
    public int numberOfComponents(int[][] properties, int k) {
        int n = properties.length;
        
        // Build the graph as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        // Initialize the graph
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        // Create edges between nodes where intersect(properties[i], properties[j]) >= k
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Calculate the intersection of properties[i] and properties[j]
                Set<Integer> setA = new HashSet<>();
                for (int num : properties[i]) {
                    setA.add(num);
                }
                
                Set<Integer> setB = new HashSet<>();
                for (int num : properties[j]) {
                    setB.add(num);
                }
                
                // Retain only the elements that are in both sets (intersection)
                setA.retainAll(setB);
                
                // If the intersection has at least k elements, create an edge between i and j
                if (setA.size() >= k) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        // To count the number of connected components
        boolean[] visited = new boolean[n];
        int componentCount = 0;

        // DFS function to explore the graph
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                // Start DFS from this node and mark all reachable nodes
                dfs(i, graph, visited);
                componentCount++;
            }
        }

        return componentCount;
    }

    // Depth-First Search (DFS) function to visit all nodes in the connected component
    private void dfs(int node, Map<Integer, List<Integer>> graph, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true;

        while (!stack.isEmpty()) {
            int current = stack.pop();
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
        
    }
}
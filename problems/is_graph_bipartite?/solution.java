class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        Arrays.fill(colors, -1); 

        for (int i = 0; i < n; i++) {
            if (colors[i] == -1) { 
                Queue<Integer> qu = new LinkedList<>();
                qu.add(i);
                colors[i] = 0;

                while (!qu.isEmpty()) {
                    int node = qu.poll();
                    int nColor = colors[node] == 0 ? 1 : 0;

                    for (int neighbour : graph[node]) {
                        if (colors[neighbour] == -1) { 
                            colors[neighbour] = nColor;
                            qu.add(neighbour);
                        } else if (colors[neighbour] == colors[node]) { 
                            return false; 
                        }
                    }
                }
            }
        }
        return true;
    }
}
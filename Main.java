import java.util.*;

public class Main {

    public static void bfs(ArrayList<ArrayList<Integer>> adj, int V) {

        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

       
        q.offer(0);
        visited[0] = true;

        while (!q.isEmpty()) {

            int node = q.poll();

            ans.add(node);

            for (int neighbour : adj.get(node)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }

        System.out.println("BFS Traversal:");
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

    
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v):");

        for (int i = 0; i < E; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

        
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        bfs(adj, V);

        sc.close();
    }
}


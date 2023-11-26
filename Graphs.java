//DFS
public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> li = new ArrayList<>(V);
        boolean[] vis = new boolean[V];
        vis[0] = true;
        dfs(li,adj,vis,0);
        return li;
    }
  public static void dfs(ArrayList<Integer> li, ArrayList<ArrayList<Integer>> adj, boolean[] vis ,int node){
        vis[node]=true;
        li.add(node);
        for(Integer i : adj.get(node)){
            if(!vis[i]){
                dfs(li,adj,vis,i);
            }
        }
    }
//edges to adj for undirected
ArrayList<ArrayList<Pair>> adj = new ArrayList<>(vertices);
        for(int i =0;i<vertices;i++){adj.add(new ArrayList<Pair>());}
        for(int i = 0;i<edges;i++){
            int u = edge[i][0];
            int v = edge[i][1];
            int w = edge[i][2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }

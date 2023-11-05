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

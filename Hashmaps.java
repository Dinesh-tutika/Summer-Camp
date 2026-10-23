import java.util.*;
public class Hashmaps {
/*################################           GRAPHS            ######################################## */
    public static class Edge{
        int scr,dest;
        Edge(int scr,int dest){
            this.scr=scr;
            this.dest=dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 3));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 6));
        graph[5].add(new Edge(5, 4));

        graph[6].add(new Edge(6, 5));
    }
    public static void bfs(ArrayList<Edge> graph[],int v){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[v];
        q.add(0);
        while (!q.isEmpty()) {
            int curr=q.poll();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int j=0;j<graph[curr].size();j++){
                    Edge e=graph[curr].get(j);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false){
                dfs(graph, e.dest, vis);
            }
        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        // bfs(graph,v);
        // for(int i=0;i<graph[2].size();i++){
        //     Edge e=graph[2].get(i);
        //     System.out.print("\n"+e.dest+" ");
        // }
        boolean vis[]=new boolean[v];
        dfs(graph, 0, vis);

    }
}




/*#################################            HASH MAP        #####################################3 */
        // HashMap<String, Integer> map=new HashMap<>();
        // map.put("Dinesh", 3);
        // map.put("shyam", 78);
        // map.put("kannaiah", 5);
        // System.out.println(map);
        // System.out.println(map.get("abhi"));
        // System.out.println(map.get("Dinesh"));
        // map.put("abhi", 90);
        // System.out.println(map);
        // System.out.println(map.containsKey("abhi"));
        // System.out.println(map.getOrDefault("abhi",0));
        // for(String key:map.keySet()){
        //     System.out.println(key);
        // }
        // System.out.println(map.containsValue(90));
        // System.out.println(map.keySet());
        // System.out.println(map.values());
        // System.out.println(map.remove("shyam")+"\n"+map);

    

//A HashMap stores data as key-value pairs.keys are unique-adding the same key again overwrites the value 
//the common methods are  
/* put(key,value)           v                  Add or update.if key exists,old values is overwritten.
   get(key)                 v or null           Return value for key ,null if absent.
   getOrDefault(key,def)    v                   Return value OR yous default if absent.use this always!
   containsKey(val)         boolean             O(1) check if key exists.
   remove(key               v                   Removing mappping,return old value.
   keySet()                 Set<k>              All keys as a set*.
   values()                 Collection<v>       All values.
   entrySet()               set<entry>*/


/*Types of graphs
Directed           Edges have directipon-A->B!=B->A
Undirected          Edges go both ways -a-b==b-a 
Weighted
Unweighted
 */

/*BFS  explores all neighbours at the current level before goning deeper.User aQueue(FIFO).Gurantees shortest  */

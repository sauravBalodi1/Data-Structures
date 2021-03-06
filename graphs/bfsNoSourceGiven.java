import java.util.*;
public class bfsNoSourceGiven {
    static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v)
    {
        a.get(u).add(v);
        a.get(v).add(u);
    }
    static void bfs(ArrayList<ArrayList<Integer>> a,int v, boolean []visited)
    {
      int  s=0;
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.add(s);
        while(q.isEmpty()==false)
        {
           int cur=q.poll();
           System.out.print(cur+" ");
           for(int x:a.get(cur))
           {
           if(visited[x]==false)
           {
             visited[x]=true;
             q.add(x);
           }
           }
        }
        }
        static void disconnectedbfs(ArrayList<ArrayList<Integer>> a,int v)
        {boolean visited[]=new boolean[v+1];
            for(int i=0;i<v;i++)
            {
                if(visited[i]==false){
                    bfs(a,i,visited);
                }
            }
        }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> a=new ArrayList<>(5);
        for(int i=0;i<v;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        addEdge(a,0,1);
        addEdge(a,0,2);
        addEdge(a,1,2);
        addEdge(a,1,3);
        addEdge(a,2,4);
        addEdge(a,2,3);
        addEdge(a,3,4);  
        disconnectedbfs(a,v);
    }
}

import java.util.*;
public class Dial_algo {
	static final int INF = Integer.MAX_VALUE; 
	private int V;
	private ArrayList<ArrayList<Tuple> > adj;
	public Dial_algo(int v){
		this.V = v;
		this.adj = new ArrayList<ArrayList<Tuple> >();
		for (int i = 0; i < v; i++)
			this.adj.add(new ArrayList<Tuple>());
	}
	public void AddEdge(int u, int v, int w){
		adj.get(u).add(new Tuple(v, w));
		adj.get(v).add(new Tuple(u, w));
	}
	public void shortestPath(int src, int W){
		int[] dist = new int[V];
		Arrays.fill(dist, INF);
		ArrayList<Integer>[] B = new ArrayList[W * V + 1];
		for (int i = 0; i < W * V + 1; i++)
			B[i] = new ArrayList<Integer>();
		B[0].add(src);
        dist[src] = 0;
		int idx = 0;
		while (true) {
			while (B[idx].size() == 0 && idx < W * V)
				idx++;
			if (idx == W * V)
				break;
			int u = B[idx].get(0);
			B[idx].remove(0);
			for (Tuple i : adj.get(u)) {
				int v = i.v;
				int weight = i.w;
				int du = dist[u];
				int dv = dist[v];
				if (dv > du + weight) {
					dist[v] = du + weight;
					dv = dist[v];
					B[dv].add(0, v);
				}
			}
		}
        System.out.println("Vertex Distance from Source");
		for (int i = 0; i < V; ++i)
			System.out.println(i + "\t\t" + dist[i]);
	}
	static class Tuple {
		int v, w;
		Tuple(int v, int w){
			this.v = v;
			this.w = w;
		}
	}
	public static void main(String[] args){
	    Scanner s=new Scanner(System.in);
		int V = s.nextInt();
		Dial_algo g = new Dial_algo(V);
		int e=s.nextInt();
		int st,en,d;
        for(int i=0; i<e; i++){
		    st=s.nextInt();
		    en=s.nextInt();
		    d=s.nextInt();
		    g.AddEdge(st,en,d);
		}
		g.shortestPath(0,e);
	}
}



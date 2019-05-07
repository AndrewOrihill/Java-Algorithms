package andreworihilldatastructuresalgorithmsfinal;
import java.util.*;
public class AndrewOrihillDataStructuresAlgorithmsFinal {
public static void main(String[] args)
{
class Graphs
{
    private Map<Integer, List<Integer>> adjacencyList;
        private Object[] adj;
    public Graphs(int v) 
    {
        adjacencyList = new HashMap<Integer, List<Integer>>();
        for (int i = 1; i <= v; i++)
            adjacencyList.put(i, new LinkedList<Integer>());
    }
 
    void setEdge(int to, int from)
    {
        if (to > adjacencyList.size() || from > adjacencyList.size())
        System.out.println("The vertices's does not exists");
        List<Integer> sls = adjacencyList.get(to);
        sls.add(from);
        List<Integer> dls = adjacencyList.get(from);
        dls.add(to);
    }
 
    public List<Integer> getEdge(int to) 
    {
        if (to > adjacencyList.size()) 
        {
            System.out.println("The vertices's does not exists");
            return null;
        }
        return adjacencyList.get(to);
    }
    
    {
        System.out.println("Enter the number of edges: ");
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        try 
        {
            int minV = (int) Math.ceil((1 + Math.sqrt(1 + 8 * e)) / 2);
            int maxV = e + 1;
            Random random = new Random();
            int v = Math.abs(random.nextInt(maxV - minV) + minV);
            System.out.println("Random graph has "+v+" vertices's.");
            Graphs reg = new Graphs(v);
            int count = 1, to, from;
            while (count <= e) 
            {
                to = Math.abs(random.nextInt(v + 1 - 1) + 1);
                from = Math.abs(random.nextInt(v + 1 - 1) + 1);
                reg.setEdge(to, from);
                count++;
            }
 
        System.out.println("The Adjacency List Representation of the random graph is: ");
            for (int i = 1; i <= v; i++) 
            {
                System.out.print(i + " -> ");
                List<Integer> edgeList = reg.getEdge(i);
                if (edgeList.size() == 0)
                    System.out.print("null");
                else 
                {
                    for (int j = 1;; j++) 
                    {
                        if (j != edgeList.size())
                            System.out.print(edgeList.get(j - 1) + " -> ");
                        else {
                            System.out.print(edgeList.get(j - 1));
                            break;
                        }
                    }
                }
                System.out.println();
            }
        } 
        catch (Exception E) 
        {
            System.out.println("Something went wrong");
        }
        scanner.close();
    }
void BFS(int s)

    {
        int V = 0;
		boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s]=true;

        queue.add(s);
        while (queue.size() != 0)

        {
            s = queue.poll();
            System.out.print(s+" ");

            Object[] adj = null;
			Iterator<Integer> i = extracted1(s, adj).listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
private List<Integer> extracted1(int s, Object[] adj) {
	return extracted1(s, adj);
}
private List<Integer> extracted11(int s, Object[] adj) {
	return extracted11(s, adj);
}
private List<Integer> extracted2(int s, Object[] adj) {
	return extracted2(s, adj);
}
private List<Integer> extracted3(int s, Object[] adj) {
	return extracted3(s, adj);
}
void Graph(int v)

{
    boolean[] visited1 = new boolean[v];
    for (int i = 0; i < v; i++)
        visited1[i] = false;

}
//DIJIKSTRAS ALGORITM
class ShortestPath
{

static final int V=9;
int minDistance(int dist[], Boolean sptSet[])
{
int min = Integer.MAX_VALUE, min_index=-1;

for (int v = 0; v < V; v++)

if (sptSet[v] == false && dist[v] <= min)

{
min = dist[v];
min_index = v;
}
return min_index;

}

void printSolution(int dist[], int n)
{

System.out.println("Vertex Distance from Source");

for (int i = 0; i < V; i++)

System.out.println(i+" tt "+dist[i]);
}

void dijkstra(int graph[][], int src)
{
int dist[] = new int[V]; 

Boolean sptSet[] = new Boolean[V];

for (int i = 0; i < V; i++)
{
dist[i] = Integer.MAX_VALUE;

sptSet[i] = false;

}
dist[src] = 0;

for (int count = 0; count < V-1; count++)
{

int u = minDistance(dist, sptSet);
sptSet[u] = true;

for (int v = 0; v < V; v++)

if (!sptSet[v] && graph[u][v]!=0 &&

dist[u] != Integer.MAX_VALUE &&
dist[u]+graph[u][v] < dist[v])
dist[v] = dist[u] + graph[u][v];
}
printSolution(dist, V);
}
}
    }
}
}
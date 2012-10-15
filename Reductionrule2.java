package edu.uci.ics.jung.graph;
import java.util.Collection;
import java.util.Scanner;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
public class Reductionrule2 {        
 Graph<Integer, Character> g = new SparseMultigraph<Integer, Character>();
 int vertex;
 private Scanner s;
 void graphcreationrule2()
{
System.out.println("Enter no of Vertices");
s = new Scanner(System.in);
vertex = Integer.parseInt(s.nextLine());
int i=1;
while (i<=vertex)
{
g.addVertex(i);
i++;
}
System.out.println("Enter no of Edges");
int e=Integer.parseInt(s.nextLine());
int j=1;
char ch='A';
while (j<=e)
{	
	System.out.println("Enter the connecting vertices of edge" +ch);
	int v1 = Integer.parseInt(s.nextLine());
	int v2 = Integer.parseInt(s.nextLine());
	g.addEdge(ch,v1,v2);
	j++;ch++;
}	
}
 void reduction2()
 {
	 graphcreationrule2();
	 int u=1,v=1,r;
	 char e;
	 System.out.println("Enter the value r in r-star packing in the graph");
	 r = Integer.parseInt(s.nextLine());
	 for(u=1;u<=vertex;u++)
	 {
		 if (u!=v)
		for(v=1;v<=vertex;v++)
			if(g.findEdge(u, v) != null)
		{
			e = g.findEdge (u,v);
			if(g.degree(u) <= g.degree(v))
				if(g.degree(v) < r)
					g.removeEdge(e);
			System.out.println("Removed Edge is " +e);
			
		}
		 System.out.println ("Number of Edges left after applying reduction rule 2 are " +g.getEdgeCount());
			}
	 }
			
}

package edu.uci.ics.jung.graph;
import java.util.Scanner;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.graph.Hypergraph;
public class Reductionrule1directedgraph {        
 Graph<Integer, Character> g = new SparseMultigraph<Integer, Character>();
 int v,e;
// private scanner s;
 void graphcreationrule1directedgraph()
{
System.out.println("Enter no of Vertices");
Scanner s = new Scanner(System.in);
v = Integer.parseInt(s.nextLine());
System.out.println("Enter no of Edges");
e=Integer.parseInt(s.nextLine());
int j =1;
char ch='A';
while (j<=e)
{	
	System.out.println("Enter the connecting vertices of edge" +ch);
	int v1 = Integer.parseInt(s.nextLine());
	int v2 = Integer.parseInt(s.nextLine());
	g.addEdge(ch,v1,v2,EdgeType.DIRECTED);
	j++;ch++;
}	
}
void reductionrule1directedgraph()
 {
	 graphcreationrule1directedgraph();
	 System.out.println("Enter the value of k and r for star packing in the graph");
	 Scanner s = new Scanner(System.in);
	 int k=Integer.parseInt(s.nextLine());
	 int r=Integer.parseInt(s.nextLine());
	 int i=0,x,a,b,d;
        for (i=1;i<=v;i++)
        {
        a = g.inDegree(i);
        b = g.outDegree(i);
        x = k*(r+1)-1;
        d=a+b;
        	
        	if(d>=x)
        	{
        		g.removeVertex(i);
        		
        		 k=k-1;
        		 System.out.println("Graph after the deleting the vertex" +i+ "is");
        		System.out.println( g.toString());
        		
        	}
        	g.getVertices();
        	
        }       
 }}
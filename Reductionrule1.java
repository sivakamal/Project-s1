package edu.uci.ics.jung.graph;
import java.util.Scanner;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
public class Reductionrule1 {        
 Graph<Integer, Character> g = new SparseMultigraph<Integer, Character>();
 void graphcreation()
{
System.out.println("Enter no of Vertices");
Scanner s = new Scanner(System.in);
int v = Integer.parseInt(s.nextLine());
int i=1;
while (i<=v)
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
 void reduction()
 {
	 graphcreation();
	 System.out.println("Enter the value of k and r for star packing in the graph");
	 Scanner s = new Scanner(System.in);
	 int k=Integer.parseInt(s.nextLine());
	 int r=Integer.parseInt(s.nextLine());
        int i=1;
        int x;
        
        x=((k)*(r+1)-1);
        
        	double d;
        	d= g.degree((i));
        	if(d>=x)
        	{
        		g.removeVertex(i);
        		k=k-1;
        		 
        		 System.out.println("Graph after the deleting the vertex" +i+ "is");
        		System.out.println( g.toString());
        		} else
i++;
 g.getVertexCount();
}}
class Graphcalling
{
public static void main (String args[]) {
	Reductionrule1 p = new Reductionrule1();
	p.reduction();   
} 
}
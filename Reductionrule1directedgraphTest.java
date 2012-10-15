package edu.uci.ics.jung.graph;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

public class Reductionrule1directedgraphTest extends TestCase {

	public Reductionrule1directedgraphTest(String name)
	{
		super (name);
	}

	@Test
	public void test() {
		Reductionrule1directedgraph q = new Reductionrule1directedgraph();
		q.reduction1directedgraph();

		equals(2);
	}
	public static void setUpBeforeClass() throws Exception {
	}

}

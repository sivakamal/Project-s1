package edu.uci.ics.jung.graph;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

public class Reductionrule2Test extends TestCase{
	public Reductionrule2Test(String name)
	{
		super (name);
	}
	public void test() {
		Reductionrule2 q = new Reductionrule2();
		q.reduction2();

		equals(2);
	}
	public static void setUpBeforeClass() throws Exception {
	}
}

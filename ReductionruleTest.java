package edu.uci.ics.jung.graph;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class ReductionruleTest extends TestCase {
	public ReductionruleTest(String name)
	{
		super (name);
	}
	@Test
	public void test() {
		Reductionrule1 q = new Reductionrule1();
		q.reduction();

		equals(2);

	}
	public static void main(String[] args)
	{
		
	}

}

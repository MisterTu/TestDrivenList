package list;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NodeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testToString(){
		assertEquals("a",new Node("a").toString());		
	}
	@Test
	public void testToStringTwoElements(){
		assertEquals("a,b",new Node("a",new Node("b")).toString());		
	}
	
	@Test
	public void testAddElement() {
		//given List b
		Node list = new Node("b");
		//when
		Node result = list.add("a");
		//then
		// list should be a,b
		assertEquals("bla","a,b",result.toString());
	}

}

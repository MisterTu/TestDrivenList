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
	
	@Test
	public void testAppend(){
		Node list = new Node("Y",new Node("M", new Node("C")));
		list.append(new Node("A"));
		
		assertEquals("Y,M,C,A",list.toString());
		
	}
	
	@Test
	public void testDelete(){
		Node list = new Node("q",new Node("u", new Node("e", new Node("f", new Node("e", new Node("n"))))));
		list.delete(3);
		
		assertEquals("q,u,e,e,n",list.toString());
	}
	
	@Test
	public void testDeleteFirstNode(){
		Node list = new Node("f",new Node("r", new Node("a", new Node("i", new Node("l", new Node("s"))))));
		list = list.delete(0);
		
		assertEquals("r,a,i,l,s",list.toString());
	}
	
	@Test
	public void testDeleteLastNode(){
		Node list = new Node("f",new Node("r", new Node("a", new Node("i", new Node("l", new Node("s"))))));
		list.delete(2000);
		
		assertEquals("f,r,a,i,l",list.toString());
	}
	
	@Test
	public void testReverseList(){
		Node list = new Node("r",new Node("a", new Node("i", new Node("l"))));
		list = list.reverse();
		
		assertEquals("l,i,a,r",list.toString());
	}
	
	@Test
	public void testNodeInPos(){
		Node list = new Node("f",new Node("r", new Node("a", new Node("i", new Node("l", new Node("s"))))));
		list = list.getNodeInPos(4);
		
		assertEquals("i",list.toString());
	}

}

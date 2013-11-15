package list;

public class Node {

		String data;
		Node next;
	public Node(String string) {
		data =string;
	}

	public Node(String string, Node next) {
		data =string;
		this.next = next;
	}

	public Node add(String string) {
		return new Node(string,this);
	}
	@Override
	public String toString(){
		if (next == null)
			return data;
		else
		  return data + ","+next.toString();
	}

}

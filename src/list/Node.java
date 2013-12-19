package list;

public class Node {

		String data;
		Node next = null;
		
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
	
	public boolean hasNext(){
		return next != null;
	}
	
	public Node getNext(){
		
		return next;
	}
	
	public Node getLast(){
		Node last = this;
		
		while(last.hasNext()){
			last = last.next;
		}
		
		return last;
	}
	
	public void append(Node lastNode){
		Node last = getLast();
		
		last.next = lastNode;
	}
	
	public int getLength(){
		Node last = this;
		int i = 1;
		
		while(last.hasNext()){
			last = last.next;
			i++;
		}
		
		return i;
	}
	
	public Node delete(int position){
		Node antecessor = this;
		
		if(position != 0){
			
			if(position > getLength()-1){
				position = getLength()-1;
			}
			
			for(int i=0; i<position-1; i++){
				antecessor = antecessor.next;
			}
			
			antecessor.next = antecessor.next.next;
		}
		else if(position == 0){

			return antecessor.next;
		}
		
		return this;
	}
	
	
	//count from 1
	public Node getNodeInPos(int position){
		Node antecessor = this;
		
		for(int i = 0; i < position-1; i++){
			antecessor = antecessor.getNext();
		}
		
		antecessor.next = null;
		
		
		return antecessor;
	}
	
	public boolean isEmpty(){
		return this.getLength() == 0;
	}
	
	public Node reverse(){		
		Node list = this;
		
		Node reversedList = list.getLast();
		list.delete(list.getLength()-1);
		
		
		
		while(list.getLength() > 1){
			reversedList.append(list.getLast());
			list.delete(list.getLength()-1);
		}
		

		reversedList.append(list.getLast());
		
		
		
		return reversedList;
	}

}

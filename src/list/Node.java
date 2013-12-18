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
	
	
	//if position > list-lenght = delete last node
	public void delete(int position){
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
			Node tempo = antecessor;
			antecessor = antecessor.next;
			tempo.next = null;
		}
		
		
	}
	
	public Node getNodeInPos(int position){
		Node antecessor = this;
		
		for(int i=0; i<position-1; i++){
			antecessor = antecessor.next;
			System.out.println("Position: " + position);
			System.out.println("i: " + i);
		}
		
		
		return antecessor;
	}
	
//	public Node reverse(){
//		int nextToReverse = getLength();
//		Node reversedList = getNodeInPos(nextToReverse);
//		
//		nextToReverse --;
//		
//		for(int i = nextToReverse; i >= 0; i--){
//			
//			
//			
//			reversedList.append(getNodeInPos(nextToReverse));
//			
//			System.out.println("nextToReverse: " + nextToReverse);
//			
//		}
//		
//		return reversedList;
//	}
	
	

}

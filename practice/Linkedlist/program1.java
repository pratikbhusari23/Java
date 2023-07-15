class LL{
	
	Node head ;
	private int size;

	LL(){
		this.size=0;
	}
	class Node{
		
		String data;
		Node next;

		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	// add - first 
	
	public void addFirst(String data){
		
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			return ;
		}

		newNode.next = head;
		head = newNode;
	}

	// add - last
	
	public void addLast(String data){
		
		Node newNode = new Node(data);

		if(head==null){
			head = newNode;
			return;
		}

		Node temp = head ;

		while(temp.next !=null){
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void print(){
	
		Node temp = head ;
		
		if(head==null){
			System.out.println("List is empty");
			return ;
		}
		while(temp!=null){

			System.out.print("|"+temp.data + "|->");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	// Delete
	
	public void deleteFirst(){
		
		if(head==null){
			System.out.println("List is Empty");
			return ;
		}	
		size--;
		head=head.next;
		
	}
	public void deleteLast(){
		
		Node temp = head;
		
		if(head == null){
			System.out.println("Your Linekd List is Empty");
			return ;
		}
		size --;

		if(head.next==null){
			head=null;
			return;
		}
		while(temp.next.next!=null){
			temp=temp.next;
		}
		temp.next=null;
	}
	public int getSize(){
		return size;
	}
	public static void main(String[] args){
		
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.addLast("List");
		list.addFirst("This");
		System.out.println(list.getSize());
		list.print();	
		list.deleteFirst();
		System.out.println(list.getSize());
		list.print();	
		list.deleteLast();
		list.deleteLast();
		System.out.println(list.getSize());
		list.print();	
		list.deleteLast();
		list.print();
		System.out.println(list.getSize());

	}
}

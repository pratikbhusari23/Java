import java.util.*;
class ArrayListDemo{	
	public static void main(String[] args){
		
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(list);

		
		list.remove(0);
		list.remove(3);

		System.out.println(list);
	
	}
}

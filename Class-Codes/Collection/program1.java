import java.util.*;
class ArrayListDemo{
	
	public static void main(String[] args){
		
		ArrayList<String> a = new ArrayList<>(3);
		a.add("A");
		a.add("10");
		a.add("A");
		a.add(null);

		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add(2,"m");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.trimToSize();
		System.out.println(a);

	
	}
}

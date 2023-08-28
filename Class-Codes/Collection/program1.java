import java.util.*;
class ArrayListDemo{
	
	public static void main(String[] args){
		
		ArrayList<String> a = new ArrayList<>();
		a.add("A");
		a.add("10");
		a.add("A");
		a.add(null);
		a.add("10");

		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add(2,"m");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a);
		
		System.out.println(a.contains("10"));
		System.out.println(a.indexOf("10"));
		System.out.println(a.lastIndexOf("10"));

		System.out.println(a.get(1));
		a.set(1,"20");
		System.out.println(a.get(1));
		a.clear();
		a.removeRange(0,1);
	
		System.out.println(a);
	}
}

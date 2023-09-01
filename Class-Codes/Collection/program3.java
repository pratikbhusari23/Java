import java.util.*;
class Demo{
	
	public static void main(String[] args){
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		fruits.remove(1);
		System.out.println(fruits.get(1));
	}
}

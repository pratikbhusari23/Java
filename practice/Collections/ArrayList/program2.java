import java.util.ArrayList;
import java.util.Collections;

class program2{

	public static void main(String[] args){
		
		ArrayList<Integer> list = new ArrayList<>();

		Collections.addAll(list ,0,2,1);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);

		System.out.println(list);

	}
}
		

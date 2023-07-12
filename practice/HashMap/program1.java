import java.util.*;

class Demo{
	
	public static void main(String[] args){
		
		// CREATING HASHMAP
		
		HashMap<String, Integer> map = new HashMap<>();
		
		// INSERTION IN HASHMAP
	
		map.put("China",150);
		map.put("India",120);
		map.put("USA",100);
		
		// PRINTING HASHMAP
		
		System.out.println(map);	// {USA=100, China=150, India=120}

		map.put("China",180);		
		System.out.println(map);	// {USA=100, China=180, India=120}	

		// SEARCHING
		
		if(map.containsKey("Indonesia")){
			
			System.out.println("Present");
		
		}
		else{
			
			System.out.println("Not Present");	// Not Present
		
		}

		System.out.println(map.get("China"));		//180
		System.out.println(map.get("Indonesia"));	//Null

		// Iteration Type-1
		
		for(Map.Entry<String , Integer> e : map.entrySet()){

			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		// Iteration Type-2

		Set<String> keys = map.keySet();

		for(String key : keys){
			
			System.out.println(key+" "+map.get(key));
		}

		// Iteration Type-3
		
		for(String key : map.keySet()){
			Integer Value = map.get(key);
			System.out.println("Type - 3 " + key +  " " + Value );
		}

		// Remove
		
		map.remove("China");
		System.out.println(map);
	}
}

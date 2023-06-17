import java.util.*;

class Union{
	
	static int union(int arr1[],int arr2[]){

		HashSet<Integer> hs = new HashSet<>();

		for(int i=0 ; i<arr1.length ; i++){
			
			hs.add(arr1[i]);
		}

		for(int i=0 ; i<arr2.length ; i++){
			
			hs.add(arr2[i]);
		}
		
		System.out.println(hs);
		return hs.size();
	
	}
	public static void main(String[] args){
		
		int arr1[]={1,2,3,4};
		int arr2[]={3,4,5,6};

		System.out.println(union(arr1,arr2));
	}
}

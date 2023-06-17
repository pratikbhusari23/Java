import java.util.*;

class Demo{
	
	static int intersection(int arr1[] , int arr2[]){
		
		HashSet<Integer> hs = new HashSet<Integer>();
		int count =0;

		for(int i=0 ; i<arr1.length ; i++){
			
			hs.add(arr1[i]);
		}
		for(int j=0 ; j<arr2.length ; j++){
			
			if(hs.contains(arr2[j])){
				
				count++;
				hs.remove(arr2[j]);
			}
		}

		return count;
	}
	public static void main(String[] args){
		
		int arr1[]={1,2,3};
		int arr2[]={2,2,3,4,5,6,1,1};

		System.out.println(intersection(arr1,arr2));
	}
}


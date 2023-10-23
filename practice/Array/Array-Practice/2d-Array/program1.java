import java.util.Arrays;

class Demo{
	
	public static void main(String[] args){
		 
		int arr[][] = {{1,2,3},{1,2},{1,2,3}};
		
		for(int i=0 ; i < arr.length ; i++){
			for(int j=0 ; j < arr[i].length ; j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

		int arr1[][] = new int[][]{ {1,2,3},{1,2},{1,2,3} };

		for(int i=0 ; i < arr1.length ; i++){
			for(int j=0 ; j < arr1[i].length ; j++){
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}

		System.out.println(Arrays.deepToString(arr1));

		for(int[] i : arr1){
			for(int j : i){
				System.out.print(j + " ");
			}
			System.out.println();
		}

		
	}
}

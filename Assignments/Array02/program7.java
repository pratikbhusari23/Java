
// import java.io.*;

// class program7 {

// 	public static void main(String[] args)throws IOException{
		
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
// 		System.out.println("Enter Size of First Array :");
// 		int size1 = Integer.parseInt(br.readLine());
		
// 		int arr[]= new int[size1];
		
// 		System.out.println("Enter First Array's Elements : ");
		
// 		for(int i=0 ; i<arr.length ; i++){
			
// 			arr[i]=Integer.parseInt(br.readLine());							
			
// 		}
		
// 		System.out.println("Enter Size of Second Array : ");
		
// 		int size2 = Integer.parseInt(br.readLine());

// 		int arr2[] = new int[size2];

// 		System.out.println("Enter Second Array's Elements : ");

// 		for(int i=0 ; i<arr2.length ; i++){
											
// 			arr2[i]=Integer.parseInt(br.readLine());							
			
// 		}
		
// 		if(size1>size2 || size1==size2){
			
// 			size1=size1+size2;
// 			size2=size1-size2;
// 			size1=size1-size2;
// 		}
// 		System.out.println("Common Elemenets : ");
// 		for(int i=0 ; i<size2 ; i++){
// 			for(int j=0 ; j<size1 ; j++){
				
// 				if(arr[i]==arr2[j]){
					
// 					System.out.println(arr2[j]+" at index :"+j);
			
// 				}
// 			}

// 		}

// 	}
// }

import java.io.*;

class program7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Size of First Array:");
        int size1 = Integer.parseInt(br.readLine());

        int arr[] = new int[size1];

        System.out.println("Enter First Array's Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter Size of Second Array:");
        int size2 = Integer.parseInt(br.readLine());

        int arr2[] = new int[size2];

        System.out.println("Enter Second Array's Elements: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        if (size1 > size2) {
            int temp = size1;
            size1 = size2;
            size2 = temp;
            int[] tempArr = arr;
            arr = arr2;
            arr2 = tempArr;
        }

        boolean found = false;
        boolean[] visited = new boolean[size2];
        System.out.println("Common Elements: ");
        for (int i = 0; i < size1; i++) {
            boolean alreadyPrinted = false;
            for (int j = 0; j < size2; j++) {
                if (arr[i] == arr2[j] && !visited[j]) {
                    if (!alreadyPrinted) {
                        System.out.println(arr[i]);
                        found = true;
                        alreadyPrinted = true;
                    }
                    visited[j] = true;
                }
            }
        }
        if (!found) {
            System.out.println("No common elements found.");
        }
    }
}

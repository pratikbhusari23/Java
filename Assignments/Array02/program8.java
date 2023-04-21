
// import java.io.*;

// class program8 {

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

// 		System.out.println("UnCommon Elements : ");
		
// 		for(int i=0 ; i<size2 ; i++){
// 			for(int j=0 ; j<size1 ; j++){
				
// 				if(arr[i]!=arr2[j]){
					
// 					System.out.println(arr2[j]+" at index :"+j);
			
// 				}

// 			}
			
// 		}
		
// 	}

// }
	
import java.io.*;

class program8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of first array:");
        int size1 = Integer.parseInt(br.readLine());

        int arr1[] = new int[size1];

        System.out.println("Enter first array's elements:");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter size of second array:");
        int size2 = Integer.parseInt(br.readLine());

        int arr2[] = new int[size2];

        System.out.println("Enter second array's elements:");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Uncommon elements:");

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(+arr1[i] + " at index: " + i);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(+arr2[i] + " at index: " + i);
            }
        }
    }
}


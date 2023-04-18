
public class program2 {

    public static void main(String[] args) {
        
        int Arr1[]={1,2,3,4,5,6,7,8,9,10};

        int arr[]= new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }

        for(int i=0;i<Arr1.length;i++){
            System.out.print(Arr1[i]+ " ");
        }

        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}

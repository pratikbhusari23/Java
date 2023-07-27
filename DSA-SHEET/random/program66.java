class Solution {
    public static int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1 ; i>=0 ; i--){

            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int arr[] = new int[digits.length+1];

        arr[0]=1;

        return arr;
    }

    public static void main(String[] args) {
    
        int digits[] = {9,9,9,9};
        int arr[] = plusOne(digits);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
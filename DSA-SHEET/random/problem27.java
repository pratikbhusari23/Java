class Solution {
    public static int removeElement(int[] nums, int val) {
        
        int j=nums.length-1;
        for(int i=0 ; i<nums.length ; i++){
        
            if(nums[i]==val){
                while(nums[j]==val){
                    j--;
                }
                    
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
	}
    for(int i=0 ; i<nums.length ; i++){
        System.out.print(nums[i]+" ");
    }
    System.out.println();	
	return --j;
    }
    public static void main(String[] args) {
        
        int nums[] = {3,2,2,3};
        int val = 3;

        System.out.println(removeElement(nums,val));
    }
}

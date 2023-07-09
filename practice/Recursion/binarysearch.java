class Demo{
	
	static int binarysearch(int arr[],int start , int end ,int target){
		
		int mid=start+(end-start)/2;

		if(start>end){
			return -1;
		}
		if(arr[mid]==target){
			return mid;
		}
		if(target<arr[mid]){
			
			return binarysearch(arr,start,mid-1,target);
		}
		return binarysearch(arr,mid+1,end,target);
	
	}
	public static void main(String[] args){
		
		int arr[]={1,2,3,4,5,6,9};

		System.out.println(binarysearch(arr,0,arr.length-1,1));
	}
}

class Demo{
	
	static int BinarySearch(int arr[],int target,int start , int end){
		
		if(start>end)
			return -1;
		int mid = start + (end-start)/2;
		if(arr[mid]==target)
			return mid;

		if(target<arr[mid]){
			return BinarySearch(arr,target,start,mid-1);
		}
		return BinarySearch(arr,target,mid+1,end);


	}

	public static void main(String[] args){
		
		int arr[] = {2 , 4 , 6 ,8 ,10 ,12};

		System.out.println(BinarySearch(arr,12,0,arr.length-1));
	}
}

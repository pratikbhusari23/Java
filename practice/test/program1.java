class Demo{
	
	public static void main(String[] args){
		
		int arr[]={0, 1, 1 , 0 ,0, 1 , 0 , 1,0};
		int group=1;

		if(arr[0]==0 ){
			group=group-1;
		}
		if(arr[arr.length-1]==0){
			group=group-1;
		}
		for(int i=0 ; i<arr.length ; i++){
			
			if(arr[i+1]!=0 && arr[i]==0){
				group=group+1;
			}
		}
		System.out.println(group);
	
	}
}

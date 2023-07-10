class Demo{
	
	public static int heatwave(double arr[]){
		int count=0 , count1=0;
		for(int i=0 ; i<arr.length ; i++){
			
			if(arr[i]>25){
				count++;
				if(arr[i]>30){
					count1++;
				}
			}
			if(count>4&&count1>2){
				continue ;
			}
			if(arr[i]<25){
				count=0;
			}

		}
		if(count>4){
			return count;
		}
		else{
			return -1;
		}
	}
	public static void main(String[] args){
		
		double arr[] = {24.7,25.1,28.9,31.0,28.6,30.6,32.4,23.0};
		System.out.println(heatwave(arr));
	}
}

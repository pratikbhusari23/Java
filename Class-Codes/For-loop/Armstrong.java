class Armstrong{
	
	public static void main(String[] pratik){
		
		int N=143,temp=N,count=0,sum1=0;

		for(int i=N ; i>0 ; i=i/10){
			
			count++;
		}
		for(;temp>0 ; temp=temp/10){

			int sum=1;

			for(int j=1 ; j<=count ; j++){
				
				int rem=temp%10;
				sum=sum*rem;
				
			}

			sum1=sum1+sum;
		}

		if(sum1==N){
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}

	}

}

class Patterns{

	public static void main(String [] pratik){
		
		int x=1 ;

		for(int i=1 ; i<=4 ; i++){
			
			for(int j=4 ; j>=1 ; j--){
				
				if(i<j){
					System.out.print("+");
				}
				else {
					System.out.print(x);
					x++;
				}
			}
			System.out.println();
		}
	}
}

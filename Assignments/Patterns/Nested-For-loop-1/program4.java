/*
1A 1A 1A
1A 1A 1A
1A 1A 1A

*/
class Pattern{
	public static void main(String[] pratik){
		
		for(int i=1 , j=1 ;i<=3 && j<=3 ;){
			
			System.out.print("1A ");
			j++;
			if(j==4){
				
				j=1;
				i++;
				System.out.print("\n");
			}
		}
	}
}

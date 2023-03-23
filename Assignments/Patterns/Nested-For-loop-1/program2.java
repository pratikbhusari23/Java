/*
4 5 6 7
4 5 6 7
4 5 6 7
4 5 6 7
*/

class Pattern{
	public static void main(String[] pratik){
		
		int x=4;
		for(int i=1,j=1 ;i<=4 && j<=4 ; ){
			
			System.out.print(x+" ");
			x++;
			j++;
			if(j==5){
				System.out.print("\n");
				j=1;
				x=4;
				i++;
			}
		}
	}
}

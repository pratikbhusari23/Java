class Logical{
	
	public static void main(String[] pratik){
		
		int x=5;
		int y=7;

		boolean ans1=x<y && y<x;
		boolean ans2=x<y && y>x;

		System.out.println(ans1);	//false
		System.out.println(ans2);	//true
	}

}

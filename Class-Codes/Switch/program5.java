class Switch{

	public static void main(String pratik[]){
		
		int x=3;
		int a=1;
		int b=2;
		
		switch(x){
			
			case a :
				System.out.println("1");
				break;
			case b :
				System.out.println("2");
				break;
			case a+b :
				System.out.println("3");
				break;
			case a+a+b :
				System.out.println("4");
				break;
			case a+b+b :
				System.out.println("5");
				break;
			default :
				System.out.println("Invalid input");
			
		}		
	}
}
/*

program5.java:11: error: constant expression required
                        case a :
                             ^
program5.java:14: error: constant expression required
                        case b :
                             ^
program5.java:17: error: constant expression required
                        case a+b :
                              ^
program5.java:20: error: constant expression required
                        case a+a+b :
                                ^
program5.java:23: error: constant expression required
                        case a+b+b :
                                ^
5 errors


*/

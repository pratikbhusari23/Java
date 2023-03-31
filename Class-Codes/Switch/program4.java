class Switch{

	
	public static void main(String pratik[]){
	
		
		int ch=65;

		switch(ch){
			
			case 'A':
				System.out.println("Char A");
				break;
			case 65 :
				System.out.println("Number 65");
				break;
			case 'B':
				System.out.println("Char B");
				break;
			case 66 :
				System.out.println("Number 66");
				break;
			default :
				System.out.println("Invalid Input");
				
		}
	}
}

/*
program4.java:14: error: duplicate case label
                        case 65 :
			^
program4.java:20: error: duplicate case label
			case 66 :
                        ^

2 errors

*/

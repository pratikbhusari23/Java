


class MethodDemo{


	public static void main(String[] args){
	
		fun();
		gun(); 

	}

	static void fun(){
	
		System.out.println("In fun Method");
	
	}

	void gun(){
	
		System.out.println("In gun Method");
	
	}


}
/*
program1.java:10: error: non-static method gun() cannot be referenced from a static context
                gun();
		^
1 error

*/

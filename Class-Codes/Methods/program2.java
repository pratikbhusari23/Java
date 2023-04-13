class Demo {

	int x=10;

	static int y=20;

	void fun(){
		
		System.out.println("In fun");
	}
	static void gun(){
	
		System.out.println("In gun");
	}

	public static void main(String[] args){
		
		System.out.println(x);
		System.out.println(y);
		
		fun();
		gun();
	
	}
}

/*
java:18: error: non-static variable x cannot be referenced from a static context
                System.out.println(x);
		                   ^
program2.java:21: error: non-static method fun() cannot be referenced from a static context
		fun();
		^
2 errors

*/

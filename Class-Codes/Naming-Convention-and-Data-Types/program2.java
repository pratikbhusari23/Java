/*
Class names: The first letter of each word in a class name should be capitalized. 
For example, "MyClass" instead of "myclass" or "myClass".

Method names: Method names should be in lowercase, with the first letter of each word capitalized. 
For example, "getUserName()" instead of "GetUserName()" or "getusername()".

Variable names: Variable names should start with a lowercase letter and use camelCase.
For example, "firstName" instead of "firstname" or "first_name".

Constant names: Constants should be written in uppercase letters, with words separated by underscores. 
For example, "MAX_VALUE" instead of "MaxValue" or "maxvalue".

Package names: Package names should be in lowercase letters and use the reverse domain name system (DNS) convention.
For example, "com.example.mypackage" instead of "MyPackage" or "com.example.myPackage".

Interface names: Interface names should be in uppercase letters, with words separated by underscores. 
For example, "MyInterface" instead of "myinterface" or "my_interface".

*/

class Core2web{
	
	public static void main(String[]  pratik){
		
		byte var1 =18;
		byte var2 =18;

		System.out.println(var1);
		System.out.println(var2);
		
		var1=var1+var2;
	
		System.out.println(var1);
		System.out.println(var2);
	}
}

/*
 *
 O/P :

 program2.java:32: error: incompatible types: possible lossy conversion from int to byte
                 var1=var1+var2;
		                          ^
					  1 error
 */
		



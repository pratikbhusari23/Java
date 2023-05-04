
class StringDemo{
	
	public static void main(String[] args){
		
		String str1 = "Core2web";                 //string constant pool
		String str2 = new String("Core2web");     //Heap
		   
		char str3[]={'C','2','W'};	          //Heap
		
		System.out.println(str1+" "+System.identityHashCode(str1)+ "-----> String constant pool");
		System.out.println(str2+" "+System.identityHashCode(str2)+"----------> Heap");
		System.out.println(str3+" "+System.identityHashCode(str3)+"----------> Heap");
	}
}
/*



Core2web 1808253012-----> String constant pool
Core2web 589431969----------> Heap
[C@4aa298b7 1252169911----------> Heap


 */
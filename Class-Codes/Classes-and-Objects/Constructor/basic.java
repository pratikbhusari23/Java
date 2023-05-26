class Clsobj{
	
	public static void main(String[] args){
		
		int x=10;
		System.out.println(x);
		fun();
	}
	int y=20;
	
	static void fun(){
		
		int z=30;
		System.out.println(z);
	}

}
/*

Compiled from "program1.java"
class Clsobj {
  int y;

  Clsobj();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        20
       7: putfield      #2                  // Field y:I
      10: return

  public static void main(java.lang.String[]);
    Code:
       0: bipush        10
       2: istore_1
       3: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
       6: iload_1
       7: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
      10: invokestatic  #5                  // Method fun:()V
      13: return

  static void fun();
    Code:
       0: bipush        30
       2: istore_0
       3: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
       6: iload_0
       7: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
      10: return
}

 */
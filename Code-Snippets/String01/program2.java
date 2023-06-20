
class StringDemo{
	
	public static void main(String[] args){
		
		int[] arr = {97,98,99,100};
		String str = new String(arr);
		System.out.println(str);		
	}	

}
/*
 

program2.java:7: error: no suitable constructor found for String(int[])
                String str = new String(arr);
                             ^
    constructor String.String(String) is not applicable
      (argument mismatch; int[] cannot be converted to String)
    constructor String.String(char[]) is not applicable
      (argument mismatch; int[] cannot be converted to char[])
    constructor String.String(byte[]) is not applicable
      (argument mismatch; int[] cannot be converted to byte[])
    constructor String.String(StringBuffer) is not applicable
      (argument mismatch; int[] cannot be converted to StringBuffer)
    constructor String.String(StringBuilder) is not applicable
      (argument mismatch; int[] cannot be converted to StringBuilder)
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error

 */

import java.util.*;

class Demo{
	static int fib(int n){
		
		int arr[] = new int[10];
		Arrays.fill(arr,-1);

		if(n<2){
			arr[n]=n;
		}
		else{
			if(arr[n-2]==-1){
				arr[n-2]=fib(n-2);
			}
			if(arr[n-1]==-1){
				arr[n-1]=fib(n-1);
			}
			arr[n]=arr[n-2] + arr[n-1];
		}

		return arr[n];
	}
}

class Client{

	public static void main(String[] args){
		
	Demo obj = new Demo();
	
	System.out.println(obj.fib(5));	
	
	}
}

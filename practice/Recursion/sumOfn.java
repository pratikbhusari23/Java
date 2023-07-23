/*
class Demo{
	static int fun(int n , int sum){
		
		if(n==0){
			return sum;
		}
		sum+=n;
		return fun(--n,sum);
	}
	public static void main(String[] args){
		
		System.out.println(fun(10234,0));
	}

}
*/
/*
class Demo{
	
	static int fun(int n){
		
		if(n==0){
			return 0;
		}
		return fun(n-1)+n;
	}

	public static void main(String[] args){
		
		System.out.println(fun(10234));
	}

}*/

class Demo{
	static int fun(int n){
		
		return n*(n+1)/2;		
	}
	public static void main(String[] args){
		
		System.out.println(fun(10234));

	}
}

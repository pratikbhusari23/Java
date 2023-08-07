class Demo{
		
		
		private static Demo obj = null;

		private Demo(){}

		public static Demo getTest(){
			
			if(obj==null){
				
				obj=new Demo();
			}
			return obj;
		}
	
}

class Client{
	
	public static void main(String[] args){
		
	
//		System.out.println(Demo.getTest().hashCode());
//		System.out.println(Demo.getTest().hashCode());
	}
}

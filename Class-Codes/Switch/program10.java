class NestedSwitchDemo{
	public static void main(String[] args){
		String str="Amanora";
		System.out.println("Mall");
		switch(str){
			case "Amanora":
				{
					String str1="Starbuks";
					switch(str1){
						case "Goodluck":
							{
							System.out.println("Average");
							}
							break;
							
						case "Starbuks":
							{
							System.out.println("Outstanding");
							}
							break;
					}
				}
				break;
		
		case "Pavillion":
				{
					
		       
		                	String str1="Salon";
			                switch(str1){
				                 case "Habib":
							 {
					         	System.out.println("Expensive");
							 }
					        	break;
				                 case "Salon":
							{
							System.out.println("Commomn");
							}
							break;
					}
				}
		
				System.out.println("After Switch");
                break;
		}
	}
}


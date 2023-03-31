class NestedSwitch{
	public static void main(String[] pratik){
		
		String TimeoftheDay ="Afternoon";

		switch(TimeoftheDay){
			
			case "Morning" :{
				
				System.out.println("Time of the Day : Morning");
				String CurrentTemp="Cold";

				switch(CurrentTemp){
					
					case "warm" :
						{
							System.out.println("Set temp to 16");
						
						}	
						break;
					case "Normal" :
						{
							System.out.println("Set temp to 18");
						
						}
						break;
					case "Cold" :
						{
						
							System.out.println("Set temp to 24");
						}
						break;
					default :
						System.out.println("No match Found");
				}
			}
				break;
			
			case "Afternoon" :{
				System.out.println("Time of the Day : Afternoon");
				String CurrentTemp="warm";

				switch(CurrentTemp){
					
					case "warm" :
						{	
							System.out.println("Set temp to 14");
						
						}	
						break;
					case "Normal" :
						{
							System.out.println("Set temp to 18");
						
						}
						break;
					case "Cold" :
						{
							System.out.println("Set temp to 20");
						
						}
						break;
					default :
						System.out.println("No match Found");
				}
			}
				break;
			
			case "Night" :{
				
				System.out.println("Time of the Day : Night");
				String CurrentTemp="Normal";

				switch(CurrentTemp){
					
					case "warm" :
						{
						
							System.out.println("Set temp to 18");
						}	
						break;
					case "Normal" :
						{
						
							System.out.println("Set temp to 22");
						}
						break;
					case "Cold" :
						{
						
							System.out.println("Set temp to 24");
						}
						break;
					default :
						System.out.println("No match Found");
				}
			}
				break;
			default :
				System.out.println("No match Found");
		
		}
		

	}
	
}	


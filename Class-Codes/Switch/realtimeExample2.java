class RealtimeExample{
	
	public static void main(String pratik[]){
		
		System.out.println("OhPune");
		
		String str="Nonveg";  //veg or nonveg

		switch(str){      //nonveg
			
			case "Veg" :{
				
				String str1 = "Starter";  //starter or maincourse
				switch(str1){   //starter
				
					case "Starter" :{
						
						System.out.println("Panner Chilly\nPanner65\nHarabhara Kabab");
					}
					break;

					case "Maincourse" :{
						System.out.println("ShevBhaji\nPalak Panner\n Malai Kofta");
					
					}
					break;
				}
			}
			break;

			case "Nonveg" :{
				
				String str1="Maincourse";

				switch(str1){
					
					case "starter" :{
					
						System.out.println("Tandoori Chicken \nSeekh kabab\nBBQ Chicken");
					}
					break;

					case "Maincourse" :{
						
						System.out.println("Butter Chicken\nChicken Tikka \nMurgh Massalam");
					}
					break;
				
				}
			}
			break;
		}
	}

}

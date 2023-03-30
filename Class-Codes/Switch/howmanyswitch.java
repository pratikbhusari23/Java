class NestedSwitch{
	public static void main(String[] pratik){
		
		String TimeoftheDay ="Morning";

		switch(TimeoftheDay){
			
			case "Morning" :{
				
				System.out.println("Time of the Day : Morning");
				String CurrentTemp="warm";;

				switch(CurrentTemp){
					
					case "warm" :
						{
							System.out.println("warm");
							String howmuchwarm ="warm";
							switch(howmuchwarm){


								case "warm" :{
									
									String mood="good";
									switch(mood){
									
										case "good":{

											String hungry="yes";

											switch(hungry){
												
												case"yes":{
													
													String hungryy="yes";

													switch(hungryy){
												
														case"yes":{
													
															System.out.println("Yes Hungry");
													
														}
													}
													System.out.println("Goodmood");
													break;
																										
													}
											}
											System.out.println("Goodmood");
											break;
										}
									}
								}
									break;

								case "muchwarm" :
									{
									
										System.out.println("muchwarm");
									}
									break;
								default :{
								
								}
							}

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
		}
	}
}

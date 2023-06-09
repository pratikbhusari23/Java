class IPL{
	
	void matchinfo(String team1,String team2){
		System.out.println(team1 + " "+ team2);
	}

	void matchinfo(String team1 , String team2 , String venue){

		System.out.println(team1 + " " + team2);
		System.out.println("Venue = "+ venue);
	
	}
}

class Client{
	
	public static void main(String[] args){
		
		IPL ipl2023 = new IPL();
		ipl2023.matchinfo("Gt","csk","Nmsa");
	}
}

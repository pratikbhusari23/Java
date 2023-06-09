class Match{

	void MatchType(){
		
		System.out.println("t20/Oneday/Test");
	}

}

class IPLMatch extends Match{
	
	void MatchType(){
		
		System.out.println("T20");
	}
}
class TestMatch extends Match{
	
	void MatchType(){
		
		System.out.println("Test");
	}
}

class Client{
	
	public static void main(String[] args){
		
		Match type1 = new IPLMatch();
		type1.MatchType();

		Match type2= new TestMatch();
		type2.MatchType();
	}
}

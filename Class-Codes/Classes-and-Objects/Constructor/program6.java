class Core2Web{
	String favCourse = "java";
	int noofCourses = 8;

	void display(){
		System.out.println(favCourse);
		System.out.println(noofCourses);
	}
}

class Users{
	public static void main(String[] args){
		Core2Web obj = new Core2Web();
		obj.display();

		System.out.println(obj.favCourse);
		System.out.println(obj.noofCourses);
	}
}

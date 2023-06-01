class Language {

    Language() {
        System.out.println("A Language");
    }

}

class Python extends Language {

    Python() {
        System.out.println("Python Programming Language");
    }

    void features(){
        System.out.println("Extensive Standard Library");
    }
}
class CSharp extends Language {

    CSharp() {
        System.out.println("C# Programming Language");
    }
    void features(){
        System.out.println("Memory Management with Garbage Collection");
    }
}

class JavaScript extends Language {

    JavaScript() {
        System.out.println("JavaScript Programming Language");
    }
    void features(){
        System.out.println("Supports Browser Interaction");
    }
    
}

class Developer {

    public static void main(String[] args) {

        Language obj1 = new Language();
        
        Python obj2 = new Python();
        obj2.features();
             
        CSharp obj4 = new CSharp();
        obj4.features();
        
        JavaScript obj5 = new JavaScript();
        obj5.features();
    }
}

/*
 

A Language
A Language
Python Programming Language
Extensive Standard Library
A Language
C# Programming Language
Memory Management with Garbage Collection
A Language
JavaScript Programming Language
Supports Browser Interaction


 */












     //Language obj3 = new Python();
        //obj3.features();
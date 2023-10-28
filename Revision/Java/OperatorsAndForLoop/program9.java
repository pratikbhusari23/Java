import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class program9 {
    
    public static void main (String[] args) {
        int a=10;
        a+=++a-5/3+6*a;
        System.out.print(a);

        List<String> list = new ArrayList<String>();

        // add multiple movie names in list at once

        Collections.addAll(list, "Matrix", "Gladiator", "Harry Potter", "Casino Royale");

        //  sort the list Alphabetically 

        Collections.sort(list);
        Collections.reverse(list);

        // print the list

        System.out.println(list);


    }
}

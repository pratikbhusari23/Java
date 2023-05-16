import java.io.*;

class Stringpalindrome {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String");
        String str = br.readLine();
        
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string is: " + reverse);
        System.out.println("Original string is: " + str);
    
        if(str==reverse){
        System.out.println("True1");
        }
        else{
            System.out.println("False1");
        }
        if (str.equals(reverse)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

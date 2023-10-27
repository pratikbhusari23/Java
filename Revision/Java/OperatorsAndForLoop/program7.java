
public class program7 {
    
    public static void main(String args[]) 
    {
        int x =10;
        int y = 20;
        if(x++ > 10 && ++y > 20 ){
        System.out.print("Inside if  ");
        }else{
        System.out.print("Inside else  ");
        }
        System.out.println(x +" "+y);

        int a=5;
        a+=5+(++a)+(a++);
        System.out.print(a);

     }
}

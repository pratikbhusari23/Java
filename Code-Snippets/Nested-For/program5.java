/*

Find out the missing line for the below pattern

1  2  3

1  2  3 

1  2  3

1  2  3

 */

 class Quiz {
    public static void main(String s[]) {
        int num=4;
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=3;j++){
                System.out.print(j+"  ");
            }
            System.out.print("\n");
	}
        
    }
}

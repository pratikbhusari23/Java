class program8{
    static void fun(String arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i] = "Hello";
        }
    }

public static void main(String[] args) {
    String arr[] = new String[4];
    fun(arr);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
}

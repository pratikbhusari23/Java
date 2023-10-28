import java.io.*;
import java.util.* ;

public class pairSum{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int s = Integer.parseInt(st[1]);

        int[] arr = new int[n];
        st = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st[i]);
        }

        List<int[]> res = pairSum(arr, s);
        if(res.size() == 0){
            System.out.println("No Such Pair Exist");
        } else {
            for(int[] pair : res){
                System.out.println(pair[0] + " and " + pair[1]);
            }
        }
    }
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.

        List<int[]> pairs = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        Arrays.sort(arr);
        int i=0;

        for(int num : arr){
            int complement = s-num;

            if(map.containsKey(complement)){
                pairs.add(new int[] {complement,num});
            }
            map.put(num, i++);
            
        }
        Collections.sort(pairs,Comparator.comparingInt(a -> a[0]));
        return pairs;
    }
}

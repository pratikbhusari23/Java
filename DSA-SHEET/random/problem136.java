/*import java.util.*;

class Solution {
    
    public static int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
		System.out.println(e.getKey()+" "+ e.getValue());
          
        }
        return 1;
    }

    public static void main(String[] args) {

        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
}
*/
import java.util.*;
class Solution {
    public static int singleNumber(int[] nums) {
        
        HashSet<Integer> map = new HashSet<>();

        for(int e : nums){
            if(map.contains(e)){
                map.remove(e);
            }
            else{
                map.add(e);
            }
        }
        Iterator<Integer> it = map.iterator();
        return it.next();
    }
       public static void main(String[] args) {

        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
}

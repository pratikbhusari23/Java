/*problem 121 */
class Solution {
    public int maxProfit(int[] prices) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<prices.length-1 ; i++){
            int max=0;
            for(int j=i+1 ; j<prices.length ; j++){
                
                if(map.containsKey(prices[i])){
                    map.put(prices[i],max);
                }
                else{
                    map.put(prices[i],prices[j]-prices[i]);
                }

                if(max<map.get(prices[i])){
                    max=map.get(prices[i]);
                }
            }
        }

        int max1=0;

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(max1<e.getValue()){
                max1=e.getValue();
            }
        }

        return max1;

    }
}
class Solution {
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        
            
        int profit =0;
        
        for(int i=0;i<prices.length;i++){
           if(min>prices[i]) min = prices[i];
            
        if( profit < prices[i]-min){
           profit = prices[i] - min; 
        }    
        }
        
        return profit;
    }
}

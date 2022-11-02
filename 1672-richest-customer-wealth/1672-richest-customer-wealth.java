class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxwealth=Integer.MIN_VALUE;
        
        for(int customer=0;customer<accounts.length;customer++){
            int tot_money=0;
        
            for(int bank=0;bank<accounts[customer].length;bank++){
                
                tot_money+=accounts[customer][bank];
            }
            
            maxwealth=Math.max(tot_money,maxwealth);
        }
        
        return maxwealth;
    }
}
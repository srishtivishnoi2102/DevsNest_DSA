package Arrays_Strings;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {
	public static int maxProfit(int[] prices) {
		int buy=Integer.MAX_VALUE;
        int max_profit=0;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i]<buy){
                buy=prices[i];
            }else if(prices[i]-buy>max_profit){
                max_profit=prices[i]-buy;
            }
        }
        return max_profit;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices= {7,1,5,3,6,4,3};
		System.out.println("Max Profit : "+maxProfit(prices));

	}

}

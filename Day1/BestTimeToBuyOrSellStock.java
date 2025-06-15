package Day1;

/**
 * @author shree
 **/
public class BestTimeToBuyOrSellStock {
    public static int maxProfit(int[] prices){
        if(prices == null || prices.length<=1){
            return 0;
        }
        int max=0, min=prices[0];
        for(int i=0;i<prices.length;i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(max, (prices[i] - min));
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int max = maxProfit(prices);
        System.out.println("maxProfit: "+max);
    }
}

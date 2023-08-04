package Arrays;

public class buyAndSellStocks {
    public static void main(String args[]){
        int stockPrices[] = {7, 1, 5, 3, 6, 4};

        //if we want to print 5.0
        // float finalPrices = (float) buyAndSellST(stockPrices);
        // System.out.println("The maximum profit will be Rs: " + finalPrices);

        //otherwise
        System.out.println("The maximum profit will be Rs: " + buyAndSellST(stockPrices));

    }
    public static int buyAndSellST(int stockPrices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<stockPrices.length; i++){
            if(buyPrice < stockPrices[i]){
                int profit = stockPrices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit); //global profit
            } else {
               buyPrice = stockPrices[i];  //updating the buying parices 
            }
        }
           return maxProfit;

    }
}

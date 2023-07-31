package ImpQuestions;

public class StocksBuyAndSell {

    public static int BuyAndSell(int prices[]) {
        int BuyPrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (BuyPrices < prices[i]) {
                int profit = prices[i] - BuyPrices;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                BuyPrices = prices[i];

            }

        }  return maxProfit;
    }


        public static void main (String[]args){

            int prices[] = {0, 3, 4, 6, 2, 1, 10, 5};
            System.out.println(BuyAndSell(prices));



    }
}
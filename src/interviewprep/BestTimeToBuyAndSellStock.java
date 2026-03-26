package interviewprep;

/*
 * given an array of prices i-th element corresponds stock price in i-th day. Calculate maximum profit someone can make
 * buying stock and selling it.
 * */
public class BestTimeToBuyAndSellStock {
    /*
     * Key to solution is to hold smallest found value in array and make calculations and comparisons based on that number
     * */
    public static int maxProfit(int[] prices) {
        var minFoundPrice = Integer.MAX_VALUE; //init with the biggest possible int value
        var profit = 0; //holds profit for given iteration
        for (int price : prices) {
            if (price < minFoundPrice) {
                minFoundPrice = price;
            }
            profit = Math.max(profit, price - minFoundPrice);
        }
        return profit;
    }
}


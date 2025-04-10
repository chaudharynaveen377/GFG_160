public class Buy_sell_stock_day8 {
    public static int maxProfit(int[] prices) {

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;


        for (int price : prices) {
            if (price < minprice) {
                minprice = price;
            } else {
                int profit = price - minprice;
                if (maxprofit < profit) {
                    maxprofit = profit;
                }
            }
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={7,6,4,3,1,6};
        System.out.println((maxProfit(arr)));
    }
}

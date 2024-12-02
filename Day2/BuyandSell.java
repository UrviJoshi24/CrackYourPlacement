class BuyandSell {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE; 
        int maxProfit = 0;             

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BuyandSell solution = new BuyandSell();

        // Test case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit for prices1: " + solution.maxProfit(prices1)); // Expected output: 5

        // Test case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit for prices2: " + solution.maxProfit(prices2)); // Expected output: 0

        // Test case 3
        int[] prices3 = {1, 2, 3, 4, 5};
        System.out.println("Max Profit for prices3: " + solution.maxProfit(prices3)); // Expected output: 4

        // Test case 4
        int[] prices4 = {3, 2, 6, 5, 0, 3};
        System.out.println("Max Profit for prices4: " + solution.maxProfit(prices4)); // Expected output: 4
    }
}

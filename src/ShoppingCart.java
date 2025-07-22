public class ShoppingCart {

    public static double calculateTotal(double[] prices, String customerType){
        double total = 0;
        for (int i= 0; i<prices.length;i++){
            total+=prices[i];

        }

        switch(customerType){
            case "PREMIUM":
                total *= 0.9;
                break;
            case "VIP":
                total *= 0.8;
                break;

            default:
                break;
        }
        return total;
    }
    public static double findMostExpensive(double[] prices){
        if(prices.length==0) return 0;

        double max = prices[0];
        for(double price : prices){
            if(price>max) max = price;
        }
        return max;
    }

    public static int countExpensiveItems(double[] prices, double threshold){
        int count = 0;
        for(double price : prices){
            if (price>threshold) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        double[] cart = {25.99, 45.50, 12.99, 89.99, 15.75};

        System.out.println("most expensive item: $" + findMostExpensive(cart));
        System.out.println("items over $30: " + countExpensiveItems(cart, 30));

        System.out.println("Regular customer total: $" + calculateTotal(cart, "REGULAR"));
        System.out.println("Premium customer total: $" + calculateTotal(cart, "PREMIUM"));
        System.out.println("VIP customer total: $" + calculateTotal(cart, "VIP"));
    }
}
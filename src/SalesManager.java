public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public double trimmedMean(int[] sales, int max) {
        int min = sales[0];
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            if (sales[i] < min) {
                min = sales[i];
            }
        }
        return ((double) (sum - max - min)) / (sales.length - 2);
    }
}

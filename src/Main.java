public class Main {
    public static void main(String[] args) {
        long[] sales = {2000, 5487, 10546, 1567, 10550};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Наибольшая продажа составила " + salesManager.max() + " рублей.");
    }
}

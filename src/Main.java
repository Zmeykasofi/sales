public class Main {
    public static void main(String[] args) {
        long[] sales = {535, 2000, 5487, 10546, 1567, 10550};

        SalesManager salesManager = new SalesManager(sales);

        System.out.println("Наибольшая продажа составила " + salesManager.max() + " рублей.");
        System.out.println();
        System.out.println("Cредний объём продаж среди всех продаж, за исключением самой максимальной и самой минимальной, составил " + salesManager.trimmedMean(sales, salesManager.max()) + " рублей.");
    }
}

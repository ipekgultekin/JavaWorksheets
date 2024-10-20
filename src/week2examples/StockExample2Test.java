package week2examples;

public class StockExample2Test {
    public static void main(String[] args) {
        StockExample2 oracleStock = new StockExample2("ORCL", "Oracle Corporation", 34.5, 34.5);
        System.out.println(oracleStock.toString());
        System.out.println("Price-change percentage: " + oracleStock.getChangePercent() + "%");
    }


}

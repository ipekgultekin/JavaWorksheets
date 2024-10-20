package week2examples;

public class StockExample {
    private String symbol;
    private String name;

    public StockExample(String symbol, String name) { //constructor
        this.symbol = symbol;
        this.name = name;
    }

    public String toString(){
        return "Stock Symbol: " + symbol + ", Stock Name: " + name;
    }

}

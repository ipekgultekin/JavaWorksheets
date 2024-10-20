package week2examples;

public class StockExample2 {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public StockExample2(String symbol, String name, double previousClosingPrice, double currentPrice) { //constructor
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public String toString(){
        return "Stock Symbol: " + symbol + ", Stock Name: " + name + ", Previous Closing Price: " + previousClosingPrice + ", Current Price: " + currentPrice;
    }


}

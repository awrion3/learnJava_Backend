package week04;

public class Stock {
    //data field
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    //constructor
    public Stock(){
    }
    public Stock (String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    //methods - mutator
    public void setName(String name){
        this.name = name;
    }
    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }
    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    //method - accessor
    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }
    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / currentPrice;
    }

    @Override
    public String toString(){ return "Stock{}"; }
}
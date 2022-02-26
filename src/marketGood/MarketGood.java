package marketGood;

public class MarketGood {
    public final String name;
    public final int retailPrice;
    private int discountRate;

    public void setDiscountRate(int discountRate){
        this.discountRate = discountRate;
    }

    public int getDiscountRate(){
        return discountRate;
    }

    public MarketGood(String name, int retailPrice, int discountRate){
        this.name = name;
        this.retailPrice = retailPrice;

        if(discountRate < 0 || discountRate > 100){
            this.discountRate = 0;
        }
        else{
            this.discountRate = discountRate;
        }
    }

    public MarketGood(String name, int retailPrice){
        this.name = name;
        this.retailPrice = retailPrice;

        this.discountRate = 0;
    }

    public int getDiscountedPrice(){
        double discountPrice = retailPrice * ((100 - discountRate) / 100.0);
        return (int) discountPrice;
    }

}

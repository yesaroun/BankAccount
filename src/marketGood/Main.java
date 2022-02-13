package marketGood;

public class Main {
    public static void main(String[] args){
        MarketGood g1 = new MarketGood("MacBook Air", 1250000);
        MarketGood g2 = new MarketGood("MacBook Pro", 2990000, 15);
        MarketGood g3 = new MarketGood("iPhone 7", 920000, 20);

        System.out.printf("%s의 할인율: %d%%\n", g1.getName(), g1.getDiscountRate());
        System.out.printf("%s의 할인율: %d%%\n", g2.getName(), g2.getDiscountRate());
        System.out.printf("%s의 정상 가격 : %d원\n", g3.getName(), g3.getRetailPrice());
        System.out.printf("%s의 할인 가격 : %d원\n", g3.getName(), g3.getDiscountedPrice());
        System.out.printf("경쟁 업체가 많아져서 %s의 할인율이 35%%로 올랐습니다.\n", g3.getName());
        g3.setDiscountRate(35);
        System.out.printf("%s의 할인 가격: %d\n", g3.getName(), g3.getDiscountedPrice());
    }
}

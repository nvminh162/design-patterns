import java.util.HashMap;
import java.util.Map;

public class Strategy {

    @FunctionalInterface
    interface PriceCalculator {
        double apply(double originPrice);
    }

    /**
     * Giảm 20% khi đặt trước.
     */
    public double preOrderPrice(double originPrice) {
        return originPrice * 0.8;
    }

    /**
     * Nếu giá gốc <= 200 thì giảm 10%, ngược lại giảm cố định 30.
     */
    public double promotionPrice(double originPrice) {
        return originPrice <= 200 ? originPrice * 0.9 : originPrice - 30;
    }

    /**
     * Nếu giá gốc <= 200 thì giảm 20%, ngược lại giảm cố định 50.
     */
    public double blackFridayPrice(double originPrice) {
        return originPrice <= 200 ? originPrice * 0.8 : originPrice - 50;
    }

    /**
     * Không giảm giá.
     */
    public double defaultPrice(double originPrice) {
        return originPrice;
    }

    private final Map<String, PriceCalculator> getPriceStrategies = new HashMap<>();

    public Strategy() {
        getPriceStrategies.put("preOrder", price -> preOrderPrice(price));
        getPriceStrategies.put("promotion",  price -> promotionPrice(price));
        getPriceStrategies.put("blackFriday",  price -> blackFridayPrice(price));
        getPriceStrategies.put("default",  price -> defaultPrice(price));
    }

    public double getPrice(double originPrice, String typePromotion) {
        PriceCalculator calculator = getPriceStrategies.getOrDefault(typePromotion,  price -> defaultPrice(price));
        return calculator.apply(originPrice);
    }

    public static void main(String[] args) {
        Strategy strategy = new Strategy();

        System.out.println("preOrder (200): " + strategy.getPrice(200, "preOrder"));
        System.out.println("promotion (300): " + strategy.getPrice(300, "promotion"));
        System.out.println("blackFriday (200): " + strategy.getPrice(200, "blackFriday"));
        System.out.println("default (200): " + strategy.getPrice(200, "default"));
    }
}

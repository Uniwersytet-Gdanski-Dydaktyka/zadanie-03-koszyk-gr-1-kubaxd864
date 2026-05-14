import java.util.ArrayList;
import java.util.List;

public class CouponPromotion implements Promotion {
    private final String targetProductCode;

    public CouponPromotion(String targetProductCode) {
        this.targetProductCode = targetProductCode;
    }

    @Override
    public List<Product> apply(List<Product> products) {
        List<Product> result = new ArrayList<>(products);
        for (int i = 0; i < result.size(); i++) {
            Product p = result.get(i);
            if (p.getCode().equals(targetProductCode) && p.getDiscountPrice() > 0) {
                result.set(i, p.copyWithDiscountPrice(p.getDiscountPrice() * 0.70));
                break; 
            }
        }
        return result;
    }

    @Override
    public String getName() {
        return "Jednorazowy kupon 30% na produkt";
    }
}

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BuyTwoGetOneFreePromotion implements Promotion {
    @Override
    public List<Product> apply(List<Product> products) {
        if (products.size() < 3) return products;

        List<Product> sortedByDiscount = new ArrayList<>(products);
        sortedByDiscount.sort(Comparator.comparingDouble(Product::getDiscountPrice));

        for (int i = 0; i < sortedByDiscount.size(); i++) {
            Product p = sortedByDiscount.get(i);
            if (p.getDiscountPrice() > 0) {
                sortedByDiscount.set(i, p.copyWithDiscountPrice(0.0));
                break;
            }
        }
        return sortedByDiscount;
    }

    @Override
    public String getName() {
        return "Promocja 2+1 najtańszy gratis";
    }
}

import java.util.List;
import java.util.stream.Collectors;

public class ValueDiscountPromotion implements Promotion {
    @Override
    public List<Product> apply(List<Product> products) {
        double total = products.stream().mapToDouble(Product::getDiscountPrice).sum();
        if (total > 300.0) {
            return products.stream()
                    .map(p -> p.copyWithDiscountPrice(p.getDiscountPrice() * 0.95))
                    .collect(Collectors.toList());
        }
        return products;
    }

    @Override
    public String getName() {
        return "5% zniżki przy zakupach powyżej 300 zł";
    }
}

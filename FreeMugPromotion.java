import java.util.ArrayList;
import java.util.List;

public class FreeMugPromotion implements Promotion {
    @Override
    public List<Product> apply(List<Product> products) {
        double total = products.stream().mapToDouble(Product::getDiscountPrice).sum();
        if (total > 200.0) {
            List<Product> result = new ArrayList<>(products);
            boolean hasMug = result.stream().anyMatch(p -> p.getCode().equals("MUG-FREE"));
            if (!hasMug) {
                result.add(new Product("MUG-FREE", "Firmowy Kubek", 0.0, 0.0));
            }
            return result;
        }
        return products;
    }

    @Override
    public String getName() {
        return "Darmowy firmowy kubek przy zamówieniu większym niż 200 zł";
    }
}

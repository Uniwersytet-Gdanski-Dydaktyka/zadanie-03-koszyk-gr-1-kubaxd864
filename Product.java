import java.util.Objects;

public class Product {
    private final String code;
    private final String name;
    private final double price;
    private final double discountPrice;

    public Product(String code, String name, double price, double discountPrice) {
        if (code == null || code.isBlank()) throw new IllegalArgumentException("code cannot be empty");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name cannot be empty");
        if (price < 0) throw new IllegalArgumentException("price cannot be negative");
        
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    public Product copyWithDiscountPrice(double newDiscountPrice) {
        if (newDiscountPrice < 0) throw new IllegalArgumentException("discountPrice cannot be negative");
        return new Product(this.code, this.name, this.price, newDiscountPrice);
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getDiscountPrice() { return discountPrice; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
               Double.compare(product.discountPrice, discountPrice) == 0 &&
               Objects.equals(code, product.code) &&
               Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, price, discountPrice);
    }

    @Override
    public String toString() {
        return String.format("Product{code='%s', name='%s', price=%.2f, discount=%.2f}", code, name, price, discountPrice);
    }
}

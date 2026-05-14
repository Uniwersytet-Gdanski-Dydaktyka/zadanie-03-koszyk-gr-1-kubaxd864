error id: file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/Basket.java:_empty_/Product#getName().
file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/Basket.java
empty definition using pc, found symbol in pc: _empty_/Product#getName().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1711
uri: file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/Basket.java
text:
```scala
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {
    private final List<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public Basket(List<Product> products) {
        this.products = new ArrayList<>(products);
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public List<Product> getCheapestProducts(int n) {
        return products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .limit(n)
                .collect(Collectors.toList());
    }

    public List<Product> getMostExpensiveProducts(int n) {
        return products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .limit(n)
                .collect(Collectors.toList());
    }

    public Product getCheapestProduct() {
        return getCheapestProducts(1).stream().findFirst().orElse(null);
    }

    public Product getMostExpensiveProduct() {
        return getMostExpensiveProducts(1).stream().findFirst().orElse(null);
    }

    public void sortProducts(Comparator<Product> comparator) {
        products.sort(comparator);
    }
    
    public void defaultSort() {
        sortProducts(
            Comparator.comparingDouble(Product::getPrice).reversed()
                      .thenComparing(Product::@@getName)
        );
    }

    public double getTotalPrice() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public double getTotalDiscountPrice() {
        return products.stream().mapToDouble(Product::getDiscountPrice).sum();
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Product#getName().
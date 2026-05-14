error id: file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/FreeMugPromotion.java:_empty_/Product#
file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/FreeMugPromotion.java
empty definition using pc, found symbol in pc: _empty_/Product#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 320
uri: file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/FreeMugPromotion.java
text:
```scala
import java.util.ArrayList;
import java.util.List;

public class FreeMugPromotion implements Promotion {
    @Override
    public List<Product> apply(List<Product> products) {
        double total = products.stream().mapToDouble(Product::getDiscountPrice).sum();
        if (total > 200.0) {
            List<Pro@@duct> result = new ArrayList<>(products);
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

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Product#
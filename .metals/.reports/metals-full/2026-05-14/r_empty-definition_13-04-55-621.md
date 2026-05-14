error id: file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/BuyTwoGetOneFreePromotion.java:_empty_/Product#copyWithDiscountPrice#
file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/BuyTwoGetOneFreePromotion.java
empty definition using pc, found symbol in pc: _empty_/Product#copyWithDiscountPrice#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 620
uri: file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/BuyTwoGetOneFreePromotion.java
text:
```scala
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
                sortedByDiscount.set(i, p.copyW@@ithDiscountPrice(0.0));
                break; // tylko jeden wpada jako gratis w promocji 2+1
            }
        }
        return sortedByDiscount;
    }

    @Override
    public String getName() {
        return "Promocja 2+1 (najtańszy gratis)";
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Product#copyWithDiscountPrice#
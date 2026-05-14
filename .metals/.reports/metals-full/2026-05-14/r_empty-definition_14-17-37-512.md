error id: file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/CouponPromotion.java:java/util/List#
file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/CouponPromotion.java
empty definition using pc, found symbol in pc: java/util/List#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 49
uri: file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/CouponPromotion.java
text:
```scala
import java.util.ArrayList;
import java.util.Lis@@t;

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

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/List#
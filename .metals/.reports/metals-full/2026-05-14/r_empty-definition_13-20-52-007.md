error id: file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/PromotionEngine.java:java/util/List#size().
file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/PromotionEngine.java
empty definition using pc, found symbol in pc: java/util/List#size().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1509
uri: file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/PromotionEngine.java
text:
```scala
import java.util.ArrayList;
import java.util.List;

public class PromotionEngine {
    
    public static Basket applyBestPromotions(Basket basket, List<Promotion> availablePromotions) {
        List<List<Promotion>> permutations = generatePermutations(availablePromotions);
        
        List<Product> bestResult = basket.getProducts();
        double bestPrice = Double.MAX_VALUE;
        
        for (List<Promotion> perm : permutations) {
            List<Product> currentProducts = basket.getProducts();
            for (Promotion promo : perm) {
                currentProducts = promo.apply(currentProducts);
            }
            
            double currentPrice = currentProducts.stream().mapToDouble(Product::getDiscountPrice).sum();
            if (currentPrice < bestPrice) {
                bestPrice = currentPrice;
                bestResult = currentProducts;
            }
        }
        
        Basket bestBasket = new Basket(bestResult);
        return bestBasket;
    }
    
    private static <T> List<List<T>> generatePermutations(List<T> original) {
        List<List<T>> permutations = new ArrayList<>();
        if (original.isEmpty()) {
            permutations.add(new ArrayList<>());
            return permutations;
        }
        T firstElement = original.remove(0);
        List<List<T>> returnValue = generatePermutations(original);
        for (List<T> list : returnValue) {
            for (int index = 0; index <= list.siz@@e(); index++) {
                List<T> temp = new ArrayList<>(list);
                temp.add(index, firstElement);
                permutations.add(temp);
            }
        }
        original.add(0, firstElement);
        return permutations;
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/List#size().
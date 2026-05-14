error id: file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/Main.java:java/io/PrintStream#println(+8).
file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/Main.java
empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 574
uri: file:///C:/Users/x/Desktop/Projects/Github/UG/Java/zadanie-03-koszyk-gr-1-kubaxd864/Main.java
text:
```scala
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addProduct(new Product("P1", "Laptop", 3500.0, 3500.0));
        basket.addProduct(new Product("P2", "Myszka", 150.0, 150.0));
        basket.addProduct(new Product("P3", "Klawiatura", 250.0, 250.0));
        basket.addProduct(new Product("P4", "Podkładka", 50.0, 50.0));

        System.out.println("Zwykła suma: " + basket.getTotalPrice());
        basket.sortProducts();
        System.out.p@@rintln("\nProdukty po posortowaniu:");
        basket.getProducts().forEach(System.out::println);

        // Najtańsze i najdroższe
        System.out.println("\nNajtańszy produkt: " + basket.getCheapestProduct());
        System.out.println("Dwa najdroższe produkty: " + basket.getMostExpensiveProducts(2));

        // Promocje
        List<Promotion> promos = Arrays.asList(
                new ValueDiscountPromotion(),
                new BuyTwoGetOneFreePromotion(),
                new FreeMugPromotion(),
                new CouponPromotion("P2")
        );

        Basket bestBasket = PromotionEngine.applyBestPromotions(basket, promos);

        System.out.println("\n--- Zastosowano optymalne promocje ---");
        bestBasket.getProducts().forEach(System.out::println);
        System.out.println("Suma po promocjach: " + bestBasket.getTotalDiscountPrice());
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).
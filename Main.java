import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addProduct(new Product("P1", "Laptop", 3500.0, 3100.0));
        basket.addProduct(new Product("P2", "Myszka", 150.0, 100.0));
        basket.addProduct(new Product("P3", "Klawiatura", 250.0, 230.0));
        basket.addProduct(new Product("P4", "Podkładka", 50.0, 45.0));

        System.out.println("Zwykła suma: " + basket.getTotalPrice());
        basket.sortProducts();
        System.out.println("\nProdukty po posortowaniu:");
        basket.getProducts().forEach(System.out::println);

        System.out.println("\nNajtańszy produkt: " + basket.getCheapestProduct());
        System.out.println("Dwa najdroższe produkty: " + basket.getMostExpensiveProducts(2));

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

package shop;

import item.Item;
import item.Items;
import lombok.Builder;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
public class Shop {

    private String name;
    private List<Item> stock;


    public static void initialize() {
        Shops.GLOBAL_SHOPS.put(0, Shop.builder().name("Amour Shop").stock(List.of(
                        Items.LEATHER_BODY,
                        Items.LEATHER_BODY,
                        Items.LEATHER_BODY,
                        Items.LEATHER_CHAPS
                )).build()
        );
        Shops.GLOBAL_SHOPS.values().forEach(s -> s.display(s));
    }

    public void display(Shop shop) {
        System.out.println("======== Welcome to " + shop.getName() + " ========");
        System.out.println();
        for(Item item: shop.getStock()) {
            System.out.println(item.getName() + " : " + item.getPrice());
        }
    }

    @Getter
    public static class Shops {

        private static final HashMap<Integer, Shop> GLOBAL_SHOPS = new HashMap<>();

    }

}

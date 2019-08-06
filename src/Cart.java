import java.util.HashSet;
import java.util.Set;

public class Cart {
    private Set<String> cart;
    private String name;

    public Cart(String name) {
        this.name = name;
        this.cart = new HashSet<>();
    }

    public boolean addItem(String item) {
        return cart.add(item);
    }

    public Set<String> getItems() {
        return cart;
    }

    public int getCount() {
        return cart.size();
    }
}

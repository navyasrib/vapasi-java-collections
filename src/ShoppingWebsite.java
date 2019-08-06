import java.util.HashMap;

public class ShoppingWebsite {

    private HashMap<String, Category> website = null;
    private String name;

    public ShoppingWebsite(String name) {
        this.website = new HashMap<>();
        this.name = name;
    }

    public void add(String type, Category items) {
         website.put(type, items);
     }

     public Category getItems(String type) {
         return website.get(type);
     }
}

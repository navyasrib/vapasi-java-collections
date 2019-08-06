import java.util.ArrayList;
import java.util.HashMap;

public class Category {

    private HashMap<String, ArrayList<String>> brandsAndItems ;

    public Category() {
        this.brandsAndItems = new HashMap<>();
    }

    public void createBrand(String brandName) {
        brandsAndItems.put(brandName, new ArrayList<>());
    }

    public void add(String brandName, String item) {
        ArrayList<String> items = brandsAndItems.get(brandName);
        items.add(item);
        brandsAndItems.put(brandName, items);
    }

    public ArrayList<String> getBrand(String brandName) {
        return brandsAndItems.get(brandName);
    }
}

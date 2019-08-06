public class Main {

    public static void main(String[] args) {

        Category clothes = new Category();
        Category accessories = new Category();

        clothes.createBrand("zara");
        clothes.add("zara", "t-shirts");
        clothes.add("zara", "skirts");
        clothes.add("zara", "shoes");
        clothes.createBrand("max");
        clothes.add("max", "t-shirts");
        clothes.add("max", "sandals");
        clothes.add("max", "jeans");

        accessories.createBrand("samsung");
        accessories.add("samsung", "mobiles");
        accessories.add("samsung", "washing machines");
        accessories.add("samsung", "TVs");
        accessories.createBrand("LG");
        accessories.add("LG", "Inverters");
        accessories.add("LG", "Refrigerators");

        ShoppingWebsite shoppingWebsite = new ShoppingWebsite("vapasi");
        shoppingWebsite.add("clothes", clothes);
        shoppingWebsite.add("accessories", accessories);

        System.out.println(shoppingWebsite.getItems("clothes").getBrand("zara"));
    }
}

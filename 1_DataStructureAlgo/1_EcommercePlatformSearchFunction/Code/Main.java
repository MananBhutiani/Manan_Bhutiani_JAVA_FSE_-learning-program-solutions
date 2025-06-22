public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Magic Wand", "Electronics"),
            new Product(102, "Bookshelf", "Furniture"),
            new Product(103, "Roti Maker", "Electronics"),
            new Product(104, "Notebook", "Stationery"),
            new Product(105, "Table", "Furniture")
        };

        String target = "Table";

        System.out.println("Linear Search:");
        Product result1 = SearchAlgorithms.linearSearch(products, target);
        if (result1 != null) {
            System.out.println("Found: " + result1);
        } else {
            System.out.println("Product not found.");
        }
        SearchAlgorithms.sortByName(products);

        System.out.println("\nBinary Search:");
        Product result2 = SearchAlgorithms.binarySearch(products, target);
        if (result2 != null) {
            System.out.println("Found: " + result2);
        } else {
            System.out.println("Product not found.");
        }
    }
}

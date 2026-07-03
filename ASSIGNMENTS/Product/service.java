package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class service {
    List<shirt> l = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public int menu() {

        System.out.println("1  Add shirt details");
        System.out.println("2  access all the shirt details");
        System.out.println("3  access shirt details by brand");
        System.out.println("4  access shirt details by price range");
        System.out.println("5  access shirt details by size");
        System.out.println("6  access all shirt  by size and price range");
        System.out.println("7  sort on size low to high");
        System.out.println("8  sort on size high to low");
        System.out.println("9  sort on price low to high");
        System.out.println("10  sort on price high to low");
        System.out.println("0 for exit:");
        System.out.println("Enter the Number : ");
        int toRun = sc.nextInt();
        return toRun;

    }

    public void load() {
        l.add(new shirt("Arrow", "Red", 2200, 32));
        l.add(new shirt("Polo  ", "Blue", 2800, 34));
        l.add(new shirt("VanH ", "White", 2200, 30));
        l.add(new shirt("Levis ", "Black", 2800, 36));
        l.add(new shirt("Tommy ", "Green", 3000, 38));
        l.add(new shirt("H&M   ", "Pink", 2200, 30));
        l.add(new shirt("Zara  ", "Yellow", 3500, 40));
        l.add(new shirt("Arrow", "Gray", 2000, 42));
        l.add(new shirt("Gap   ", "Orange", 2200, 44));
        l.add(new shirt("Arrow", "Purple", 2600, 46));
        l.add(new shirt("Mango ", "Cyan", 2800, 30));
        l.add(new shirt("Arrow", "Brown", 2200, 50));
        l.add(new shirt("Arrow", "Teal", 2300, 52));
    }

    public void addShirtDetails() {

        load();

        System.out.println("Enter shirt brand:");
        String brand = sc.nextLine();
        System.out.println("Enter shirt size in no:");
        int size = Integer.parseInt(sc.nextLine());
        System.out.println("Enter shirt color:");
        String color = sc.nextLine();
        System.out.println("Enter shirt price:");
        double price = Double.parseDouble(sc.nextLine());
        // this object call constructor
        shirt newShirt = new shirt(brand, color, price, size);
        l.add(newShirt);

    }

    public void accessAllShirtDetails() {

        System.out.println("All Shirt Details:");
        for (shirt s : l) {
            System.out.println(s);
        }
    }

    // static List<shirt> getShirtList() {
    // //This method should return the list of shirts
    // //For now, we will return an empty list
    // return new ArrayList<>();
    // }

    public void accessShirtDetailsByBrand() {
        System.out.println("Enter brand to search:");
        String brand = sc.nextLine();
        System.out.println("Shirt Details for brand " + brand + ":");
        for (shirt s : l) {
            if (s.brand.equalsIgnoreCase(brand)) {
                System.out.println(s);
            }
        }

    }

    void accessShirtDetailsByPriceRange() {
        System.out.println("Enter minimum price:");
        double minPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Enter maximum price:");
        double maxPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Shirt Details in price range " + minPrice + " to " +
                maxPrice + ":");
        for (shirt s : l) {
            if (s.price >= minPrice && s.price <= maxPrice) {
                System.out.println(s);
            }
        }

    }

    void accessShirtDetailsBySize() {
        System.out.println("Enter size in Number to search:");
        int size = Integer.parseInt(sc.nextLine());
        System.out.println("Shirt Details for size " + size + ":");
        for (shirt s : l) {
            if (s.size == size) {
                System.out.println(s);
            }
        }
    }

    void accessShirtDetailsBySizeAndPriceRange() {
        System.out.println("Enter size to search:");
        int size = Integer.parseInt(sc.nextLine());
        System.out.println("Enter minimum price:");
        double minPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Enter maximum price:");
        double maxPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Shirt Details for size " + size + " in price range " +
                minPrice + " to " + maxPrice + ":");
        for (shirt s : l) {
            if (s.size == size && s.price >= minPrice && s.price <= maxPrice) {
                System.out.println(s);
            }
        }
    }

    void sortShirtsBySize() {
        l.sort((s1, s2) -> Integer.compare(s1.size, s2.size));
        System.out.println("Shirts sorted by size (low to high):");
        for (shirt s : l) {
            System.out.println(s);
        }
    }

    void sortShirtsByPrice() {
        l.sort((s1, s2) -> Double.compare(s1.price, s2.price));
        System.out.println("Shirts sorted by price (low to high):");
        for (shirt s : l) {
            System.out.println(s);
        }
    }

    void sortShirtsBySizeDescending() {
        l.sort((s1, s2) -> Integer.compare(s2.size, s1.size));
        System.out.println("Shirts sorted by size (high to low):");
        for (shirt s : l) {
            System.out.println(s);
        }
    }

    void sortShirtsByPriceDescending() {
        l.sort((s1, s2) -> Double.compare(s2.price, s1.price));
        System.out.println("Shirts sorted by price (high to low):");
        for (shirt s : l) {
            System.out.println(s);
        }
    }
}

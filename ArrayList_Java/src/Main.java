import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>(List.of("rice", "wheat", "oil", "sugar", "potato", "tomato", "salt", "bread"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("0: Shutdown | 1: Add | 2: Remove");
        try {
            switch (scanner.nextInt()) {
                case 0 -> System.out.println("Shutting down...");
                case 1 -> modify(scanner, groceries, true);
                case 2 -> modify(scanner, groceries, false);
                default -> System.out.println("Invalid option!");
            }
            groceries.sort(String::compareTo);
            System.out.println("Sorted List: " + groceries);
        }catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    private static void modify(Scanner scanner, List<String> list, boolean add) {
        System.out.printf("Enter item to %s:\n", add ? "add" : "remove");
        String item;
        while (add ? list.contains(item = scanner.next()) : !list.contains(item = scanner.next())) {
            System.out.printf("Item %s, try again:\n", add ? "already exists" : "not found");
        }
        if (add) list.add(item);
        else list.remove(item);
    }
}
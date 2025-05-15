// Main.java
import java.util.Scanner;

/**
 * Entry point for the inventory simulator.
 * Presents a console menu and handles user interaction.
 */
public class Main {
    /**
     * Main method starting the application.
     * @param args command-line args (unused)
     */
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Inventory Simulator ---");
            System.out.println("1: Add Stock");
            System.out.println("2: Sell Item");
            System.out.println("3: List Inventory");
            System.out.println("4: Sales History");
            System.out.println("5: Exit");
            System.out.print("Select option or 'q' to quit: ");
            String choice = scanner.nextLine();

            if (choice.equals("q")) {
                running = false;
                break;
            }
            switch (choice) {
                case "1":
                    System.out.print("ID or 'q': ");
                    String id1 = scanner.nextLine();
                    if (id1.equals("q")) break;
                    System.out.print("Name or 'q': ");
                    String name = scanner.nextLine();
                    if (name.equals("q")) break;
                    System.out.print("Category or 'q': ");
                    String category = scanner.nextLine();
                    if (category.equals("q")) break;
                    System.out.print("Cost or 'q': ");
                    String costIn = scanner.nextLine();
                    if (costIn.equals("q")) break;
                    double cost = Double.parseDouble(costIn);
                    System.out.print("Size or 'q': ");
                    String size1 = scanner.nextLine();
                    if (size1.equals("q")) break;
                    System.out.print("Qty or 'q': ");
                    String qtyIn = scanner.nextLine();
                    if (qtyIn.equals("q")) break;
                    int qty = Integer.parseInt(qtyIn);
                    manager.addStock(id1, name, category, cost, size1, qty);
                    break;

                case "2":
                    System.out.print("ID or 'q': ");
                    String id2 = scanner.nextLine();
                    if (id2.equals("q")) break;
                    System.out.print("Size or 'q': ");
                    String size2 = scanner.nextLine();
                    if (size2.equals("q")) break;
                    System.out.print("Qty or 'q': ");
                    String qtyIn2 = scanner.nextLine();
                    if (qtyIn2.equals("q")) break;
                    int qty2 = Integer.parseInt(qtyIn2);
                    System.out.print("Price or 'q': ");
                    String priceIn = scanner.nextLine();
                    if (priceIn.equals("q")) break;
                    double price = Double.parseDouble(priceIn);
                    manager.sellItem(id2, size2, qty2, price);
                    break;

                case "3":
                    manager.listInventory();
                    break;

                case "4":
                    manager.listSales();
                    break;

                case "5":
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}

// InventoryManager.java

/**
 * Coordinates items, inventory, and sales operations.
 */
public class InventoryManager {
    private Item[] items;
    private int itemCount;
    private Inventory inventory;
    private SaleRecord[] sales;
    private int saleCount;

    /**
     * Constructs an InventoryManager with capacity for 100 items and 100 sales.
     */
    public InventoryManager() {
        items = new Item[100];
        itemCount = 0;
        inventory = new Inventory();
        sales = new SaleRecord[100];
        saleCount = 0;
    }

    /**
     * Registers or updates stock for an item-size combination.
     * @param id the item ID
     * @param name the item name
     * @param category the item category
     * @param baseCost the cost per unit
     * @param size the size label
     * @param qty the quantity to add
     */
    public void addStock(String id, String name, String category,
                         double baseCost, String size, int qty) {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId().equals(id)) {
                found = true;
                break;
            }
        }
        if (!found && itemCount < items.length) {
            items[itemCount++] = new Item(id, name, category, baseCost);
        }
        inventory.addVariant(id, size, qty);
    }

    /**
     * Processes a sale if sufficient stock exists, logging a SaleRecord.
     * @param id the item ID
     * @param size the size label
     * @param qty the quantity to sell
     * @param price the sale price per unit
     */
    public void sellItem(String id, String size, int qty, double price) {
        int current = inventory.getQuantity(id, size);
        if (current >= qty) {
            inventory.addVariant(id, size, -qty);
            if (saleCount < sales.length) {
                sales[saleCount++] = new SaleRecord(id, size, qty, price);
            }
        } else {
            System.out.println("Insufficient stock.");
        }
    }

    /**
     * Prints the current inventory to the console.
     */
    public void listInventory() {
        inventory.listVariants();
    }

    /**
     * Prints the sales history, including dates and details.
     */
    public void listSales() {
        for (int i = 0; i < saleCount; i++) {
            SaleRecord s = sales[i];
            System.out.println("Date: " + s.getDate()
                    + " Sold " + s.getQuantitySold()
                    + " of " + s.getItemId()
                    + " size " + s.getSize()
                    + " at $" + s.getSalePrice());
        }
    }
}

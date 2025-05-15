// InventoryManager.java
/**
 * Manages items, inventory, and sales with simple arrays.
 */
public class InventoryManager {
    private Item[] items;
    private int itemCount;
    private Inventory inventory;
    private SaleRecord[] sales;
    private int saleCount;

    /**
     * Constructs a new InventoryManager with capacity for 100 items and sales.
     */
    public InventoryManager() {
        items = new Item[100];
        itemCount = 0;
        inventory = new Inventory();
        sales = new SaleRecord[100];
        saleCount = 0;
    }

    /**
     * Adds stock for an item variant. Registers the item if new.
     * @param id item ID
     * @param name item name
     * @param category item category
     * @param baseCost item cost
     * @param size size label
     * @param qty quantity to add
     */
    public void addStock(String id, String name, String category, double baseCost,
                         String size, int qty) {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId().equals(id)) {
                found = true;
                break;
            }
        }
        if (!found && itemCount < items.length) {
            items[itemCount] = new Item(id, name, category, baseCost);
            itemCount = itemCount + 1;
        }
        inventory.addVariant(id, size, qty);
    }

    /**
     * Processes a sale of a variant if sufficient stock exists.
     * @param id item ID
     * @param size size label
     * @param qty quantity to sell
     * @param price sale price per unit
     */
    public void sellItem(String id, String size, int qty, double price) {
        int current = inventory.getQuantity(id, size);
        if (current >= qty) {
            inventory.addVariant(id, size, -qty);
            if (saleCount < sales.length) {
                sales[saleCount] = new SaleRecord(id, size, qty, price);
                saleCount = saleCount + 1;
            }
        } else {
            System.out.println("Insufficient stock.");
        }
    }

    /**
     * Prints current inventory to the console.
     */
    public void listInventory() {
        inventory.listVariants();
    }

    /**
     * Prints sales history to the console.
     */
    public void listSales() {
        for (int i = 0; i < saleCount; i++) {
            SaleRecord s = sales[i];
            System.out.println("Sold " + s.getQuantitySold()
                + " of " + s.getItemId()
                + " size " + s.getSize()
                + " at $" + s.getSalePrice());
        }
    }
}

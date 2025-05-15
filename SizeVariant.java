// SizeVariant.java

/**
 * Tracks inventory quantity for a specific item-size combination.
 */
public class SizeVariant {
    private String itemId;
    private String size;
    private int quantity;

    /**
     * Constructs a new SizeVariant.
     * @param itemId the ID of the parent item
     * @param size the size label (e.g., "S", "M", "L")
     * @param quantity initial stock quantity
     */
    public SizeVariant(String itemId, String size, int quantity) {
        this.itemId = itemId;
        this.size = size;
        this.quantity = quantity;
    }

    /** @return the parent item ID */
    public String getItemId() {
        return itemId;
    }

    /** @return the size label */
    public String getSize() {
        return size;
    }

    /** @return the current stock quantity */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Adjusts the stock quantity by the specified delta.
     * @param delta positive to increase stock, negative to decrease
     */
    public void changeQuantity(int delta) {
        quantity = quantity + delta;
    }
}

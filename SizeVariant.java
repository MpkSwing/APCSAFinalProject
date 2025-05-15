// SizeVariant.java
/**
 * Tracks stock quantity for an item at a given size.
 */
public class SizeVariant {
    private String itemId;
    private String size;
    private int quantity;

    /**
     * Constructs a new SizeVariant.
     * @param itemId the ID of the parent item
     * @param size the size label (e.g., S, M, L)
     * @param quantity initial stock quantity
     */
    public SizeVariant(String itemId, String size, int quantity) {
        this.itemId = itemId;
        this.size = size;
        this.quantity = quantity;
    }

    /**
     * Returns the parent item ID.
     * @return item ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Returns the size label.
     * @return size
     */
    public String getSize() {
        return size;
    }

    /**
     * Returns the current stock quantity.
     * @return quantity on hand
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Changes the stock quantity by a delta.
     * @param delta positive to add stock, negative to remove
     */
    public void changeQuantity(int delta) {
        quantity = quantity + delta;
    }
}

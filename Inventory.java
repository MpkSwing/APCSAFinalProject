// Inventory.java

/**
 * Manages a collection of SizeVariant entries using fixed-size arrays.
 */
public class Inventory {
    private SizeVariant[] variants;
    private int count;

    /**
     * Constructs an empty Inventory with capacity for 100 variants.
     */
    public Inventory() {
        variants = new SizeVariant[100];
        count = 0;
    }

    /**
     * Adds or updates a SizeVariant in the inventory.
     * @param itemId the ID of the item
     * @param size the size label
     * @param qty the quantity to add (or subtract if negative)
     */
    public void addVariant(String itemId, String size, int qty) {
        for (int i = 0; i < count; i++) {
            SizeVariant v = variants[i];
            if (v.getItemId().equals(itemId) && v.getSize().equals(size)) {
                v.changeQuantity(qty);
                return;
            }
        }
        if (count < variants.length) {
            variants[count] = new SizeVariant(itemId, size, qty);
            count++;
        }
    }

    /**
     * Returns the current stock quantity for a given variant.
     * @param itemId the ID of the item
     * @param size the size label
     * @return the quantity on hand, or 0 if not found
     */
    public int getQuantity(String itemId, String size) {
        for (int i = 0; i < count; i++) {
            SizeVariant v = variants[i];
            if (v.getItemId().equals(itemId) && v.getSize().equals(size)) {
                return v.getQuantity();
            }
        }
        return 0;
    }

    /**
     * Prints all SizeVariant entries to the console.
     */
    public void listVariants() {
        for (int i = 0; i < count; i++) {
            SizeVariant v = variants[i];
            System.out.println("Item: " + v.getItemId()
                    + " Size: " + v.getSize()
                    + " Qty: " + v.getQuantity());
        }
    }
}

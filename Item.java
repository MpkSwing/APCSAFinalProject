// Item.java

/**
 * Represents a product with an ID, name, category, and base cost.
 */
public class Item {
    private String id;
    private String name;
    private String category;
    private double baseCost;

    /**
     * Constructs a new Item.
     * @param id unique identifier for the item
     * @param name name of the item
     * @param category category of the item
     * @param baseCost cost per unit of this item
     */
    public Item(String id, String name, String category, double baseCost) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.baseCost = baseCost;
    }

    /** @return the item ID */
    public String getId() {
        return id;
    }

    /** @return the item name */
    public String getName() {
        return name;
    }

    /** @return the item category */
    public String getCategory() {
        return category;
    }

    /** @return the base cost of this item */
    public double getBaseCost() {
        return baseCost;
    }
}

// Item.java
/**
 * Represents a product with core details such as ID, name, category, and base cost.
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

    /**
     * Returns the item ID.
     * @return item ID
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the item name.
     * @return item name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the item category.
     * @return item category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Returns the base cost of the item.
     * @return base cost
     */
    public double getBaseCost() {
        return baseCost;
    }
}
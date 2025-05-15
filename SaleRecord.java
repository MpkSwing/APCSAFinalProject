// SaleRecord.java
/**
 * Records a simple sale of a variant.
 */
public class SaleRecord {
    private String itemId;
    private String size;
    private int quantitySold;
    private double salePrice;

    /**
     * Constructs a new SaleRecord.
     * @param itemId item identifier
     * @param size size label
     * @param quantitySold number sold
     * @param salePrice price per unit
     */
    public SaleRecord(String itemId, String size, int quantitySold, double salePrice) {
        this.itemId = itemId;
        this.size = size;
        this.quantitySold = quantitySold;
        this.salePrice = salePrice;
    }

    /** @return item ID */
    public String getItemId() { return itemId; }
    /** @return size label */
    public String getSize() { return size; }
    /** @return quantity sold */
    public int getQuantitySold() { return quantitySold; }
    /** @return sale price per unit */
    public double getSalePrice() { return salePrice; }
}

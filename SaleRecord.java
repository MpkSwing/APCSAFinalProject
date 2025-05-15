// SaleRecord.java
import java.time.LocalDate;

/**
 * Records a sale, extending Transaction to include a date.
 */
public class SaleRecord extends Transaction {
    private String itemId;
    private String size;
    private int quantitySold;
    private double salePrice;

    /**
     * Constructs a new SaleRecord with the current date.
     * @param itemId the ID of the item sold
     * @param size the size sold
     * @param quantitySold the quantity sold
     * @param salePrice the price per unit
     */
    public SaleRecord(String itemId, String size, int quantitySold, double salePrice) {
        super(LocalDate.now());
        this.itemId = itemId;
        this.size = size;
        this.quantitySold = quantitySold;
        this.salePrice = salePrice;
    }

    /** @return the item ID */
    public String getItemId() {
        return itemId;
    }

    /** @return the size label */
    public String getSize() {
        return size;
    }

    /** @return the quantity sold */
    public int getQuantitySold() {
        return quantitySold;
    }

    /** @return the sale price per unit */
    public double getSalePrice() {
        return salePrice;
    }
}

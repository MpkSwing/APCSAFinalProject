// Transaction.java
import java.time.LocalDate;

/**
 * Represents a generic transaction with a date.
 */
public class Transaction {
    /** The date when the transaction occurred. */
    private LocalDate date;

    /**
     * Constructs a new Transaction with the specified date.
     * @param date the date of the transaction
     */
    public Transaction(LocalDate date) {
        this.date = date;
    }

    /**
     * Returns the date of this transaction.
     * @return the transaction date
     */
    public LocalDate getDate() {
        return date;
    }
}

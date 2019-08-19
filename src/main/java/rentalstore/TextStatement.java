package rentalstore;

import java.util.List;

public class TextStatement extends AbstractStatement {
    @Override
    protected String renderEveryMovieTitle(String title,double thisAmount) {
        return "\t" + title + "\t" + thisAmount + "\n";
    }

    @Override
    protected String renderTotalAmount(double totalAmount) {
        return "Amount owed is " + totalAmount + "\n";
    }

    @Override
    protected String renderFrequentRenterPoints(double frequentRenterPoints) {
        return "You earned " + frequentRenterPoints + " frequent renter points";
    }

    @Override
    protected String renderCustomerName(String name) {
        return "Rental Record for " + name + "\n";
    }
}

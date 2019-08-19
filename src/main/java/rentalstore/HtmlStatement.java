package rentalstore;

import java.util.List;

public class HtmlStatement extends AbstractStatement{
    @Override
    protected String renderEveryMovieTitle(String title,double thisAmount) {
        return title + ":" + thisAmount + "<br>\n";
    }

    @Override
    protected String renderTotalAmount(double totalAmount) {
        return "<p>Your owed<em>" + totalAmount + "</em><p>\n";
    }

    @Override
    protected String renderFrequentRenterPoints(double frequentRenterPoints) {
        return "On this rental you eared<em>" + frequentRenterPoints + "</em>frequent renter points<p>";
    }



    @Override
    protected String renderCustomerName(String name) {
        return "<h1>Rental Record for<em>" + name + "</em></h1><p>\n";
    }
}

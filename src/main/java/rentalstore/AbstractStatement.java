package rentalstore;

import java.util.List;

public abstract class AbstractStatement {
    public final String statement(List<Rental>rentals,String name) {
        String customer=renderCustomerName(name);
        String movieTitleAndAmount=getTotalAmountBody(rentals);
        String movieTotal=getFrequentRenterPoints(rentals);
        return customer+movieTitleAndAmount+movieTotal;
    }

    protected String getFrequentRenterPoints(List<Rental>rentals) {
        double frequentRenterPoints=0;
        for (Rental each : rentals) {
            frequentRenterPoints++;
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1) {
                frequentRenterPoints++;
            }
            if (each.getMovie().getPriceCode() == Movie.LITERARY) {
                frequentRenterPoints+=0.5;
            }
        }
        return renderFrequentRenterPoints(frequentRenterPoints);
    }

    protected String getTotalAmountBody(List<Rental>rentals) {
        String result="";

        double totalAmount = 0;
        for (Rental each : rentals) {
            double thisAmount = 0;
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDayRented() > 2) {
                        thisAmount += (each.getDayRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDayRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDayRented() > 3) {
                        thisAmount += (each.getDayRented() - 3) * 1.5;
                    }
                    break;
                case Movie.LITERARY:
                    thisAmount += each.getDayRented() * 6;
                    break;
            }
            result+=renderEveryMovieTitle(each.getMovie().getTitle(),thisAmount);
            totalAmount+=thisAmount;
        }
        result+= renderTotalAmount(totalAmount);
        return result;
    }

    protected abstract String renderEveryMovieTitle(String title,double thisAmount) ;

    protected abstract String renderTotalAmount(double totalAmount) ;

    protected abstract String renderFrequentRenterPoints(double frequentRenterPoints) ;

    protected abstract String renderCustomerName(String name) ;
}

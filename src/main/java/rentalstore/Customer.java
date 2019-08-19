package rentalstore;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    HtmlStatement htmlStatement=new HtmlStatement();

    public String html_statement(){
        return htmlStatement.statement(this.rentals,getName());
    }

    TextStatement textStatement=new TextStatement();

    public String statement() {
        return textStatement.statement(this.rentals,getName());
    }
}

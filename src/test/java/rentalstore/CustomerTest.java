package rentalstore;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void test_statement_when_priceCode_is_REGULAR_and_dayRented_is_2(){
        Customer customer=new Customer("Coco");
        customer.addRental(new Rental(new Movie("OneDay",0),2));

        String statement=customer.statement();

        assertEquals("Rental Record for Coco\n" +
                "\tOneDay\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1.0 frequent renter points",statement);
    }

    @Test
    public void test_statement_when_priceCode_is_REGULAR_and_dayRented_is_3(){
        Customer customer=new Customer("Coco");
        customer.addRental(new Rental(new Movie("OneDay",0),3));

        String statement=customer.statement();

        assertEquals("Rental Record for Coco\n" +
                "\tOneDay\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1.0 frequent renter points",statement);
    }

    @Test
    public void test_statement_when_priceCode_is_NEW_RELEASE_and_dayRented_is_1(){
        Customer customer=new Customer("Coco");
        customer.addRental(new Rental(new Movie("OneDay",1),1));

        String statement=customer.statement();

        assertEquals("Rental Record for Coco\n" +
                "\tOneDay\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1.0 frequent renter points",statement);
    }

    @Test
    public void test_statement_when_priceCode_is_NEW_RELEASE_and_dayRented_is_2(){
        Customer customer=new Customer("Coco");
        customer.addRental(new Rental(new Movie("OneDay",1),2));

        String statement=customer.statement();

        assertEquals("Rental Record for Coco\n" +
                "\tOneDay\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2.0 frequent renter points",statement);
    }

    @Test
    public void test_statement_when_priceCode_is_CHILDRENS_and_dayRented_is_3(){
        Customer customer=new Customer("Coco");
        customer.addRental(new Rental(new Movie("OneDay",2),3));

        String statement=customer.statement();

        assertEquals("Rental Record for Coco\n" +
                "\tOneDay\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1.0 frequent renter points",statement);
    }

    @Test
    public void test_statement_when_priceCode_is_CHILDRENS_and_dayRented_is_4(){
        Customer customer=new Customer("Coco");
        customer.addRental(new Rental(new Movie("OneDay",2),4));

        String statement=customer.statement();

        assertEquals("Rental Record for Coco\n" +
                "\tOneDay\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1.0 frequent renter points",statement);
    }

    @Test
    public void test_statement_when_priceCode_is_LITERARY_and_dayRented_is_1(){
        Customer customer=new Customer("Coco");
        customer.addRental(new Rental(new Movie("OneDay",3),1));

        String statement=customer.statement();

        assertEquals("Rental Record for Coco\n" +
                "\tOneDay\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 1.5 frequent renter points",statement);
    }

//    @Test
//    public void test_statement_html_when_priceCode_is_LITERARY_and_dayRented_is_1(){
//        Customer customer=new Customer("Coco");
//        customer.addRental(new Rental(new Movie("OneDay",3),1));
//
//        String statement=customer.htmlStatement();
//
//        assertEquals("Rental Record for Coco\n" +
//                "\tOneDay\t6.0\n" +
//                "Amount owed is 6.0\n" +
//                "You earned 1.5 frequent renter points",statement);
//    }


}
// Creating Class with name Q5 indicating the purpose is to display the total purchase price
import java.util.*;
class Q5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the unit price of the item");
        // Create a double variable unitprice to store the unit price of the item
        double unitprice=sc.nextDouble();
        System.out.println("Enter the quantity of the item");
        // Create a int variable quantity to store the quantity of the item
        int quantity=sc.nextInt();
        // Create a double variable totalcost to store the total purchase price
        double totalcost=unitprice*quantity;
        // Display the total purchase price
        System.out.println("The total purchase price is INR  "+totalcost+" if the quantity "+quantity+" and unit price is INR "+unitprice);
    }
}
// Creating Class with name Q9 indicating the purpose is to display discounted amount of fees of the user
import java.util.*;
class Q9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Fee");
        // Create a int variable fee to store the fees of the user
        int fee=sc.nextInt();
        System.out.println("Enter discount Percent");
        // Create a double variable discountpercent to store the discount percent of the user 
        double discountpercent=sc.nextDouble();
        // Create a double variable discount to store the discount 
        double discount=discountpercent/100.0*fee;
        // Create a double variable finalamount to store the final amount
        double finalamount=fee-discount;
        // Display the discount and the final ammount
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+finalamount);
    }
}
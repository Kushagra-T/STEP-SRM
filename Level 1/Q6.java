// Creating Class with name Q6 indicating the purpose is to display discounted amount of fees
class Q6
{
    public static void main(String args[])
    {
        // Create a int variable fee to store the fees
        int fee=125000;
        // Create a double variable percent to store the percent
        double Percent=10.0;
        // Create a double variable discount to store the discount
        double discount=Percent/100.0*fee;
        // Create a double variable finaldiscountedfee to store the final discounted fee
        double finaldiscountedfee=fee-discount;
        // Display the discount and the final discounted fee
        System.out.println("The discounted ammount is INR "+discount+" and final discounted fee is INR "+finaldiscountedfee);  
    }
}
// Creating Class with name Q4 indicating the purpose is to display and calculate the profit and loss
class Q4
{
    public static void main(String args[])
    {
        // Create a int variable costprice to store the cost price
        int costprice=129;
        // Create a int variable sellingprice to store the selling price
        int sellingprice=191;
        // Create a int variable profit to store the profit
        int profit=sellingprice-costprice;
        // Create a double variable profitpercentage to store the profit percentage
        double profitpercentage=(double)profit/costprice*100.0;
        // Display the profit and profit percentage
        System.out.println("The Cost Price is INR "+costprice+" and Selling Price is INR "+sellingprice+" \nThe Profit is INR "+profit+" and the Profit Percentage is "+profitpercentage);
    }
}
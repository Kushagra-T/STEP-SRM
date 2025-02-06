// Creating Class with name Q7 indicating the purpose is to display the volume of earth in km^3 and miles^3
class Q7
{
    public static void main(String args[])
    {
        // Create a int variable radiusinkilometers to store the distance in kilometers
        int radiusinkilometers=6378;
        // Create a double variable radiusinmiles to store the radius in miles
        double radiusinmiles=radiusinkilometers*1.6;
        // Create a double variable volumeincubickilometer to store the volume in cubic kilometers
        double volumeincubickilometer=4/3.0*22/7.0*radiusinkilometers*radiusinkilometers*radiusinkilometers;
        // Create a double variable volumeincubicmiles to store the volume in cubic miles
        double volumeincubicmiles=4/3.0*22/7.0*radiusinmiles*radiusinmiles*radiusinmiles;
        // Display the volume in cubic kilometers and cubic miles
        System.out.println("The volume of earth in cubic kilometer is "+volumeincubickilometer+" and cubic miles is "+volumeincubicmiles);
    }
}
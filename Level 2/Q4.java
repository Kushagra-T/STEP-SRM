// Creating Class with name Q4 indicating the purpose is to display the diatance in yards and miles
import java.util.*;
class Q4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in feet");
        // Create a double variable distanceinfeet to store the distance in feet
        double distanceinfeet=sc.nextDouble();
        // Create a double variable distanceinyards to store the distance in yards
        double distanceinyards=distanceinfeet/3.0;
        // Create a double variable distanceinmiles to store the distance in miles
        double distanceinmiles=distanceinfeet/(distanceinyards*1760.0);
        // Display the distance in yards and miles
        System.out.println("The distance "+distanceinfeet+" in yards is "+distanceinyards+" and in miles is "+distanceinmiles);
    }
}
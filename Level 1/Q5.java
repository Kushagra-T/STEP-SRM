// Creating Class with name Q5 indicating the purpose is to display and divide the 14 pen in 3 students
class Q5
{
    public static void main(String args[])
    {
        // Create a int variable totalpen to store the total pen
        int totalpen=14;
        // Create a int variable totalstudent to store the total student
        int totalstudent=3;
        // Create a int variable pendivied to store the number of pen divided
        int pendivided=totalpen/totalstudent;
        // Create a int variable pen left to store the total pen left
        int penleft=totalpen%totalstudent;
        // Display the pen divided into per student and pen left
        System.out.println("The Pen Per Student is "+pendivided+" and the remaining pen not distributed is "+penleft);
    }
}
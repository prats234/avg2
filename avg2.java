import java.util.Scanner;

public class avg2
{
    public static void main(String[] args)
    {
        System.out.println("How many Subjects do you have..?");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        double[] nbcourses = new double[x];
        double sum = 0;

        for (int i = 0; i < nbcourses.length;i++)
        {
            System.out.print("Marks for Subject " + (i + 1) + " is :");
            nbcourses[i] = scan.nextDouble();
        }

        for(int i = 0;i < nbcourses.length; i++)
        {
            sum = sum+nbcourses[i];
        }
        {
            double average = sum/nbcourses.length;
            System.out.println("   ");
            System.out.println("Your Average of Subject " +x+ " is : " +average);
        if(average > 90)
        {
            System.out.println("You have A Grade..!");
        }
        else if(90 > average && average > 80)
        {
            System.out.println("You have B Grade..!");
            System.out.println("Well Done..!");
        }
        else if (80 > average && average > 70)
        {
            System.out.println("You have C Grade..!");
        }
        else if (70 > average && average > 60)
        {
            System.out.println("You have D Grade..!");
        }
        else if (60 > average && average < 60)
        {
            System.out.println("You are Failed..!");
        }
        else
        {
            System.out.println("Please try again..");
        }

        }
    }
}

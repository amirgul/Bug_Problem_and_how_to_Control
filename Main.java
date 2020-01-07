import java.util.Scanner;

public class Main
{

    public static final double GROWTH_RATE = 0.95;
    public static final double ONE_BUG_VOLUME = 0.002;
    public static void main(String[] args)
    {

        Scanner keybaord = new Scanner(System.in);
        System.out.println("please enter total house volume");
        double houseVolume = keybaord.nextDouble();
        System.out.println("Now please enter initial roaches in your house");
        double initialRoaches = keybaord.nextDouble();
        double population = initialRoaches;
        double totalVolume = population * ONE_BUG_VOLUME;
        double newBug, newBugVolume;
        int countWeeks =0;
        while (totalVolume < houseVolume)
        {
            newBug = population * GROWTH_RATE;
            newBugVolume = newBug * ONE_BUG_VOLUME;
            population = population + newBug;
            totalVolume = totalVolume + newBugVolume;
            countWeeks++;
        }
        System.out.println("Starting with the house volume of: " + houseVolume);
        System.out.println("With initital roaches population of: " + initialRoaches);
        System.out.println("it will take: " + countWeeks + " weeks to fill up the complete house");
        System.out.println("with roaches population of: " + (int)population);
        System.out.println("they will fill the volume of: " + (int)totalVolume);


    }
}

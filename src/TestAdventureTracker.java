import java.io.IOException;

public class TestAdventureTracker {

    public static void main(String[] args) throws IOException {
        // create new AdventureTracker sectionNumber = 0  goBackInteger = 0
        AdventureTracker testTracker = new AdventureTracker();

        //Display Section Number, goBackInteger, Location, Detail, and Random Event
        System.out.println("Section Number:" + testTracker.getSectionNum());
        System.out.println("Go back integer: " + testTracker.getGoBackInteger());
        System.out.println(testTracker.getLocation());
        System.out.println("\n" + testTracker.getDetail());
        System.out.println("\n" + testTracker.getRandomEvent());

        // Push forward three times sectionNumber = 3  goBackInteger = 0
        testTracker.pushForward();
        testTracker.pushForward();
        testTracker.pushForward();

        //Display Section Number, goBackInteger, Location, Detail, and Random Event
        System.out.println("\nSection Number:" + testTracker.getSectionNum());
        System.out.println("Go back integer: " + testTracker.getGoBackInteger());
        System.out.println(testTracker.getLocation());
        System.out.println("\n" + testTracker.getDetail());
        System.out.println("\n" + testTracker.getRandomEvent());

        // Go Back Once sectionNumber = 2  goBackInteger = 1
        testTracker.goBack();

        //Display Section Number, goBackInteger, Location, Detail, and Random Event
        System.out.println("\nSection Number:" + testTracker.getSectionNum());
        System.out.println("Go back integer: " + testTracker.getGoBackInteger());
        System.out.println(testTracker.getLocation());
        System.out.println("\n" + testTracker.getDetail());
        System.out.println("\n" + testTracker.getRandomEvent());

        // Go Back Again sectionNumber = 1  goBackInteger = 2
        testTracker.goBack();

        //Display Section Number, goBackInteger, Location, Detail, and Random Event
        System.out.println("\nSection Number:" + testTracker.getSectionNum());
        System.out.println("Go back integer: " + testTracker.getGoBackInteger());
        System.out.println(testTracker.getLocation());
        System.out.println("\n" + testTracker.getDetail());
        System.out.println("\n" + testTracker.getRandomEvent());

        // Push Forward once sectionNumber = 2  goBackInteger = 0
        testTracker.pushForward();

        //Display Section Number, goBackInteger
        System.out.println("\nSection Number:" + testTracker.getSectionNum());
        System.out.println("Go back integer: " + testTracker.getGoBackInteger());



    }
}

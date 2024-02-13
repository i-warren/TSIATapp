public class TestDie {

    public static void main(String[] args) {

        // Create Die object with 100 sides
        Die testDie = new Die(100);

        //set adv and disAdv to true
        testDie.setAdv(true);
        testDie.setDisAdv(true);

        //test getSides
        System.out.println("The Die has " + testDie.getSides() + " sides.");

        //test getAdv
        System.out.println("Adv: " + testDie.getAdv());

        //test getDisAdv
        System.out.println("DisAdv: " + testDie.getDisAdv());

        //test rollDie
        //adv = true, disAdv = false
        testDie.setAdv(true);
        testDie.setDisAdv(false);

        System.out.println("\nAdvantage:");
        System.out.println("The result is : " + testDie.rollDie());
        System.out.println("numbers: " + testDie.getX() + " , " + testDie.getY());

        //adv = false, disAdv = true
        testDie.setAdv(false);
        testDie.setDisAdv(true);

        System.out.println("\nDisadvantage:");
        System.out.println("The result is : " + testDie.rollDie());
        System.out.println("numbers: " + testDie.getX() + " , " + testDie.getY());

        // all other results
        // both true
        testDie.setAdv(true);
        testDie.setDisAdv(true);

        System.out.println("\nBoth:");
        System.out.println("The result is : " + testDie.rollDie());
        System.out.println("numbers: " + testDie.getX() + " , " + testDie.getY());

        // both false
        testDie.setAdv(false);
        testDie.setDisAdv(false);

        System.out.println("\nNeither:");
        System.out.println("The result is : " + testDie.rollDie());
        System.out.println("numbers: " + testDie.getX() + " , " + testDie.getY());


        //test toString Descriptor
        System.out.println("\n" + testDie.toString());
    }

}
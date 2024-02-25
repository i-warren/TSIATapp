import java.io.IOException;

public class TestLocation {

    public static void main(String[] args)
            throws IOException {
        // Create Location at sectionNum = 0
        Location testLocation = new Location(0);

        //test getters
        System.out.println(testLocation);

        // Create Location at sectionNum = 1
        Location testLocation2 = new Location(1);

        //test getters
        System.out.println("\n\n" + testLocation2);


        // test array TESTING ONLY
        System.out.println("\nLocation possibilities at Section number " + testLocation2.getSectionNum());
        for (int i = 1; i < 28; i++) {
//            System.out.println("i = " + i + "Index val: " + );
            System.out.println(testLocation2.checkArray(i + testLocation2.getSectionNum() - 1));

        }
    }

}


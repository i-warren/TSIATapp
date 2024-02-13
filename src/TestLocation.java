import java.io.IOException;

public class TestLocation {

    public static void main(String[] args)
            throws IOException {
        // Create Location at sectionNum = 0
        Location testLocation = new Location(0);

        //test getters
        System.out.println("Location: " + testLocation.getTitle() + "\n" + testLocation.getWhatItIs() + "\n\n"
                + "Read Aloud: " + testLocation.getReadAloud() +
                "\nLocation Detail: " + testLocation.getDetail());

        // Create Location at sectionNum = 1
        Location testLocation2 = new Location(1);

        //test getters
        System.out.println("\n\nLocation: " + testLocation2.getTitle() + "\n" + testLocation2.getWhatItIs() + "\n\n"
                + "Read Aloud: " + testLocation2.getReadAloud() +
                "\nLocation Detail: " + testLocation2.getDetail());

        // test array TESTING ONLY
        System.out.println("\nLocation possibilites at Section number " + testLocation2.getSectionNum());
        for (int i = 1; i < 21; i++) {
//            System.out.println("i = " + i + "Index val: " + );
            System.out.println(testLocation2.checkArray(i + testLocation2.getSectionNum() - 1));

        }
    }

}


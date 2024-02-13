import java.io.IOException;

public class TestLocation {

    public static void main(String[] args)
            throws IOException {
        // Create Location
        Location testLocation = new Location(4);

        //test getters
        System.out.println("Location: " + testLocation.getTitle() + "\n" + testLocation.getWhatItIs() + "\n\n"
                + "Read Aloud: " + testLocation.getReadAloud() +
                "\nLocation Detail: " + testLocation.getDetail());

    }

}


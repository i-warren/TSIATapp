import java.io.IOException;

public class TestRandomEvent {

    public static void main(String[] args) throws IOException{
        //create RandomEvent object
        RandomEvent testRandomEvent = new RandomEvent(0);

        // Display event info
        System.out.printf("Random Event: " + testRandomEvent.getTitle() + "\n");

        //set  and display randomEvent
        testRandomEvent.setTitle(5);
        System.out.printf("Random Event: " + testRandomEvent.getTitle());


    }

}
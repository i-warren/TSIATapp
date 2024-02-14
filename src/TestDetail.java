import java.io.IOException;

public class TestDetail {

    public static void main(String[] args) throws IOException {
        // Create detail object at section num 0
        Detail testDetail = new Detail(0);

        //test getters
        System.out.println(testDetail);

        // Create detail object at section num 5
        Detail testDetail2 = new Detail(5);

        //test getters
        System.out.println(testDetail2);

    }

}
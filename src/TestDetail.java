import java.io.IOException;

public class TestDetail {

    public static void main(String[] args) throws IOException {
        // Create detail object at section num 0
        Detail testDetail = new Detail(0);

        //test getters
        System.out.printf("Detail: " + testDetail.getTitle() + "\n\n" + testDetail.getEffect());

        // Create detail object at section num 5
        Detail testDetail2 = new Detail(5);

        //test getters
        System.out.printf("Detail: " + testDetail2.getTitle() + "\n\n" + testDetail2.getEffect());

    }

}
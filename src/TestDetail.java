import java.io.IOException;

public class TestDetail {

    public static void main(String[] args) throws IOException {
        // Create detail object
        Detail testDetail = new Detail(2);

        //test getters
        System.out.printf("Detail: " + testDetail.getTitle() + "\n\n" + testDetail.getEffect());

    }

}
import java.io.IOException;

public class RandomEvent extends Section {


    private String[] randomEventArray = new String[17];


    // Create Random Event object from sectionNum
    RandomEvent(int sectionNum) throws IOException {
        this.sectionNum = sectionNum;

        //create d20 die
        Die locationDie = new Die(20);

        //roll result
        int index = locationDie.rollDie() + sectionNum;

        //set Arrays
        randomEventArray = readArray("src\\randomEventTitle.txt");

        //get data from arrays
        if (index < 17) {
            this.setTitle(index);
        } else {
            index = 16;
            this.setTitle(index);
        }
    }

    // return title
    public String getTitle() {
        return title;
    }

    //set title
    public void setTitle(int index) {
        title = randomEventArray[index];
    }

}


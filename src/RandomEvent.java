import java.io.IOException;

public class RandomEvent extends Section {


    private String[] randomEventArray;


    // Create Random Event object from sectionNum
    RandomEvent(int sectionNum) throws IOException {
        this.sectionNum = sectionNum;

        //create d20 die
        Die locationDie = new Die(20);

        //roll result
        int index = locationDie.rollDie() - 1;

        //set Arrays
        randomEventArray = readArray("src\\randomEventTitle.txt");

        //get data from arrays
        if (this.sectionNum == 0) {
            setTitle("");
        } else if (index < 20) {
            this.setTitle(index);
        }
    }


    //set title
    public void setTitle(int index) {
        title = randomEventArray[index];
    }

    // set title overloaded for String
    public void setTitle(String s) {
        title = s;
    }

    @Override   // override toString()
    public String toString() {
        return (this.title);
    }

}


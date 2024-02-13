import java.io.IOException;

public class Location extends Section {

    private String readAloud;
    private String locationDetail;
    private String[] locationTitleArray = new String[28];
    private String[] locationWhatIsArray = new String[28];
    private String[] locationReadArray = new String[28];
    private String[] locationDetailArray = new String[28];
    private int sectionNum;


    // Create Location from sectionNum
    Location(int rollNum) throws IOException{
        this.sectionNum = rollNum;


        //create d20 die
        Die locationDie = new Die(20);

        //roll result
        int index = locationDie.rollDie() + sectionNum;

        //set Arrays
        locationTitleArray = readArray("src\\locationTitles.txt");
        locationWhatIsArray = readArray("src\\locationWhatIs.txt");
        locationReadArray = readArray("src\\locationRead.txt");
        locationDetailArray = readArray("src\\locationDetail.txt");

        //get data from array
        if (index < 29) {
            this.setTitle(index);
            this.setWhatItIs(index);
            this.setReadAloud(index);
            this.setDetail(index);
        } else {
            index = 28;
            this.setTitle(index);
            this.setWhatItIs(index);
            this.setReadAloud(index);
            this.setDetail(index);
        }

    }


    @Override
    public int getSectionNum() {
        return sectionNum;
    }

    //Return readAloud
    public String getReadAloud() {
        return readAloud;
    }

    // Return LocationDetail
    public String getDetail() {
        return locationDetail;
    }

    // set title
    public void setTitle(int index) {
        title = locationTitleArray[index];
    }

    // set whatItIs
    public void setWhatItIs(int index) {
        whatItIs = locationWhatIsArray[index];
    }

    // set readAloud
    public void setReadAloud(int index) {
        readAloud = locationReadArray[index];
    }

    // set detail
    public void setDetail(int index) {
        locationDetail = locationDetailArray[index];
    }


}

import java.io.IOException;

public class Location extends Section {

    private String readAloud;
    private String locationDetail;
    private String[] locationTitleArray;
    private String[] locationWhatIsArray;
    private String[] locationReadArray;
    private String[] locationDetailArray;
    private int sectionNum;


    // Create Location from sectionNum
    Location(int sectionNum) throws IOException{
        this.sectionNum = sectionNum;


        //create d20 die
        Die locationDie = new Die(20);

        //roll result
        int index = locationDie.rollDie() + this.sectionNum - 1;

        //set Arrays
        locationTitleArray = readArray("src\\locationTitles.txt");
        locationWhatIsArray = readArray("src\\locationWhatIs.txt");
        locationReadArray = readArray("src\\locationRead.txt");
        locationDetailArray = readArray("src\\locationDetail.txt");

        //get data for Location
        if (this.sectionNum == 0) {
            this.setTitle(22);
            this.setWhatItIs(22);
            this.setReadAloud(22);
            this.setDetail(22);

        }else if (index < 29) {
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

    public String checkArray(int n){
        return locationTitleArray[n];
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

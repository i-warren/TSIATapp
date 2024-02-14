import java.io.IOException;
import java.util.ArrayList;

public class AdventureTracker {

    private int sectionNum;
    private int goBackInteger;
    private Location currentLocation;
    private Detail currentDetail;
    private RandomEvent currentRandomEvent;
    private ArrayList<Location> locationArrayList = new ArrayList<Location>();
    private ArrayList<Detail> detailArrayList = new ArrayList<Detail>();

    AdventureTracker() throws IOException {
        sectionNum = 0;
        goBackInteger = 0;
        currentLocation =  new Location(0);
        currentDetail = new Detail(0);
        currentRandomEvent = new RandomEvent(0);
        locationArrayList.add(currentLocation);
        detailArrayList.add(currentDetail);

    }

    public void setSectionNum(int sectionNum) {
        this.sectionNum = sectionNum;
    }

    public void incrementSectionNum() {
        sectionNum ++;
    }

    public void decrementSectionNum() {
        sectionNum --;
    }

    //move forward
    public void pushForward() throws IOException {
        incrementSectionNum();
        goBackInteger = 0;  // reset goBack integer

        // create new random section
        currentLocation = new Location(sectionNum);
        locationArrayList.add(this.currentLocation);    // add location to list
        currentDetail = new Detail(sectionNum);
        detailArrayList.add(currentDetail);             // add detail to list
        currentRandomEvent = new RandomEvent(sectionNum);

    }

    //move back
    // TODO Create functionality for go back one vs more
    public void goBack() throws IOException {
        decrementSectionNum();
        goBackInteger ++;
        if (goBackInteger <= 1){    // get last Location and Detail from lists
            currentLocation = locationArrayList.get(locationArrayList.size() - 2);
            currentDetail = detailArrayList.get(detailArrayList.size() - 2);
            currentRandomEvent = new RandomEvent(sectionNum);
        } else {        // Create new random section
            currentLocation = new Location(sectionNum);
            currentDetail = new Detail(sectionNum);
            currentRandomEvent = new RandomEvent(sectionNum);
        }


    }

    //stay put
    public void stayPut() throws IOException {
        currentRandomEvent = new RandomEvent(sectionNum);
    }

    // return location
    public Location getLocation() {
        return currentLocation;
    }

    //return detail
    public Detail getDetail() {
        return currentDetail;
    }

    //return random event
    public RandomEvent getRandomEvent() {
        return currentRandomEvent;
    }

    //return sectionNum
    public int getSectionNum() {
        return sectionNum;
    }

    // return goBackInteger
    public int getGoBackInteger(){
        return goBackInteger;
    }

    // return locationArrayList
    public ArrayList<Location> getLocationArrayList() {
        return locationArrayList;
    }

}
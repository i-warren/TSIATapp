import java.io.IOException;

public class AdventureTracker {

    private int sectionNum;
    private Location currentLocation;
    private Detail currentDetail;
    private RandomEvent currentRandomEvent;

    AdventureTracker(){
        sectionNum = 0;

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
    public void moveForward() throws IOException {
        incrementSectionNum();
        this.currentLocation = new Location(sectionNum);
        this.currentDetail = new Detail(sectionNum);
        this.currentRandomEvent = new RandomEvent(sectionNum);

    }

    //move back
    // TODO Create functionality for go back one vs more
    public void moveBack() throws IOException {
        decrementSectionNum();
        currentLocation = new Location(sectionNum);
        currentDetail = new Detail(sectionNum);
        currentRandomEvent = new RandomEvent(sectionNum);

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
}
import java.util.Random;

public class Die {

    private int numSides;
    private boolean adv;
    private boolean disAdv;
    private int x;
    private int y;

    //Construct Default Die Object
    Die() {
        numSides = 10;
        adv = false;
        disAdv = false;
    }

    //Construct Die with specified sides
    Die(int sides) {
        numSides = sides;
        adv = false;
        disAdv = false;
    }

    //set numSides
    public void setSides (int sides) {
        numSides = sides;
    }

    //set adv
    public void setAdv (boolean adv) {
        this.adv = adv;
    }

    //set disAdv
    public void setDisAdv (boolean dAdv) {
        disAdv = dAdv;
    }

    // Return numSides
    public int getSides() {
        return numSides;
    }

    // Return X
    public int getX() {
        return x;
    }

    // Return y
    public int getY() {
        return y;
    }

    // Return adv
    public boolean getAdv() {
        return adv;
    }

    // Return disAdv
    public boolean getDisAdv() {
        return disAdv;
    }

    /*
     * Roll die and return result
     * If adv only, roll twice take highest
     * If disAdv only, roll twice take lowest
     * Else roll once
     */
    public int rollDie() {
        int result = 0;

        // create an object of Random class
        Random random = new Random();

        // get 2 random numbers using numSides
        x = random.nextInt(numSides)+ 1;
        y = random.nextInt(numSides) + 1;

        // Adv only
        if (adv && !disAdv) {

            //compare numbers and take largest
            if (x > y) {
                result = x;
            }
            else {
                result = y;
            }
            //disAdv only
        } else if (disAdv && !adv) {
            //compare numbers and take lowest
            if (x < y) {
                result = x;
            }
            else {
                result = y;
            }

        } else {
            result = x;
        }

        return result;
    }

    // Return a string description for the Die
    public String toString() {
        return "Die Object \n Sides: " + numSides + "\n Advantage: " + adv +
                "\n Disadvantage: " + disAdv;
    }

}
import java.io.IOException;

public class Detail extends Section {

    private String effect;

    private String[] detailTitleArray;
    private String[] detailEffectArray;
    private int sectionNum;

    // Create Detail from sectionNum
    Detail(int sectionNum) throws IOException {
        this.sectionNum = sectionNum;


        //create d20 die
        Die locationDie = new Die(20);

        //roll result
        int index = locationDie.rollDie() + this.sectionNum - 1;

        //set Arrays
        detailTitleArray = readArray("src\\detailTitles.txt");
        detailEffectArray = readArray("src\\detailEffect.txt");

        //get data from arrays
        if (this.sectionNum == 0) {
            this.setTitle("");
            this.setEffect("");
        }else if (index < 28) {
            this.setTitle(index);
            this.setEffect(index);
        } else {
            index = 27;
            this.setTitle(index);
            this.setEffect(index);
        }

    }


    //return effect
    public String getEffect() {
        return effect;
    }

    // set title
    public void setTitle(int index) {
        this.title = detailTitleArray[index];
    }

    // set title overload for String
    public void setTitle(String s){
        this.title = s;
    }

    //set effect
    public void setEffect(int index) {
        this.effect = detailEffectArray[index];
    }

    // set effect overload for String
    public void setEffect(String s){
        this.effect = s;
    }

    @Override   // override toString()
    public String toString() {
        return ("Detail: " + this.title + "\n" + this.effect);
    }

}
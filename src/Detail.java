import java.io.IOException;

public class Detail extends Section {

    private String effect;

    private String[] detailTitleArray = new String[27];
    private String[] detailEffectArray = new String[27];
    private int sectionNum;

    // Create Detail from sectionNum
    Detail(int rollNum) throws IOException {
        this.sectionNum = rollNum;


        //create d20 die
        Die locationDie = new Die(20);

        //roll result
        int index = locationDie.rollDie() + sectionNum;

        //set Arrays
        detailTitleArray = readArray("src\\detailTitles.txt");
        detailEffectArray = readArray("src\\detailEffect.txt");

        //get data from arrays
        if (index < 28) {
            this.setTitle(index);
            this.setEffect(index);
        } else {
            index = 27;
            this.setTitle(index);
            this.setEffect(index);
        }

    }

    // return title
    @Override
    public String getTitle() {
        return title;
    }

    //return effect
    public String getEffect() {
        return effect;
    }

    // set title
    public void setTitle(int index) {
        title = detailTitleArray[index];
    }

    //set effect
    public void setEffect(int index) {
        effect = detailEffectArray[index];
    }

}
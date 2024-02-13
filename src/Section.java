import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Section {

    //private object variables
    protected String title;
    protected String whatItIs;
    protected int sectionNum;


    //set sectionNum
    public void setSectionNum(int sectionNum) {
        this.sectionNum = sectionNum;
    }

    //return title
    public String getTitle() {
        return title;
    }

    //return whatItIs
    public String getWhatItIs() {
        return whatItIs;
    }

    // Return sectionNum
    public int getSectionNum() {
        return sectionNum;
    }

    // Read to Array
    public String[] readArray(String filename)
            throws IOException {

        File file = new File(filename);  // Create file obj from args
        // if file does not exist then exit
        if (!file.exists()) {
            System.out.println("File: " +
                    file +
                    " does not exist. ");
            System.exit(1);
        }

        // list that holds strings of a file
        List<String> listOfStrings
                = new ArrayList<String>();

        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNext()) {

                String line = myReader.nextLine();
                listOfStrings.add(line);

            }



        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // storing the data in arraylist to array
        String[] array
                = listOfStrings.toArray(new String[0]);

        return array;



    }



}

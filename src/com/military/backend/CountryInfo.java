package com.military.backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public abstract class CountryInfo {
    /**
     * Instance variables
     * heading, represented what country we will talk about
     * headingImagePath, image that will be in the heading square
     * infoFilePath, brief heading text path file
     */

    private String heading;
    private String headingImagePath;
    private String infoFilePath;

    /**
     * getter for heading
     * @return string heading
     */
    public String getHeading() {return this.heading;}

    /**
     * getter for headingImagepath
     * @return string imagePath
     */
    public String getHeadingImagePath() {return this.headingImagePath;}

    /**
     * getter for InfoFilePath
     * @return string infoFilePath
     */
    public String getInfoFilePath() {return this.infoFilePath;}

    /**
     * this method reads a text from given file and sets it as an instance variable
     */

    public String readTextFromFile() throws IOException {
        String text = null;
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File(this.infoFilePath));
            while (fileReader.hasNext()){
                text += fileReader.nextLine() + "\n";
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return text;
    }
}

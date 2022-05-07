package com.military.backend;
import java.util.Scanner;
import java.io.*;

public class RussiaFirst extends CountryInfo{

    private final String heading = "Russia";
    private final String headingImagePath = "/Users/borismartirosyan/Desktop/AUA/OOP/Group_project/Images/thumbs_b_c_cfa67c264cd929f36ff3ba14d60797c4.jpeg";
    private final String infoFilePath = "/Users/borismartirosyan/Desktop/AUA/OOP/Group_project/Information_center/russia.txt";


    public String getHeading() {return this.heading;}


    public String getHeadingImagePath() {return this.headingImagePath;}


    public String getInfoFilePath() {return this.infoFilePath;}


    @Override
    public String readTextFromFile() throws FileNotFoundException {
        String text = "";
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File(this.infoFilePath));
            while (fileReader.hasNext()){
                text += fileReader.nextLine() + "\n";
            }
        }
        catch (FileNotFoundException e){
            throw new FileNotFoundException();
            //System.out.println(e.getMessage());
        }
        return text;
    }
}

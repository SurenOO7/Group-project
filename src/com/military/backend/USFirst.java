package com.military.backend;

import java.io.IOException;

public class USFirst extends CountryInfo{
    private final String heading = "USA";
    private final String headingImagePath = "/Users/borismartirosyan/Desktop/AUA/OOP/Group_project/Images/Screen Shot 2022-05-02 at 20.49.12.png";
    private final String infoFilePath = "/Users/borismartirosyan/Desktop/AUA/OOP/Group_project/Information_center/us.txt";

    public String getHeadingImage(){
        return this.headingImagePath;
    }
}

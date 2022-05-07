package com.military.frontend;

import javax.swing.*;
import java.awt.*;

public class FranceSquare extends Panel_1{
    public ImageIcon image = new ImageIcon("/Users/borismartirosyan/Desktop/AUA/OOP/Group_project/Images/france.png");
    private String heading = "France";
    private String infoFilePath = "/Users/borismartirosyan/Desktop/AUA/OOP/Group_project/Information_center/france.txt";
    private String color = "#999999";
    private JLabel lbl = new JLabel();
    private JTextArea smallText = null;


    public ImageIcon getImage(){
        return image;
    }

    public String getHeading(){
        return heading;
    }

    public String getInfoFilePath(){
        return infoFilePath;
    }

    public String getColor(){
        return color;
    }

    public JLabel getLbl(){
        return lbl;
    }

    public JTextArea getSmallText(){
        return smallText;
    }



    public FranceSquare(){
        this.add(this.imageAndHeading());
        this.add(this.smallText());
        this.setPreferredSize(new Dimension(320, 350));
        this.setBackground(Color.decode(this.color));
    }

}
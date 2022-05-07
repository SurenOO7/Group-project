package com.military.frontend;

import javax.swing.*;
import java.awt.*;

public class TurkeySquare extends Panel_1{
    public ImageIcon image = new ImageIcon("/Users/borismartirosyan/Desktop/AUA/OOP/Group_project/Images/Turkey.png");
    private String heading = "Turkey";
    private String infoFilePath = "/Users/borismartirosyan/Desktop/AUA/OOP/Group_project/Information_center/turkey.txt";
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



    public TurkeySquare(){
        this.add(this.imageAndHeading());
        this.add(this.smallText());
        this.setPreferredSize(new Dimension(320, 350));
        this.setBackground(Color.decode(this.color));
    }

}

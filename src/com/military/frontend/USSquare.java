package com.military.frontend;

import javax.swing.*;
import java.awt.*;

public class USSquare extends Panel_1{
    public ImageIcon image = new ImageIcon("Group-project/Images/Screen Shot 2022-05-02 at 20.49.12.png");
    private String heading = "USA";
    private String infoFilePath = "Group-project/Information_center/us.txt";
    private String color = "#999999";
    private JLabel lbl = new JLabel();
    private JTextArea smallText = null;
    protected JButton btn = new JButton("Read more");
    
    
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



    public USSquare(){
        this.add(this.imageAndHeading());
        this.add(this.smallText());
        this.setPreferredSize(new Dimension(320, 350));
        this.setBackground(Color.decode(this.color));
        this.add(mutateBtn());
    }
    
}


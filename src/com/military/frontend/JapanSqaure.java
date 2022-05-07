package com.military.frontend;

import javax.swing.*;
import java.awt.*;

public class JapanSqaure extends Panel_1{
    public ImageIcon image = new ImageIcon("Group-project/Images/japan.png");
    private String heading = "Japan";
    private String infoFilePath = "Group-project/Information_center/japan.txt";
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



    public JapanSqaure(){
        this.add(this.imageAndHeading());
        this.add(this.smallText());
        this.setPreferredSize(new Dimension(320, 350));
        this.setBackground(Color.decode(this.color));
        this.add(mutateBtn());
    }

}

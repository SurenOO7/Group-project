package com.military.frontend;
import com.military.backend.*;

import javax.swing.*;
import java.awt.*;

public class RussiaSquare extends Panel_1{
    public ImageIcon image = new ImageIcon("Group-project/Images/thumbs_b_c_cfa67c264cd929f36ff3ba14d60797c4.jpeg");
    private String heading = "Russia";
    private String infoFilePath = "Group-project/Information_center/russia.txt";
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



    public RussiaSquare(){
        this.add(this.imageAndHeading());
        this.add(this.smallText());
        this.setPreferredSize(new Dimension(320, 350));
        this.setBackground(Color.decode(this.color));
        this.add(mutateBtn());
    }
}

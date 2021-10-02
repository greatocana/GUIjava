package com.company;
import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {
    MyFrame() {
        
        this.setTitle("My First GUI");
        this.setSize(420,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        //ImageIcon Image = new ImageIcon();
        //this.setIconImage(Image.getImage());
        this.getContentPane().setBackground(new Color(123,70,250));
    }
}

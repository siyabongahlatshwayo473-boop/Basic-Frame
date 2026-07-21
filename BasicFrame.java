package za.ac.tut.ui;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */   
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author kioskUser0
 */
public class BasicFrame extends JFrame
{
    public BasicFrame()
    {
        setSize(500, 300);
        setTitle("My First GUI");
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setForeground(Color.YELLOW);
        
        setVisible(true);
    }         
}

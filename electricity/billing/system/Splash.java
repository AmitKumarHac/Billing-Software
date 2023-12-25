/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author 91912
 */
public class Splash extends JFrame implements Runnable {
    Thread t;
    Splash(){
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2=i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        add(image);
        
        setVisible(true);
        
        int x=1;
        for(int i=2; i<600; i+=4,x+=1){
             setSize(i+x,i);
        setLocation(700-((i+x)/2),400-(i/2));
        
        try {
            Thread.sleep(5);
        } catch(Exception e){
            e.printStackTrace();
        }
        
        }
        t=new Thread(this);
        t.start();
        
        setVisible(true);
       
    }
    public void run(){
        try {
            Thread.sleep(7000);
            setVisible(false);
            
            //loginframe  
            new Login();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        new Splash();
    }
}

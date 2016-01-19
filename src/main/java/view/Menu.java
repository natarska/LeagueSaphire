package view;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame{
    private JLabel user;
    private JLabel pass;

    
    public Menu (){
        super ("League Saphire");
        ventana();
        setSize(900, 450);
        setLocationRelativeTo(null); // Situa la ventana en el centro
        setUndecorated(true);
        //getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        //initComponent();
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void ventana(){

    }
    
    public void initComponent(){
        Container main = new Container ();
        user = new JLabel("Usuario: ");
        pass = new JLabel ("Password: ");
        main.add(user);
        main.add(pass);
        pack();
    }
    
    public static void main(String[] args) {
        Menu menu = new Menu();
       
        
    }
}

/* LOOK AND FEEL
setDefaultLookAndFeelDecorated(true);//
//
getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
*/

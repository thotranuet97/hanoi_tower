
import java.awt.EventQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thotran
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                 
                Frame ex = new Frame();
                ex.setVisible(true);
            }
        });
    }
}

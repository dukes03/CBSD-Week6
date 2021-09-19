/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uae;

import java.util.Scanner;

/**
 *
 * @author Duke
 */
public class UAE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewBean bean = new NewBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        bean.addPropertyChangeListener(listener1);
        bean.addPropertyChangeListener(listener2);
        
        System.out.print("Enter Score ");
        Scanner inp = new Scanner(System.in);
        
        String type = inp.nextLine();
        while (!type.isEmpty()){
        bean.setSampleProperty(type);
        System.out.print("Enter Score ");
        inp = new Scanner(System.in);
        type = inp.nextLine();
        }
    }
    
}

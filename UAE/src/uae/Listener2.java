/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uae;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Duke
 */
public class Listener2 implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        System.out.println("live result: "+pce.getNewValue());
    }
    
}

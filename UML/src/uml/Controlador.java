/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kevin Garcia
 */
public class Controlador implements ActionListener {

    Vista v;


    Controlador(Vista v) {
        this.v = v;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(v.b1)){
            v.clases.add(v.claseArea);
        }
    }

}

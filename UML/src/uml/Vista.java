/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Kevin Garcia
 */
public class Vista extends JFrame {
    
    ArrayList<JTextArea> clases = new ArrayList<>();

    JButton b1 = new JButton("Agregar clases");
    JPanel p1 = new JPanel();
    JTextArea claseArea = new JTextArea();

    public Vista() {
        ventanaPrincipal();
        panelPrincipal();
    }

    public void ventanaPrincipal() {
        setTitle("UML");
        setSize(900, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        add(p1);
    }

    public void panelPrincipal() {
        b1.setSize(100, 50);
        b1.setLocation(340, 100);

        p1.add(b1);
        for(int i=0; i<clases.size(); i++){
            System.out.println(i);
            clases.get(i).setBounds(100, i*50, 50, 50);
            p1.add(clases.get(i));
        }
       
    }

    public void asignaOyentes(Controlador c) {
        b1.addActionListener((ActionListener) c);
    }

}

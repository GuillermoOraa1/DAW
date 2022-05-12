/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Ejercicio4;

import java.text.ParseException;
import java.util.HashMap;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author retaz
 */
public class Formateador extends InputVerifier{

    @Override
    public boolean verify(JComponent input) {
        if (input instanceof JFormattedTextField) {
            String texto = ((JFormattedTextField)input).getText();
            int valor=Integer.valueOf(texto.substring(0, 8));
            int resto=valor%23;
            HashMap <Integer,String> letrasDNI = new HashMap <Integer,String>();
            letrasDNI.put(0,"T");
            letrasDNI.put(1,"R");
            letrasDNI.put(2,"W");
            letrasDNI.put(3,"A");
            letrasDNI.put(4,"G");
            letrasDNI.put(5,"M");
            letrasDNI.put(6,"Y");
            letrasDNI.put(7,"F");
            letrasDNI.put(8,"P");
            letrasDNI.put(9,"D");
            letrasDNI.put(10,"X");
            letrasDNI.put(11,"B");
            letrasDNI.put(12,"N");
            letrasDNI.put(13,"J");
            letrasDNI.put(14,"Z");
            letrasDNI.put(15,"S");
            letrasDNI.put(16,"Q");
            letrasDNI.put(17,"V");
            letrasDNI.put(18,"H");
            letrasDNI.put(19,"L");
            letrasDNI.put(20,"C");
            letrasDNI.put(21,"K");
            letrasDNI.put(22,"E"); 
            if(texto.substring(9,10).toUpperCase().equals(letrasDNI.get(resto))){
                JOptionPane.showMessageDialog(input,texto,"Es un número de DNI valido",JOptionPane.INFORMATION_MESSAGE);
                return true;
            }else{
                JOptionPane.showMessageDialog(input,texto,"No es un número de DNI valido",JOptionPane.INFORMATION_MESSAGE);
                return false;
            } 
        }
        return false;
    }
}



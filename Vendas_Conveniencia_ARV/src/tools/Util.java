/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

//import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author Olimpo
 */
public class Util {
      public static void limpar(JComponent... componentes){
         for (int i = 0; i < componentes.length; i++) {
             if(componentes[i] instanceof JTextField){
          ((JTextField) componentes[1]).setText("");
             }else if(componentes[i] instanceof JComboBox){
                  ((JComboBox) componentes[1]).setSelectedIndex(-1);
             }
             
         }
      }
        public static void habilitar(boolean valor, JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
            
        }
      
}
}
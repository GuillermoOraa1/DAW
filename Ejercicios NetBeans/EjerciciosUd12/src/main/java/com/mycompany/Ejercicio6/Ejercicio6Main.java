/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Ejercicio6;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author DAW
 */
public class Ejercicio6Main extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio6Main
     */
    public Ejercicio6Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldResultado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\DAW\\Documents\\Ejercicios programacion\\Ejercicios NetBeans\\Ejercicios_Ud12\\sources\\images\\dado6.jpg").getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_DEFAULT)));
        jButton2 = new javax.swing.JButton();
        jButton2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\DAW\\Documents\\Ejercicios programacion\\Ejercicios NetBeans\\Ejercicios_Ud12\\sources\\images\\dado8.jpg").getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_DEFAULT)));
        jButton3 = new javax.swing.JButton();
        jButton3.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\DAW\\Documents\\Ejercicios programacion\\Ejercicios NetBeans\\Ejercicios_Ud12\\sources\\images\\dado10.jpg").getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_DEFAULT)));
        jButton4 = new javax.swing.JButton();

        jButton4.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\DAW\\Documents\\Ejercicios programacion\\Ejercicios NetBeans\\Ejercicios_Ud12\\sources\\images\\dado12.jpg").getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_DEFAULT)));
        jButton5 = new javax.swing.JButton();

        jButton5.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\DAW\\Documents\\Ejercicios programacion\\Ejercicios NetBeans\\Ejercicios_Ud12\\sources\\images\\dado20.jpg").getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_DEFAULT)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldResultado.setText("0");

        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.setMaximumSize(new java.awt.Dimension(339, 355));
        jButton1.setMinimumSize(new java.awt.Dimension(339, 355));
        jButton1.setPreferredSize(new java.awt.Dimension(339, 355));
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton1FocusLost(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton2FocusLost(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton3FocusLost(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton4FocusLost(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton5FocusLost(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int numero=new Random().nextInt((6-1))+1;
        jTextFieldResultado.setText(String.valueOf(numero));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int numero=new Random().nextInt((8-1))+1;
        jTextFieldResultado.setText(String.valueOf(numero));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int numero=new Random().nextInt((10-1))+1;
        jTextFieldResultado.setText(String.valueOf(numero));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int numero=new Random().nextInt((12-1))+1;
        jTextFieldResultado.setText(String.valueOf(numero));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int numero=new Random().nextInt((20-1))+1;
        jTextFieldResultado.setText(String.valueOf(numero));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
        // TODO add your handling code here:
        jButton1.setIcon(null);
        jButton1.setText("6");
    }//GEN-LAST:event_jButton1FocusGained

    private void jButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusLost
        // TODO add your handling code here:
       jButton1.setText(null);
       jButton1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\DAW\\Documents\\Ejercicios programacion\\Ejercicios NetBeans\\Ejercicios_Ud12\\sources\\images\\dado6.jpg").getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_DEFAULT)));

    }//GEN-LAST:event_jButton1FocusLost
 
    private void jButton3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton3FocusGained
        // TODO add your handling code here:
        jButton3.setIcon(null);
        jButton3.setText("10");
    }//GEN-LAST:event_jButton3FocusGained

    private void jButton5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton5FocusGained
        // TODO add your handling code here:
        jButton5.setIcon(null);
        jButton5.setText("20");
    }//GEN-LAST:event_jButton5FocusGained

    private void jButton5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton5FocusLost
        // TODO add your handling code here:
       jButton5.setText(null);
       jButton5.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\DAW\\Documents\\Ejercicios programacion\\Ejercicios NetBeans\\Ejercicios_Ud12\\sources\\images\\dado20.jpg").getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_DEFAULT)));

    }//GEN-LAST:event_jButton5FocusLost

    private void jButton3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton3FocusLost
        // TODO add your handling code here:
       jButton3.setText(null);
       jButton3.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\DAW\\Documents\\Ejercicios programacion\\Ejercicios NetBeans\\Ejercicios_Ud12\\sources\\images\\dado10.jpg").getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_DEFAULT)));        
    }//GEN-LAST:event_jButton3FocusLost

    private void jButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusGained
        // TODO add your handling code here:
        jButton2.setIcon(null);
        jButton2.setText("8");
    }//GEN-LAST:event_jButton2FocusGained

    private void jButton2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusLost
        // TODO add your handling code here:
       jButton2.setText(null);
       jButton2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\DAW\\Documents\\Ejercicios programacion\\Ejercicios NetBeans\\Ejercicios_Ud12\\sources\\images\\dado8.jpg").getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_DEFAULT)));        
    }//GEN-LAST:event_jButton2FocusLost

    private void jButton4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton4FocusGained
        // TODO add your handling code here:
        jButton4.setIcon(null);
        jButton4.setText("12");
    }//GEN-LAST:event_jButton4FocusGained

    private void jButton4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton4FocusLost
        // TODO add your handling code here:
       jButton4.setText(null);
       jButton4.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\DAW\\Documents\\Ejercicios programacion\\Ejercicios NetBeans\\Ejercicios_Ud12\\sources\\images\\dado12.jpg").getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_DEFAULT)));
  
    }//GEN-LAST:event_jButton4FocusLost
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio6Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio6Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JTextField jTextFieldResultado;
    // End of variables declaration//GEN-END:variables
}

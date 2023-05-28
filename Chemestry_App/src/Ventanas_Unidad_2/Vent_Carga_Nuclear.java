/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_Unidad_2;

import Unidad_1.DatoEntradaCheckedEx;
import Unidad_1.DatosDefinidosEx;
import Unidad_2.CargaNuclear;
import Ventanas.Vent_Main;
import Ventanas.Vent_Unidad_2;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Vent_Carga_Nuclear extends javax.swing.JFrame {

    /**
     * Creates new form Vent_Unidad_2
     */
    public Vent_Carga_Nuclear() {
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

        jLabel1 = new javax.swing.JLabel();
        Btn_Volver = new javax.swing.JButton();
        Calcular_Carga = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Input_z = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Input_Nn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Input_n = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Input_N = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Carga Nuclear Efectiva");

        Btn_Volver.setText("Volver");
        Btn_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_VolverMouseClicked(evt);
            }
        });

        Calcular_Carga.setText("Calcular Carga");
        Calcular_Carga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Calcular_CargaMouseClicked(evt);
            }
        });

        jLabel2.setText("Valor del número atómico:");

        Input_z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_zActionPerformed(evt);
            }
        });

        jLabel4.setText("Electrones de nivel superior:");

        Input_Nn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_NnActionPerformed(evt);
            }
        });

        jLabel5.setText("Electrones de nivel intermedio:");

        Input_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_nActionPerformed(evt);
            }
        });

        jLabel6.setText("Electrones restantes:");

        Input_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_NActionPerformed(evt);
            }
        });

        Resultado.setColumns(20);
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(Calcular_Carga)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Input_N, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Input_z, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(Input_n, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Input_Nn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Input_z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Input_N, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Input_Nn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Input_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Calcular_Carga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn_Volver)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_VolverMouseClicked
        // TODO add your handling code here:

        Vent_Unidad_2 app=new Vent_Unidad_2();

        app.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_VolverMouseClicked

    private void Input_zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_zActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_zActionPerformed

    private void Input_NnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_NnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_NnActionPerformed

    private void Input_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_nActionPerformed

    private void Input_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_NActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_NActionPerformed

    private void Calcular_CargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Calcular_CargaMouseClicked
        // TODO add your handling code here:

      
      String inputz=Input_z.getText();
      String inputNn=Input_Nn.getText();
      String inputn=Input_n.getText();
      String inputN=Input_N.getText();
      
      
      
        CargaNuclear cargaNuclear;
        try {
            cargaNuclear = new CargaNuclear(inputz, inputNn, inputn, inputN);
            
            double S = cargaNuclear.calcularEA();
            double ZE = cargaNuclear.calcularZE();
            
            
            
            Resultado.setText(
                    "El efecto de apantallamiento es: "
                    +S+"\nPor lo tanto, la carga nuclear efectiva del elemento es: " 
                    +ZE+"\n---------------------------\n"
                            +"Fórmulas:\n"
                            +"ZE = Z-S"
                            +"\nS = (0.35)N + (0.85)n + N");
    
        } catch (DatosDefinidosEx ex) {
            Resultado.setText(ex.getMessage());
        } catch (DatoEntradaCheckedEx ex) {
            Resultado.setText(ex.getMessage());
        }
        
    

//    System.out.println("El efecto de apantallamiento es: "+ S);
//    System.out.println("Por lo tanto, la carga nuclear efectiva del elemento es: " +ZE);
//    
//    System.out.println("\n---------------------------\n");
//    System.out.println("Fórmulas:");
//        System.out.println("ZE = Z-S"); // <---- Fórmula para la carga nuclear efectiva
//     System.out.println("S = (0.35)N + (0.85)n + N");
        
    }//GEN-LAST:event_Calcular_CargaMouseClicked

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
            java.util.logging.Logger.getLogger(Vent_Carga_Nuclear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vent_Carga_Nuclear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vent_Carga_Nuclear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vent_Carga_Nuclear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vent_Carga_Nuclear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Volver;
    private javax.swing.JButton Calcular_Carga;
    private javax.swing.JTextField Input_N;
    private javax.swing.JTextField Input_Nn;
    private javax.swing.JTextField Input_n;
    private javax.swing.JTextField Input_z;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
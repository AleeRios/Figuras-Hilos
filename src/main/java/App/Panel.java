/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Panel extends JFrame{

    public Panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        btnI = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        slrS = new javax.swing.JSlider();
        txtS = new javax.swing.JLabel();
        slrC = new javax.swing.JSlider();
        txtC = new javax.swing.JLabel();
        slrT = new javax.swing.JSlider();
        txtT = new javax.swing.JLabel();
        slrCi = new javax.swing.JSlider();
        txtCi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnl1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        btnI.setText("Iniciar");
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });

        btnL.setText("Limpiar");
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });

        slrS.setBackground(new java.awt.Color(153, 153, 153));
        slrS.setFont(new java.awt.Font("Segoe UI", 2, 9)); // NOI18N
        slrS.setMajorTickSpacing(10);
        slrS.setMaximum(50);
        slrS.setPaintLabels(true);
        slrS.setPaintTicks(true);
        slrS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtS.setText("Segundos");

        slrC.setBackground(new java.awt.Color(153, 153, 153));
        slrC.setFont(new java.awt.Font("Segoe UI", 2, 9)); // NOI18N
        slrC.setMajorTickSpacing(10);
        slrC.setMaximum(30);
        slrC.setPaintLabels(true);
        slrC.setPaintTicks(true);

        txtC.setText("Cuadrado");

        slrT.setBackground(new java.awt.Color(153, 153, 153));
        slrT.setFont(new java.awt.Font("Segoe UI", 2, 9)); // NOI18N
        slrT.setMajorTickSpacing(5);
        slrT.setMaximum(30);
        slrT.setMinimum(10);
        slrT.setPaintLabels(true);
        slrT.setPaintTicks(true);

        txtT.setText("Rectangulo");

        slrCi.setBackground(new java.awt.Color(153, 153, 153));
        slrCi.setFont(new java.awt.Font("Segoe UI", 2, 9)); // NOI18N
        slrCi.setMajorTickSpacing(10);
        slrCi.setMaximum(30);
        slrCi.setPaintLabels(true);
        slrCi.setPaintTicks(true);

        txtCi.setText("Circulo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(btnL))
                    .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCi)
                            .addComponent(txtC)
                            .addComponent(txtT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtS)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slrS, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(slrC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(slrCi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(slrT, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(slrS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(slrC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(slrT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(slrCi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        Thread cuadrado, rectangulo, circulo;
        slrS.setValueIsAdjusting(true);
        for(int i=0; i<50; i++){
            cuadrado = new Thread(new PintarCuadrado());
            rectangulo = new Thread(new PintarTriangulo());
            circulo = new Thread(new PintarCirculo());
            
            cuadrado.start();
            rectangulo.start();
            circulo.start();
            
            try {
                cuadrado.join();
                rectangulo.join();
                circulo.join();
                Thread.sleep((long)(slrS.getValue())*30);
            } catch (InterruptedException ex) {
                Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnIActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        // TODO add your handling code here:
        pnl1.repaint();
    }//GEN-LAST:event_btnLActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnL;
    private javax.swing.JPanel pnl1;
    private javax.swing.JSlider slrC;
    private javax.swing.JSlider slrCi;
    private javax.swing.JSlider slrS;
    private javax.swing.JSlider slrT;
    private javax.swing.JLabel txtC;
    private javax.swing.JLabel txtCi;
    private javax.swing.JLabel txtS;
    private javax.swing.JLabel txtT;
    // End of variables declaration//GEN-END:variables

class Cuadrado implements Dibujar{
    public Random r;
    public int n1, n2;
    
    public Cuadrado(){
        r = new Random();
        n1 = r.nextInt(300-1+1)+1;
        n2 = r.nextInt(220-1+1)+1;
    }
     
    
    public void pintar(Graphics g){
        //Panel p = new Panel(0);
        g.setColor(Color.RED);
        g.fillRect(n1, n2, slrC.getValue(),slrC.getValue());
    } 
}

class PintarCuadrado implements Runnable{
    public void run(){
        Graphics h = pnl1.getGraphics();
        Dibujar d = new Cuadrado();
        d.pintar(h);
    }
}

class Rectangulo implements Dibujar{
    public Random r;
    public int n1, n2;
    
    public Rectangulo(){
        r = new Random();
        n1 = r.nextInt(315-1+1)+1;
        n2 = r.nextInt(235-1+1)+1;
    }
    
    public void pintar(Graphics g){;
        g.setColor(Color.blue);
        g.fillRect(n1, n2, slrT.getValue()+5, slrT.getValue()-5);
    }
}

class PintarTriangulo implements Runnable{
    public void run(){
        Graphics h = pnl1.getGraphics();
        Dibujar d = new Rectangulo();
        d.pintar(h);
    }
}

class Circulo implements Dibujar{
    public Random r;
    public int n1, n2;
    
    public Circulo(){
        r = new Random();
        n1 = r.nextInt(315-1+1)+1;
        n2 = r.nextInt(235-1+1)+1;
    }
    
    public void pintar(Graphics g){
        g.setColor(Color.green);
        g.fillOval(n1, n2, slrCi.getValue(), slrCi.getValue());
    }
}

class PintarCirculo implements Runnable{
    public void run(){
        Graphics h = pnl1.getGraphics();
        Dibujar d = new Circulo();
        d.pintar(h); 
    }
}
}



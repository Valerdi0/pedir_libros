/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import java.lang.Float;
import java.net.*;

/**
 *
 * @author Daniel
 */
public class Window extends javax.swing.JFrame {
    
    public RelojHilo relojHilo;
    public Socket u1, u2, u3, u4;
    public boolean e1 = false,e2 = false,e3 = false,e4 = false;
    Canvas canvas;

    /**
     * Creates new form MainWindow
     */
    public Window() {
        canvas = new Canvas("libro_default.png");
        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );  
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

        jPanel1 = new javax.swing.JPanel();
        LabelReloj1 = new javax.swing.JLabel();
        LabelReloj3 = new javax.swing.JLabel();
        LabelReloj2 = new javax.swing.JLabel();
        LabelReloj4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFMinuto = new javax.swing.JTextField();
        TFHora = new javax.swing.JTextField();
        LabelDosPuntos = new javax.swing.JLabel();
        BReloj1 = new javax.swing.JButton();
        BReloj2 = new javax.swing.JButton();
        BReloj3 = new javax.swing.JButton();
        BReloj4 = new javax.swing.JButton();
        TFSegundo = new javax.swing.JTextField();
        LabelHora = new javax.swing.JLabel();
        LabelSegundo = new javax.swing.JLabel();
        BSegReloj1 = new javax.swing.JButton();
        BSegReloj2 = new javax.swing.JButton();
        BSegReloj3 = new javax.swing.JButton();
        BSegReloj4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        enviar1 = new javax.swing.JButton();
        enviar2 = new javax.swing.JButton();
        enviar3 = new javax.swing.JButton();
        enviar4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LabelReloj1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelReloj1.setText("12:00:00");

        LabelReloj3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelReloj3.setText("12:00:00");

        LabelReloj2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelReloj2.setText("12:00:00");

        LabelReloj4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelReloj4.setText("12:00:00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Reloj 2");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Reloj 3");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Reloj 1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Reloj 4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel3)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LabelReloj1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LabelReloj3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelReloj4)
                            .addComponent(LabelReloj2))))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelReloj1)
                    .addComponent(LabelReloj2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelReloj3)
                    .addComponent(LabelReloj4))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        TFMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFMinutoActionPerformed(evt);
            }
        });

        LabelDosPuntos.setText(":");
        LabelDosPuntos.setMinimumSize(new java.awt.Dimension(4, 4));

        BReloj1.setText("modificar R1");
        BReloj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReloj1ActionPerformed(evt);
            }
        });

        BReloj2.setText("modificar R2");
        BReloj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReloj2ActionPerformed(evt);
            }
        });

        BReloj3.setText("modificar R3");
        BReloj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReloj3ActionPerformed(evt);
            }
        });

        BReloj4.setText("modificar R4");
        BReloj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReloj4ActionPerformed(evt);
            }
        });

        TFSegundo.setForeground(new java.awt.Color(153, 153, 153));
        TFSegundo.setText("ejemplo 0.5");
        TFSegundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TFSegundoMousePressed(evt);
            }
        });
        TFSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSegundoActionPerformed(evt);
            }
        });

        LabelHora.setText("Hora");

        LabelSegundo.setText("cambio del segundero");

        BSegReloj1.setText("Reloj 1");
        BSegReloj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSegReloj1ActionPerformed(evt);
            }
        });

        BSegReloj2.setText("Reloj 2");
        BSegReloj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSegReloj2ActionPerformed(evt);
            }
        });

        BSegReloj3.setText("Reloj 3");
        BSegReloj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSegReloj3ActionPerformed(evt);
            }
        });

        BSegReloj4.setText("Reloj 4");
        BSegReloj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSegReloj4ActionPerformed(evt);
            }
        });

        jLabel5.setText("(en segundos)");

        enviar1.setText("Enviar 1");
        enviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar1ActionPerformed(evt);
            }
        });

        enviar2.setText("Enviar 2");

        enviar3.setText("Enviar 3");

        enviar4.setText("Enviar 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TFHora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LabelDosPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TFMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(LabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BReloj1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BReloj2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BReloj3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BReloj4)))
                        .addGap(16, 16, 16)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enviar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviar2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enviar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviar4)))
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BSegReloj3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BSegReloj4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BSegReloj1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BSegReloj2)))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelSegundo)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TFSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TFSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelHora)
                            .addComponent(LabelSegundo))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelDosPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BReloj1)
                            .addComponent(BReloj2)
                            .addComponent(BSegReloj1)
                            .addComponent(BSegReloj2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BReloj3)
                            .addComponent(BReloj4)
                            .addComponent(BSegReloj3)
                            .addComponent(BSegReloj4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enviar1)
                            .addComponent(enviar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enviar3)
                            .addComponent(enviar4))))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BReloj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReloj1ActionPerformed
        //Se obtiene el contenido de las cajas de texto para actualizar los relojes
        String H=this.TFHora.getText();
        String M=this.TFMinuto.getText();
        
         //Se verifica que no esten vacias
        if(H.equals("")||M.equals(""))
            JOptionPane.showMessageDialog(null, "Tienes que ingresar datos");
        else{
           //Se verifica que las horas no sean mayores de 24 y los minutos de 60
           	int x=Integer.parseInt(H);
           	int y=Integer.parseInt(M);
       		if((x>=0 && x<=24)&&(y>=0 && y<=59)){  
                       this.relojHilo.reloj1.setHora(x);
                       this.relojHilo.reloj1.setMinuto(y);
                       this.TFHora.setText("");
                       this.TFMinuto.setText("");
		    }
       		else
		    JOptionPane.showMessageDialog(null, "Los valores no son validos");
       }
        //System.out.println("Boton reloj1: " + this.TFHora.getText() + ":" + this.TFMinuto.getText());
    }//GEN-LAST:event_BReloj1ActionPerformed

    private void BReloj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReloj2ActionPerformed
        //Se obtiene el contenido de las cajas de texto para actualizar los relojes
        String H=this.TFHora.getText();
        String M=this.TFMinuto.getText();
        
         //Se verifica que no esten vacias
        if(H.equals("")||M.equals(""))
            JOptionPane.showMessageDialog(null, "Tienes que ingresar datos");
        else{
           //Se verifica que las horas no sean mayores de 24 y los minutos de 60
           	int x=Integer.parseInt(H);
           	int y=Integer.parseInt(M);
       		if((x>=0 && x<=24)&&(y>=0 && y<=59)){  
		       this.relojHilo.reloj2.setHora(x);
                       this.relojHilo.reloj2.setMinuto(y);
                       this.TFHora.setText("");
                       this.TFMinuto.setText("");
		    }
       		else
		    JOptionPane.showMessageDialog(null, "Los valores no son validos");
        }
        //System.out.println("Boton reloj2: " + this.TFHora.getText() + ":" + this.TFMinuto.getText());
    }//GEN-LAST:event_BReloj2ActionPerformed

    private void BReloj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReloj3ActionPerformed
        //Se obtiene el contenido de las cajas de texto para actualizar los relojes
        String H=this.TFHora.getText();
        String M=this.TFMinuto.getText();
        
         //Se verifica que no esten vacias
        if(H.equals("")||M.equals(""))
            JOptionPane.showMessageDialog(null, "Tienes que ingresar datos");
        else{
           //Se verifica que las horas no sean mayores de 24 y los minutos de 60
           	int x=Integer.parseInt(H);
           	int y=Integer.parseInt(M);
       		if((x>=0 && x<=24)&&(y>=0 && y<=59)){  
		       this.relojHilo.reloj3.setHora(x);
                       this.relojHilo.reloj3.setMinuto(y);
                       this.TFHora.setText("");
                       this.TFMinuto.setText("");
		    }
       		else
		    JOptionPane.showMessageDialog(null, "Los valores no son validos");
        }
        //System.out.println("Boton reloj3: " + this.TFHora.getText() + ":" + this.TFMinuto.getText());
    }//GEN-LAST:event_BReloj3ActionPerformed

    private void BReloj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReloj4ActionPerformed
        //Se obtiene el contenido de las cajas de texto para actualizar los relojes
        String H=this.TFHora.getText();
        String M=this.TFMinuto.getText();
        
         //Se verifica que no esten vacias
        if(H.equals("")||M.equals(""))
            JOptionPane.showMessageDialog(null, "Tienes que ingresar datos");
        else{
           //Se verifica que las horas no sean mayores de 24 y los minutos de 60
           	int x=Integer.parseInt(H);
           	int y=Integer.parseInt(M);
       		if((x>=0 && x<=24)&&(y>=0 && y<=59)){  
		       this.relojHilo.reloj4.setHora(x);
                       this.relojHilo.reloj4.setMinuto(y);
		    }
       		else
		    JOptionPane.showMessageDialog(null, "Los valores no son validos");
        }
        //System.out.println("Boton reloj4: " + this.TFHora.getText() + ":" + this.TFMinuto.getText());
    }//GEN-LAST:event_BReloj4ActionPerformed

    private void BSegReloj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSegReloj1ActionPerformed
        //System.out.println("Boton seg 1: " + this.TFSegundo.getText());
        String seg=this.TFSegundo.getText();        
        
        if(seg.equals(""))
            JOptionPane.showMessageDialog(null, "Tienes quw ingresar datos");
        else{
            float x=Float.parseFloat(seg);
                if((x>=0)){  
                this.relojHilo.reloj1.setVelocidad((int)(x*1000));
                }
                else
                    JOptionPane.showMessageDialog(null, "Los valores no son validos");
       }
    }//GEN-LAST:event_BSegReloj1ActionPerformed

    private void BSegReloj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSegReloj2ActionPerformed
        //System.out.println("Boton seg 2: " + this.TFSegundo.getText());
        String seg=this.TFSegundo.getText();        
        
        if(seg.equals(""))
            JOptionPane.showMessageDialog(null, "Tienes quw ingresar datos");
        else{
            float x=Float.parseFloat(seg);
                if((x>=0)){  
                this.relojHilo.reloj2.setVelocidad((int)(x*1000));
                }
                else
                    JOptionPane.showMessageDialog(null, "Los valores no son validos");
       }
    }//GEN-LAST:event_BSegReloj2ActionPerformed

    private void BSegReloj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSegReloj3ActionPerformed
        //System.out.println("Boton seg 3: " + this.TFSegundo.getText());
        String seg=this.TFSegundo.getText();        
        
        if(seg.equals(""))
            JOptionPane.showMessageDialog(null, "Tienes quw ingresar datos");
        else{
            float x=Float.parseFloat(seg);
                if((x>=0)){  
                this.relojHilo.reloj3.setVelocidad((int)(x*1000));
                }
                else
                    JOptionPane.showMessageDialog(null, "Los valores no son validos");
       }
    }//GEN-LAST:event_BSegReloj3ActionPerformed

    private void BSegReloj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSegReloj4ActionPerformed
        //System.out.println("Boton seg 4: " + this.TFSegundo.getText());
        String seg=this.TFSegundo.getText();        
        
        if(seg.equals(""))
            JOptionPane.showMessageDialog(null, "Tienes que ingresar datos");
        else{
            float x=Float.parseFloat(seg);
                if((x>=0)){  
                this.relojHilo.reloj4.setVelocidad((int)(x*1000));
                }
                else
                    JOptionPane.showMessageDialog(null, "Los valores no son validos");
       }
    }//GEN-LAST:event_BSegReloj4ActionPerformed

    private void TFSegundoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFSegundoMousePressed
        // TODO add your handling code here:
        this.TFSegundo.setText("");
        this.TFSegundo.setForeground(Color.BLACK);
    }//GEN-LAST:event_TFSegundoMousePressed

    private void TFSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSegundoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSegundoActionPerformed

    private void enviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar1ActionPerformed
        System.out.println(this.e1);
        System.out.println("boton");
        this.e1 = true;  
        System.out.println(this.e1);
    }//GEN-LAST:event_enviar1ActionPerformed

    private void TFMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFMinutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFMinutoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BReloj1;
    private javax.swing.JButton BReloj2;
    private javax.swing.JButton BReloj3;
    private javax.swing.JButton BReloj4;
    private javax.swing.JButton BSegReloj1;
    private javax.swing.JButton BSegReloj2;
    private javax.swing.JButton BSegReloj3;
    private javax.swing.JButton BSegReloj4;
    private javax.swing.JLabel LabelDosPuntos;
    private javax.swing.JLabel LabelHora;
    public javax.swing.JLabel LabelReloj1;
    public javax.swing.JLabel LabelReloj2;
    public javax.swing.JLabel LabelReloj3;
    public javax.swing.JLabel LabelReloj4;
    private javax.swing.JLabel LabelSegundo;
    private javax.swing.JTextField TFHora;
    private javax.swing.JTextField TFMinuto;
    private javax.swing.JTextField TFSegundo;
    private javax.swing.JButton enviar1;
    private javax.swing.JButton enviar2;
    private javax.swing.JButton enviar3;
    private javax.swing.JButton enviar4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

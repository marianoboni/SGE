/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JMainViewer.java
 *
 * Created on 26/05/2012, 15:15:39
 */
package sge.vista;

import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author Propietario
 */
public class JMainViewer extends javax.swing.JFrame {
    private JMainPresenter presenter;
    /** Creates new form JMainViewer */
    public JMainViewer() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        try{
        presenter = new JMainPresenter(this);
        }catch(Exception e){
            Icon Icon = null;
            JOptionPane.showMessageDialog(this, e.toString(), "Envios", JOptionPane.ERROR_MESSAGE,   Icon);
            System.exit(0);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEscritorio = new javax.swing.JDesktopPane();
        confEnvio = new javax.swing.JButton();
        generarEnvio = new javax.swing.JButton();
        lanRep = new javax.swing.JButton();
        regDespacho = new javax.swing.JButton();
        impEtiq = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        subMnuSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        subMnuGenerarEnvío = new javax.swing.JMenuItem();
        subMnuImprimirEtiquetas = new javax.swing.JMenuItem();
        subMnuRegistroSalida = new javax.swing.JMenuItem();
        subMnuConfirmacionEtiquetas = new javax.swing.JMenuItem();
        mnuCliente = new javax.swing.JMenu();
        subMnuAlta = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        subMnuBaja = new javax.swing.JMenuItem();
        mnuTransporte = new javax.swing.JMenu();
        subMnuAltaT = new javax.swing.JMenuItem();
        subMnuModifT = new javax.swing.JMenuItem();
        subMnuBajaTra = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        subMnuLanzarRpt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEscritorio.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.background"));

        confEnvio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confEnvio.setForeground(new java.awt.Color(204, 204, 255));
        confEnvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/vista/Icon/OOCL4.png"))); // NOI18N
        confEnvio.setMnemonic(KeyEvent.VK_F4);
        confEnvio.setText("  Confirmación Envío");
        confEnvio.setContentAreaFilled(false);
        confEnvio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        confEnvio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        confEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confEnvioActionPerformed(evt);
            }
        });
        confEnvio.setBounds(60, 320, 270, 90);
        panelEscritorio.add(confEnvio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        generarEnvio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        generarEnvio.setForeground(new java.awt.Color(204, 204, 255));
        generarEnvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/vista/Icon/box1.png"))); // NOI18N
        generarEnvio.setMnemonic(KeyEvent.VK_F1);
        generarEnvio.setText("  Generar Envío");
        generarEnvio.setContentAreaFilled(false);
        generarEnvio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        generarEnvio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        generarEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarEnvioActionPerformed(evt);
            }
        });
        generarEnvio.setBounds(60, 60, 250, 90);
        panelEscritorio.add(generarEnvio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lanRep.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lanRep.setForeground(new java.awt.Color(204, 204, 255));
        lanRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/vista/Icon/report.png"))); // NOI18N
        lanRep.setMnemonic(KeyEvent.VK_F5);
        lanRep.setText("   Reportes");
        lanRep.setContentAreaFilled(false);
        lanRep.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lanRep.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lanRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanRepActionPerformed(evt);
            }
        });
        lanRep.setBounds(540, 190, 250, 90);
        panelEscritorio.add(lanRep, javax.swing.JLayeredPane.DEFAULT_LAYER);

        regDespacho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regDespacho.setForeground(new java.awt.Color(204, 204, 255));
        regDespacho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/vista/Icon/cargo1.png"))); // NOI18N
        regDespacho.setMnemonic(KeyEvent.VK_F3);
        regDespacho.setText("  Registro de Despacho");
        regDespacho.setContentAreaFilled(false);
        regDespacho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        regDespacho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        regDespacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regDespachoActionPerformed(evt);
            }
        });
        regDespacho.setBounds(60, 190, 270, 90);
        panelEscritorio.add(regDespacho, javax.swing.JLayeredPane.DEFAULT_LAYER);

        impEtiq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        impEtiq.setForeground(new java.awt.Color(204, 204, 255));
        impEtiq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sge/vista/Icon/disk9.png"))); // NOI18N
        impEtiq.setMnemonic(KeyEvent.VK_F2);
        impEtiq.setText("  Imprimir Etiquetas");
        impEtiq.setContentAreaFilled(false);
        impEtiq.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        impEtiq.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        impEtiq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impEtiqActionPerformed(evt);
            }
        });
        impEtiq.setBounds(540, 60, 250, 90);
        panelEscritorio.add(impEtiq, javax.swing.JLayeredPane.DEFAULT_LAYER);

        mnuArchivo.setText("Archivo");
        mnuArchivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        subMnuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        subMnuSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subMnuSalir.setText("Salir");
        subMnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(subMnuSalir);

        jMenuBar1.add(mnuArchivo);

        jMenu3.setText("Envíos");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        subMnuGenerarEnvío.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        subMnuGenerarEnvío.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subMnuGenerarEnvío.setText("Generar envío");
        subMnuGenerarEnvío.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuGenerarEnvíoActionPerformed(evt);
            }
        });
        jMenu3.add(subMnuGenerarEnvío);

        subMnuImprimirEtiquetas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        subMnuImprimirEtiquetas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subMnuImprimirEtiquetas.setText("Imprimir etiquetas");
        subMnuImprimirEtiquetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuImprimirEtiquetasActionPerformed(evt);
            }
        });
        jMenu3.add(subMnuImprimirEtiquetas);

        subMnuRegistroSalida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        subMnuRegistroSalida.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subMnuRegistroSalida.setText("Registro de Despacho");
        subMnuRegistroSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuRegistroSalidaActionPerformed(evt);
            }
        });
        jMenu3.add(subMnuRegistroSalida);

        subMnuConfirmacionEtiquetas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        subMnuConfirmacionEtiquetas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subMnuConfirmacionEtiquetas.setText("Confirmación Envío");
        subMnuConfirmacionEtiquetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuConfirmacionEtiquetasActionPerformed(evt);
            }
        });
        jMenu3.add(subMnuConfirmacionEtiquetas);

        jMenuBar1.add(jMenu3);

        mnuCliente.setText("Clientes");
        mnuCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        subMnuAlta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subMnuAlta.setText("Alta Cliente");
        subMnuAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuAltaActionPerformed(evt);
            }
        });
        mnuCliente.add(subMnuAlta);

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setText("Modificar Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuCliente.add(jMenuItem1);

        subMnuBaja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subMnuBaja.setText("Borrar Cliente");
        subMnuBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuBajaActionPerformed(evt);
            }
        });
        mnuCliente.add(subMnuBaja);

        jMenuBar1.add(mnuCliente);

        mnuTransporte.setText("Transporte");
        mnuTransporte.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        subMnuAltaT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subMnuAltaT.setText("Alta Transporte");
        subMnuAltaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuAltaTActionPerformed(evt);
            }
        });
        mnuTransporte.add(subMnuAltaT);

        subMnuModifT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subMnuModifT.setText("Modificar Transporte ");
        subMnuModifT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuModifTActionPerformed(evt);
            }
        });
        mnuTransporte.add(subMnuModifT);

        subMnuBajaTra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        subMnuBajaTra.setText("Borrar Transporte");
        subMnuBajaTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuBajaTraActionPerformed(evt);
            }
        });
        mnuTransporte.add(subMnuBajaTra);

        jMenuBar1.add(mnuTransporte);

        mnuReportes.setText("Reportes");
        mnuReportes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        subMnuLanzarRpt.setText("Lanzar reportes");
        subMnuLanzarRpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnuLanzarRptActionPerformed(evt);
            }
        });
        mnuReportes.add(subMnuLanzarRpt);

        jMenuBar1.add(mnuReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMnuGenerarEnvíoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuGenerarEnvíoActionPerformed
        // TODO add your handling code here:
        
        this.presenter.getGenerarEnvioHandler().stateChanged(new ChangeEvent(this));
    }//GEN-LAST:event_subMnuGenerarEnvíoActionPerformed

    private void subMnuImprimirEtiquetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuImprimirEtiquetasActionPerformed
        // TODO add your handling code here:
        this.presenter.getImprimirEtiquetasHanlder().stateChanged(new ChangeEvent(this));
    }//GEN-LAST:event_subMnuImprimirEtiquetasActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void subMnuRegistroSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuRegistroSalidaActionPerformed
        // TODO add your handling code here:
        this.presenter.getSalidaEnvioHandler().stateChanged(new ChangeEvent(this));
    }//GEN-LAST:event_subMnuRegistroSalidaActionPerformed

    private void subMnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuSalirActionPerformed
        // TODO add your handling code here:
        System.exit( 0 ); 
    }//GEN-LAST:event_subMnuSalirActionPerformed

    private void subMnuAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuAltaActionPerformed
        // TODO add your handling code here:
        this.presenter.getAltaClienteHandler().stateChanged(new ChangeEvent(this));
    }//GEN-LAST:event_subMnuAltaActionPerformed

    private void subMnuConfirmacionEtiquetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuConfirmacionEtiquetasActionPerformed
        // TODO add your handling code here:
        this.presenter.getConfirmacionEnvioHandler().stateChanged(new ChangeEvent(this));
    }//GEN-LAST:event_subMnuConfirmacionEtiquetasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.presenter.getModifClienteHandler().stateChanged(new ChangeEvent(this));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void subMnuBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuBajaActionPerformed
        // TODO add your handling code here:
        this.presenter.getBajaClienteHandler().stateChanged(new ChangeEvent(this));
    }//GEN-LAST:event_subMnuBajaActionPerformed

    private void subMnuAltaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuAltaTActionPerformed
        // TODO add your handling code here:
        this.presenter.getAltaTransporteHandler().stateChanged(new ChangeEvent(this));
    }//GEN-LAST:event_subMnuAltaTActionPerformed

    private void subMnuModifTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuModifTActionPerformed
        // TODO add your handling code here:
        this.presenter.getModifTransporteHandler().stateChanged(new ChangeEvent(this));
    }//GEN-LAST:event_subMnuModifTActionPerformed

    private void subMnuBajaTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuBajaTraActionPerformed
        // TODO add your handling code here:
        this.presenter.getBajaTransporteHandler().stateChanged(new ChangeEvent(this));
    }//GEN-LAST:event_subMnuBajaTraActionPerformed

    private void confEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confEnvioActionPerformed
        // TODO add your handling code here:
        this.subMnuConfirmacionEtiquetasActionPerformed(evt);
    }//GEN-LAST:event_confEnvioActionPerformed

    private void generarEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarEnvioActionPerformed
        // TODO add your handling code here:
        this.subMnuGenerarEnvíoActionPerformed(evt);
    }//GEN-LAST:event_generarEnvioActionPerformed

    private void lanRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanRepActionPerformed
        // TODO add your handling code here:
        this.subMnuLanzarRptActionPerformed(evt);
    }//GEN-LAST:event_lanRepActionPerformed

    private void regDespachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regDespachoActionPerformed
        // TODO add your handling code here:
        this.subMnuRegistroSalidaActionPerformed(evt);
    }//GEN-LAST:event_regDespachoActionPerformed

    private void subMnuLanzarRptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnuLanzarRptActionPerformed
        // TODO add your handling code here:
        this.presenter.getLanzarReportesHandler().stateChanged(new ChangeEvent(this));
    }//GEN-LAST:event_subMnuLanzarRptActionPerformed

    private void impEtiqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impEtiqActionPerformed
        // TODO add your handling code here:
        subMnuImprimirEtiquetasActionPerformed(evt);
    }//GEN-LAST:event_impEtiqActionPerformed

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
            java.util.logging.Logger.getLogger(JMainViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMainViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMainViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMainViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JMainViewer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confEnvio;
    private javax.swing.JButton generarEnvio;
    private javax.swing.JButton impEtiq;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton lanRep;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuCliente;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenu mnuTransporte;
    private javax.swing.JDesktopPane panelEscritorio;
    private javax.swing.JButton regDespacho;
    private javax.swing.JMenuItem subMnuAlta;
    private javax.swing.JMenuItem subMnuAltaT;
    private javax.swing.JMenuItem subMnuBaja;
    private javax.swing.JMenuItem subMnuBajaTra;
    private javax.swing.JMenuItem subMnuConfirmacionEtiquetas;
    private javax.swing.JMenuItem subMnuGenerarEnvío;
    private javax.swing.JMenuItem subMnuImprimirEtiquetas;
    private javax.swing.JMenuItem subMnuLanzarRpt;
    private javax.swing.JMenuItem subMnuModifT;
    private javax.swing.JMenuItem subMnuRegistroSalida;
    private javax.swing.JMenuItem subMnuSalir;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the panelEscritorio
     */
    public javax.swing.JDesktopPane getPanelEscritorio() {
        return panelEscritorio;
    }
}

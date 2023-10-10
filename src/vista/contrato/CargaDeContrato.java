/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.contrato;

import entidades.Inmueble;
import entidades.Inquilino;

/**
 *
 * @author Usuario
 */
public class CargaDeContrato extends javax.swing.JInternalFrame {

    /**
     * Creates new form CargaDeContrato
     */
    public CargaDeContrato() {
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

        jLContrato = new javax.swing.JLabel();
        jLIdContrato = new javax.swing.JLabel();
        jLInmueble = new javax.swing.JLabel();
        jLInquilino = new javax.swing.JLabel();
        jLFechaIni = new javax.swing.JLabel();
        jBotonCrear = new javax.swing.JButton();
        jBotonModificar = new javax.swing.JButton();
        jBotonEliminar = new javax.swing.JButton();
        jTFidContrato = new javax.swing.JTextField();
        jBotonBuscar = new javax.swing.JButton();
        jTFPrecioAlquiler = new javax.swing.JTextField();
        jLPrecio = new javax.swing.JLabel();
        jCheckRenovado = new javax.swing.JCheckBox();
        jLFechaFin = new javax.swing.JLabel();
        jBotonSalir = new javax.swing.JButton();
        jCheckVigente = new javax.swing.JCheckBox();
        jDateFechaFin = new com.toedter.calendar.JDateChooser();
        jDateFechaInicio = new com.toedter.calendar.JDateChooser();
        jComboInmueble = new javax.swing.JComboBox<>();
        jComboInquilino = new javax.swing.JComboBox<>();

        jLContrato.setText("Contratos");

        jLIdContrato.setText("ID Contrato");

        jLInmueble.setText("Inmueble");

        jLInquilino.setText("Inquilino");

        jLFechaIni.setText("Fecha de Inicio");

        jBotonCrear.setText("Crear");

        jBotonModificar.setText("Modificar");

        jBotonEliminar.setText("Eliminar");
        jBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonEliminarActionPerformed(evt);
            }
        });

        jBotonBuscar.setText("Buscar");

        jLPrecio.setText("Precio Alquiler");

        jCheckRenovado.setText("Renovado");

        jLFechaFin.setText("Fecha de Finalización");

        jBotonSalir.setText("Salir");
        jBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSalirActionPerformed(evt);
            }
        });

        jCheckVigente.setText("Vigente");
        jCheckVigente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckVigenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBotonBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBotonCrear)
                                        .addGap(272, 272, 272))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLPrecio)
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCheckVigente)
                                                    .addComponent(jTFPrecioAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBotonModificar)
                                                .addGap(99, 99, 99)))
                                        .addGap(53, 53, 53)))
                                .addComponent(jBotonSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLInmueble)
                                        .addComponent(jLIdContrato))
                                    .addGap(68, 68, 68)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTFidContrato, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(jComboInmueble, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLFechaFin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDateFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLInquilino)
                                        .addComponent(jLFechaIni))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jDateFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                        .addComponent(jComboInquilino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBotonEliminar)
                                    .addComponent(jCheckRenovado))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFidContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIdContrato)
                    .addComponent(jBotonBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLInmueble)
                    .addComponent(jComboInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLInquilino)
                    .addComponent(jComboInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFechaIni))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFechaFin)
                    .addComponent(jDateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPrecio)
                    .addComponent(jTFPrecioAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckRenovado)
                    .addComponent(jCheckVigente))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonEliminar)
                    .addComponent(jBotonModificar)
                    .addComponent(jBotonCrear)
                    .addComponent(jBotonSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBotonEliminarActionPerformed

    private void jBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBotonSalirActionPerformed

    private void jCheckVigenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckVigenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckVigenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonBuscar;
    private javax.swing.JButton jBotonCrear;
    private javax.swing.JButton jBotonEliminar;
    private javax.swing.JButton jBotonModificar;
    private javax.swing.JButton jBotonSalir;
    private javax.swing.JCheckBox jCheckRenovado;
    private javax.swing.JCheckBox jCheckVigente;
    private javax.swing.JComboBox<Inmueble> jComboInmueble;
    private javax.swing.JComboBox<Inquilino> jComboInquilino;
    private com.toedter.calendar.JDateChooser jDateFechaFin;
    private com.toedter.calendar.JDateChooser jDateFechaInicio;
    private javax.swing.JLabel jLContrato;
    private javax.swing.JLabel jLFechaFin;
    private javax.swing.JLabel jLFechaIni;
    private javax.swing.JLabel jLIdContrato;
    private javax.swing.JLabel jLInmueble;
    private javax.swing.JLabel jLInquilino;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JTextField jTFPrecioAlquiler;
    private javax.swing.JTextField jTFidContrato;
    // End of variables declaration//GEN-END:variables
}

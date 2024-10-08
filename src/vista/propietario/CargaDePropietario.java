package vista.propietario;

import accesoADatos.PropietarioData;
import entidades.Propietario;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vista.menuPrincipal.MenuPrincipal;

public class CargaDePropietario extends javax.swing.JInternalFrame {

    private MenuPrincipal menuPrincipal;
    private int aviso = 0;
    private FondoPanel fondo = new FondoPanel();

    public CargaDePropietario(MenuPrincipal menuPrincipal) {
        this.setContentPane(fondo);
        initComponents();
        this.menuPrincipal = menuPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonEliminar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoDomicilio = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoMail = new javax.swing.JTextField();
        campoId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        campoDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        checkEstado = new javax.swing.JCheckBox();
        botonSalir = new javax.swing.JButton();

        setTitle("Datos Propietario");

        jPanel1.setOpaque(false);

        BotonEliminar.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconEliminar.png"))); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconGuardar.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonModificar.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconModificar.png"))); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.setEnabled(false);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonNuevo.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconNuevo.png"))); // NOI18N
        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        campoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNombreKeyTyped(evt);
            }
        });

        campoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoApellidoKeyTyped(evt);
            }
        });

        campoTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTelefonoKeyTyped(evt);
            }
        });

        campoId.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Dni");

        botonBuscar.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconBuscar.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("ID");

        campoDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoDniKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 110, 182));
        jLabel2.setText("Carga de propietarios");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Domicilio");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Mail");

        checkEstado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        checkEstado.setText("Estado");

        botonSalir.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSalir.png"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(botonNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonModificar)
                .addGap(18, 18, 18)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkEstado)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(campoNombre)
                                                .addComponent(campoApellido)
                                                .addComponent(campoDomicilio)
                                                .addComponent(campoTelefono)
                                                .addComponent(campoMail, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(campoDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(botonBuscar)))))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(179, 179, 179))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(botonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificar)
                    .addComponent(botonGuardar)
                    .addComponent(BotonEliminar)
                    .addComponent(botonNuevo)
                    .addComponent(botonSalir))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
        menuPrincipal.mostrarItemsEscritorio();
    }//GEN-LAST:event_botonSalirActionPerformed

    public static boolean Validar(String datos) {
        return datos.matches("[a-zA-Z ]*");
    }

    //====== BOTON GUARDAR ======//
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        if (campoNombre.getText().isEmpty() && campoApellido.getText().isEmpty()
                && campoDni.getText().isEmpty() && campoDomicilio.getText().isEmpty()
                && campoTelefono.getText().isEmpty() && campoMail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ingrese los datos del propietario a guardar");
        } else {
            try {
                int dni = Integer.parseInt(campoDni.getText());
                String nombre = campoNombre.getText();
                String apellido = campoApellido.getText();
                String domicilio = campoDomicilio.getText();
                String telefono = campoTelefono.getText();
                String mail = campoMail.getText();
                boolean estado = checkEstado.isSelected();
                int limitador = 0;

                if (!validarDni(dni)) {
                    JOptionPane.showMessageDialog(this, "Ya existe un propietario con ese dni");
                } else {
                    if (CargaDePropietario.Validar(nombre)) {
                        nombre = campoNombre.getText();
                    } else {
                        JOptionPane.showMessageDialog(this, "Solo letras en el campo nombre");
                        limitador++;
                    }
                    if (CargaDePropietario.Validar(apellido)) {
                        apellido = campoApellido.getText(); //
                    } else {
                        JOptionPane.showMessageDialog(this, "Solo letras en el campo apellido");
                        limitador++;
                    }
                    if (campoNombre.getText().isEmpty() || campoApellido.getText().isEmpty()
                            || campoDni.getText().isEmpty() || campoDomicilio.getText().isEmpty()
                            || campoTelefono.getText().isEmpty() || campoMail.getText().isEmpty()) {
                        limitador++;
                    }

                    Propietario prop = new Propietario(dni, apellido, nombre, domicilio, telefono, mail, estado);
                    PropietarioData propData = new PropietarioData();

                    if (limitador == 0) { // si es 0 es porq los campos nombre y apellido son validos
                        propData.crearPropietario(prop);
                        limpiarCampos();
                    } else {
                        JOptionPane.showMessageDialog(this, " No deje espacios vacios" + " "
                                + "verifique los campos o datos ingresados");
                    }
                }
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(this, "El campo Cuit y/O DNI debe contener solo numeros");
            }
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void campoDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDniKeyTyped

        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_campoDniKeyTyped

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        limpiarCampos();
        botonModificar.setEnabled(false);
    }//GEN-LAST:event_botonNuevoActionPerformed

    //====== BOTON ELIMINAR ======//
    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        try {
            int dni = Integer.parseInt(campoDni.getText());
            PropietarioData propData = new PropietarioData();
            propData.eliminarPropietario(Integer.parseInt(campoId.getText()));
            checkEstado.setSelected(false);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Para eliminar un Propietario debe primero buscarlo");
        }

    }//GEN-LAST:event_BotonEliminarActionPerformed

    //====== BOTON BUSCAR ======//
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        Propietario prop = new Propietario();
        PropietarioData propData = new PropietarioData();
        if (campoDni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Se requiere dni para buscar");
        } else {
            int dni = Integer.parseInt(campoDni.getText());
            prop = propData.buscarPropietarioPorDni(dni);
            if (prop == null) {
                JOptionPane.showMessageDialog(this, "El propietario no existe para buscarlo");
            } else {
                campoId.setText(Integer.toString(prop.getIdPropietario()));
                campoNombre.setText(prop.getNombre());
                campoApellido.setText(prop.getApellido());
                campoDomicilio.setText(prop.getDomicilio());
                campoTelefono.setText(prop.getTelefono());
                campoMail.setText(prop.getMail());
                checkEstado.setSelected(prop.isEstado());
            }
        }
        if (campoId.getText().isEmpty()) {
            botonModificar.setEnabled(false);
        } else {
            botonModificar.setEnabled(true);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    //====== BOTON MODIFICAR ======//
    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

        PropietarioData propData = new PropietarioData();
        if (campoNombre.getText().isEmpty() || campoApellido.getText().isEmpty()
                || campoDni.getText().isEmpty() || campoDomicilio.getText().isEmpty()
                || campoTelefono.getText().isEmpty() || campoMail.getText().isEmpty()
                || campoDni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se permite modificar con espacios vacios");
        } else {
            int dni = Integer.parseInt(campoDni.getText());
            int id = Integer.parseInt(campoId.getText());
            if (!validarDni(dni) && dni!=propData.buscarPropietarioPorId(id).getDni()) {
                JOptionPane.showMessageDialog(this, "Ya existe un propietario con ese dni");
            } else {
                String nombre = campoNombre.getText();
                String apellido = campoApellido.getText();
                String domicilio = campoDomicilio.getText();
                String telefono = campoTelefono.getText();
                String mail = campoMail.getText();
                boolean estado = checkEstado.isSelected();
                
                Propietario prop = new Propietario(id, dni, apellido, nombre, domicilio, telefono, mail, estado);
                propData.modificarPropietario(prop);
            }
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void campoTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTelefonoKeyTyped

        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key == 8;
        if (!numero) {
            evt.consume();
            aviso++;
            if (aviso == 10) {
                JOptionPane.showMessageDialog(this, "Solo se permiten numeros en este campo");
                aviso = 0;
            }
        }
    }//GEN-LAST:event_campoTelefonoKeyTyped

    private void campoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNombreKeyTyped

        int key = evt.getKeyChar();
        boolean numero = key >= 65 && key <= 90 || key >= 97 && key <= 122 || key == 8 || key == 32;
        if (!numero) {
            evt.consume();
            aviso++;
            if (aviso == 10) {
                JOptionPane.showMessageDialog(this, "Solo se permiten letras en este campo");
                aviso = 0;
            }
        }
    }//GEN-LAST:event_campoNombreKeyTyped

    private void campoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoApellidoKeyTyped

        int key = evt.getKeyChar();
        boolean numero = key >= 65 && key <= 90 || key >= 97 && key <= 122 || key == 8 || key == 32;
        if (!numero) {
            evt.consume();
            aviso++;
            if (aviso == 10) {
                JOptionPane.showMessageDialog(this, "Solo se permiten letras en este campo");
                aviso = 0;
            }
        }
    }//GEN-LAST:event_campoApellidoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoDni;
    private javax.swing.JTextField campoDomicilio;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoMail;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JCheckBox checkEstado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void limpiarCampos() {
        campoDni.setText("");
        campoId.setText("");
        campoNombre.setText("");
        campoApellido.setText("");
        campoDomicilio.setText("");
        campoTelefono.setText("");
        campoMail.setText("");
        checkEstado.setSelected(false);
    }

    private boolean validarDni(int dni) {
        PropietarioData propietarioData = new PropietarioData();
        ArrayList<Propietario> propietarios = propietarioData.listarPropietarios();
        boolean bandera = true;

        for (Propietario propietario : propietarios) {
            if (dni == propietario.getDni()) {
                bandera = false;
                break;
            }
        }
        return bandera;
    }
    
    private class FondoPanel extends JPanel{
    
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/images/fondo4.jpg")).getImage();
            g.drawImage(imagen,0,0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        
        }
    
    }  
}

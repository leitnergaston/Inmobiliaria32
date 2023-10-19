
package vista.propietario;

import accesoADatos.*;
import entidades.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.menuPrincipal.MenuPrincipal;


public class VerPropietarios extends javax.swing.JInternalFrame {
    private final MenuPrincipal menuPrincipal;
    private PropietarioData propietarioData = new PropietarioData();
    private DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int f, int c){
            return false;
        }
    };
    
    
    public VerPropietarios(MenuPrincipal menuPrincipal) {
        initComponents();
        this.menuPrincipal = menuPrincipal;
        cargarTablaInicial();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPropietarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        botonVerDetalles = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        campoDni = new javax.swing.JTextField();
        botonBuscarApellido = new javax.swing.JButton();
        botonBuscarNombre = new javax.swing.JButton();
        botonBuscarDni = new javax.swing.JButton();
        radioBTodos = new javax.swing.JRadioButton();
        radioBActivos = new javax.swing.JRadioButton();
        radioBInactivos = new javax.swing.JRadioButton();
        botonBuscarEstado = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ver Propietarios");

        tablaPropietarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPropietarios);

        jLabel2.setText("Filtrar por . . .");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Dni");

        botonVerDetalles.setText("Ver detalles");

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonBuscarApellido.setText("Buscar por apellido");
        botonBuscarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarApellidoActionPerformed(evt);
            }
        });

        botonBuscarNombre.setText("Buscar por nombre");

        botonBuscarDni.setText("Buscar por dni");

        buttonGroupEstado.add(radioBTodos);
        radioBTodos.setSelected(true);
        radioBTodos.setText("Todos");

        buttonGroupEstado.add(radioBActivos);
        radioBActivos.setText("Activos");

        buttonGroupEstado.add(radioBInactivos);
        radioBInactivos.setText("Inactivos");

        botonBuscarEstado.setText("Buscar por estado");
        botonBuscarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonVerDetalles)
                                .addGap(97, 97, 97)
                                .addComponent(botonSalir)
                                .addGap(61, 61, 61))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(72, 72, 72)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(campoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addComponent(campoNombre)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioBTodos)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(12, 12, 12)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioBActivos)
                                                .addGap(18, 18, 18)
                                                .addComponent(radioBInactivos))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(campoDni))))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonBuscarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonBuscarApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonBuscarNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonBuscarDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBTodos)
                    .addComponent(radioBActivos)
                    .addComponent(radioBInactivos)
                    .addComponent(botonBuscarEstado))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarApellido))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarNombre))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarDni))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVerDetalles)
                    .addComponent(botonSalir))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
        menuPrincipal.mostrarItemsEscritorio();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonBuscarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarApellidoActionPerformed

    private void botonBuscarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarEstadoActionPerformed
        ArrayList<Propietario> propietarios;
        
        if(radioBTodos.isSelected()){
            propietarios = propietarioData.listarPropietarios();
            if(propietarios.isEmpty()){
                JOptionPane.showMessageDialog(this, "Todavía no se ha cargado ningún propietario");
                vaciarTodo();
            }
            else{
                eliminarFilas();
                for(Propietario propietario : propietarios){
                    cargarFila(propietario);
                }
            }
        }else{
            boolean estado = radioBActivos.isSelected();
            propietarios = propietarioData.listarPropietariosActivosONo(estado);
            if(estado==true && propietarios.isEmpty()){
                JOptionPane.showMessageDialog(this, "No existe ningún propietario activo en este momento");
                campoApellido.setText("");
                campoNombre.setText("");
                campoDni.setText("");
                eliminarFilas();
            }
            else if(estado==false && propietarios.isEmpty()){
                JOptionPane.showMessageDialog(this, "No existe ningún propietario inactivo");
                campoApellido.setText("");
                campoNombre.setText("");
                campoDni.setText("");
                eliminarFilas();
            }
            else{
                eliminarFilas();
                for(Propietario propietario : propietarios){
                    cargarFila(propietario);
                }
                campoApellido.setText("");
                campoNombre.setText("");
                campoDni.setText("");
            }
        } 
    }//GEN-LAST:event_botonBuscarEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarApellido;
    private javax.swing.JButton botonBuscarDni;
    private javax.swing.JButton botonBuscarEstado;
    private javax.swing.JButton botonBuscarNombre;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVerDetalles;
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoDni;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioBActivos;
    private javax.swing.JRadioButton radioBInactivos;
    private javax.swing.JRadioButton radioBTodos;
    private javax.swing.JTable tablaPropietarios;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaInicial(){
        modelo.addColumn("Id");
        modelo.addColumn("Dni");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        
        tablaPropietarios.setModel(modelo);
        
        ArrayList<Propietario> propietarios = propietarioData.listarPropietarios();
        for(Propietario propietario : propietarios){
            cargarFila(propietario);
        }
    }
    
    private void cargarFila(Propietario propietario){
        modelo.addRow(new Object[]{
            propietario.getIdPropietario(),
            propietario.getDni(),
            propietario.getNombre(),
            propietario.getApellido()});
        
    }
    
    private void eliminarFilas() {
        int filas = tablaPropietarios.getRowCount() - 1;
        if (filas > -1) {
            for (; filas >= 0; filas--) {
                modelo.removeRow(filas);
            }
        }
    }
    
    private void vaciarTodo(){
        radioBTodos.setSelected(true);
        campoApellido.setText("");
        campoNombre.setText("");
        campoDni.setText("");
        eliminarFilas();
    }
}

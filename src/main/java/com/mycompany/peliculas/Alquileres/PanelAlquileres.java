/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.peliculas.Alquileres;

import com.mycompany.peliculas.Alquileres.PeliculaRentada;
import com.mycompany.peliculas.PanelMain;
import com.mycompany.peliculas.Peliculas.PanelPeliculas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



/**
 *
 * @author Lei
 */
public class PanelAlquileres extends javax.swing.JFrame {

    /**
     * Creates new form PanelAlquileres
     */
    List<Integer> indice = new ArrayList();
    List<PeliculaRentada> lista = new ArrayList();
    private boolean modificar = false;
    boolean secondList = false;
    
    public PanelAlquileres() {
        initComponents();
        llenar();
    }
    private String rentaToString(PeliculaRentada pelicula){
        return pelicula.getId() + ";" + pelicula.getNombre() + ";" + pelicula.getIdCliente() + ";" + pelicula.getFechaPedida();
    }
    
    private PeliculaRentada StringToRenta(String string){
       String[] partes = string.split(";");
       PeliculaRentada pelicula = new PeliculaRentada(Integer.parseInt(partes[0]), partes[1], Integer.parseInt(partes[2]), partes[3]);
       return pelicula;
    }
     private void llenar(){
        /*
        PeliculaRentada peli = new PeliculaRentada(1, "Hachiko", 859, "20/02/21");
        PeliculaRentada peli1 = new PeliculaRentada(1, "Hachiko", 987, "12/01/21");
        PeliculaRentada peli2 = new PeliculaRentada(2, "Matilda", 859, "15/02/21");
        PeliculaRentada peli3 = new PeliculaRentada(2, "Matilda", 987, "10/01/21");
        
        lista.add(peli);
        lista.add(peli1);
        lista.add(peli2);
        lista.add(peli3);
        */
        
        try {
            String buffer;
            BufferedReader reader = new BufferedReader(new FileReader("rentadas.txt"));
            while((buffer = reader.readLine()) != null){
                lista.add(StringToRenta(buffer));
            }
        } catch (IOException ex) {
            Logger.getLogger(PanelPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
        actualizar(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listClientes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        tglId = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        tglNombre = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        tglFecha = new javax.swing.JToggleButton();
        btnMostrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscarPeli = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        listClientes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        listClientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listClientesFocusGained(evt);
            }
        });
        listClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listClientesMouseClicked(evt);
            }
        });
        listClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listClientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listClientes);

        jLabel1.setText("ID:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        tglId.setText("ID");
        tglId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        tglNombre.setText("Nombre");
        tglNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("IDcliente:");

        tglFecha.setText("Fecha rentada");
        tglFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglFechaActionPerformed(evt);
            }
        });

        btnMostrar.setText("Info");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscarPeli.setText("Buscar peli");
        btnBuscarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPeliActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha rentada: ");

        btnBuscarCliente.setText("Buscar cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrar)
                            .addComponent(tglId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tglNombre)
                                .addGap(45, 45, 45)
                                .addComponent(tglFecha))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnBuscarPeli, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCliente)
                            .addComponent(txtNombre)
                            .addComponent(txtID)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglId)
                    .addComponent(tglNombre)
                    .addComponent(tglFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscarPeli)
                    .addComponent(btnMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCliente)
                .addGap(5, 5, 5)
                .addComponent(btnRegresar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        int i = listClientes.getSelectedIndex();
        PeliculaRentada pelicula = new PeliculaRentada();
        pelicula.setNombre(this.txtNombre.getText());
        pelicula.setId(Integer.parseInt(this.txtID.getText()));
        pelicula.setFechaPedida(this.txtFecha.getText());
        pelicula.setIdCliente(Integer.parseInt(txtCliente.getText()));
        if(secondList){
            int j = indice.get(i);
            if(modificar){
                lista.set(j, pelicula);
                modificar = false;
            }else{
                lista.add(pelicula);
            }
           
        }else{
            if(modificar){
                lista.set(i, pelicula);
                modificar = false;
            }else{
                lista.add(pelicula);
            }
        }
        actualizar(null);
        limpiarTexto();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void listClientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listClientesFocusGained
        
        PeliculaRentada pelicula = new PeliculaRentada();
        int i = this.listClientes.getSelectedIndex();
        
        if(this.secondList){     
            int j = this.indice.get(i);
            pelicula = lista.get(j);
        }else{
            pelicula = lista.get(i);
        }
        
        this.txtCliente.setText(Integer.toString(pelicula.getIdCliente()));
        this.txtFecha.setText(pelicula.getFechaPedida());
        this.txtNombre.setText(pelicula.getNombre());
        this.txtID.setText(Integer.toString(pelicula.getId()));

        modificar = true;
        
    }//GEN-LAST:event_listClientesFocusGained

    private void listClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listClientesMouseClicked
        
        PeliculaRentada pelicula = new PeliculaRentada();
        int i = this.listClientes.getSelectedIndex();
        
        if(this.secondList){     
            int j = this.indice.get(i);
            pelicula = lista.get(j);
        }else{
            pelicula = lista.get(i);
        }
        
        this.txtCliente.setText(Integer.toString(pelicula.getIdCliente()));
        this.txtFecha.setText(pelicula.getFechaPedida());
        this.txtNombre.setText(pelicula.getNombre());
        this.txtID.setText(Integer.toString(pelicula.getId()));

        modificar = true;
    }//GEN-LAST:event_listClientesMouseClicked

    private void listClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listClientesValueChanged
        
        PeliculaRentada pelicula = new PeliculaRentada();
        int i = this.listClientes.getSelectedIndex();
        
        if(this.secondList){     
            int j = this.indice.get(i);
            pelicula = lista.get(j);
        }else{
            pelicula = lista.get(i);
        }
        
        this.txtCliente.setText(Integer.toString(pelicula.getIdCliente()));
        this.txtFecha.setText(pelicula.getFechaPedida());
        this.txtNombre.setText(pelicula.getNombre());
        this.txtID.setText(Integer.toString(pelicula.getId()));

        modificar = true;
    }//GEN-LAST:event_listClientesValueChanged

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void tglIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglIdActionPerformed
        int i = 0;
        boolean cambio = true;
        PeliculaRentada cliente = new PeliculaRentada();
        while(i < lista.size()-1 && cambio) {
            cambio = false;
            for (int j = 0; j < lista.size()-1-i; j++) {
                if(lista.get(j).getIdCliente() > lista.get(j+1).getIdCliente()){
                    cliente = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, cliente);
                    cambio = true;
                }

            }
            i++;
        }
                if(secondList){
            actualizar(indice);
        }else{
            actualizar(null);
        }
    }//GEN-LAST:event_tglIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void tglNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglNombreActionPerformed
        int i = 0;
        boolean cambio = true;
        PeliculaRentada cliente = new PeliculaRentada();
        while(i < lista.size()-1 && cambio) {
            cambio = false;
            for (int j = 0; j < lista.size()-1-i; j++) {
                if(lista.get(j).getNombre().compareTo(lista.get(j+1).getNombre()) > 0){
                    cliente = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, cliente);
                    cambio = true;
                }
            }
            i++;
        }
        if(secondList){
            actualizar(indice);
        }else{
            actualizar(null);
        }
    }//GEN-LAST:event_tglNombreActionPerformed

    private void tglFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglFechaActionPerformed
        int i = 0;
        boolean cambio = true;
        PeliculaRentada pelicula = new PeliculaRentada();
        while(i < lista.size()-1 && cambio) {
            cambio = false;
            for (int j = 0; j < lista.size()-1-i; j++) {
                if(lista.get(j).getFechaPedida().equalsIgnoreCase(lista.get(1+j).getFechaPedida())){
                    pelicula = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, pelicula);
                    cambio = true;
                }
            }
            i++;
        }
               if(secondList){
            actualizar(indice);
        }else{
            actualizar(null);
        }
    }//GEN-LAST:event_tglFechaActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        int i = listClientes.getSelectedIndex();
        if(i == -1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione una pelicula");
        }else{
            
           if(secondList){
                i = indice.get(i);
            }
            
            PeliculaRentada pelicula = lista.get(i);
            JOptionPane.showMessageDialog(rootPane, "Nombre : " + pelicula.getNombre() +
                "\nID : " +  pelicula.getId()+
                "\nID Cliente : " + pelicula.getIdCliente() +
                "\nFecha pedida : " + pelicula.getFechaPedida());
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTexto();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int i = listClientes.getSelectedIndex();
        if(secondList){
            int j = indice.get(i);
            lista.remove(j);
            indice.remove(i);
            actualizar(indice);
        }else{
            lista.remove(i);
            actualizar(null);
        }    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPeliActionPerformed
        String nombre = (JOptionPane.showInputDialog(rootPane, "Nombre: "));
        int i = 0;
        this.indice.clear();
        while(i < lista.size()){
            if(nombre.equalsIgnoreCase(lista.get(i).getNombre())){
                indice.add(i);
            }
                i++;
        }
        
        if(this.indice.size() > 0){
            secondList = true;
            actualizar(indice);    
        }else{
            JOptionPane.showMessageDialog(rootPane, "Pelicula no encontrada en alquileres");
        }
        
    }//GEN-LAST:event_btnBuscarPeliActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        actualizarTxt();
        PanelMain volver = new PanelMain();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        int nombre = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "ID: "));
        int i = 0;
        this.indice.clear();
        while(i < lista.size()){
            if(nombre == lista.get(i).getIdCliente()){
                indice.add(i);
            }
                i++;
        }
        
        if(this.indice.size() > 0){
            secondList = true;
            actualizar(indice);       
        }else{
            JOptionPane.showMessageDialog(rootPane, "El cliente no tiene alquileres vigentes.");
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        limpiarTexto();
        secondList = false;
        actualizar(null);
        
        
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    private void actualizar(List<Integer> indiceAct){
        DefaultListModel dato = new DefaultListModel();
        PeliculaRentada pelicula = new PeliculaRentada();
        if(indiceAct == null){
            for (int i = 0; i < lista.size(); i++) {  
                pelicula = lista.get(i);
                dato.addElement(pelicula.toString());
            }
        }else{
            for (int i = 0; i < indiceAct.size(); i++) {                
                pelicula = lista.get(indiceAct.get(i));
                dato.addElement(pelicula.toString());
            }
        }
        this.listClientes.setModel(dato);
        listClientes.clearSelection();
    }
    
    private void limpiarTexto(){
        this.txtNombre.setText(null);
        this.txtCliente.setText(null);
        this.txtFecha.setText(null);
        this.txtID.setText(null);
        
    }
    
    private void actualizarTxt(){       
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("rentadas.txt"));
            for (int i = 0; i < lista.size(); i++) {  
                writer.write(rentaToString(lista.get(i))+ "\n");
            }
                writer.close();
            
        } catch (IOException ex) {
            Logger.getLogger(PanelPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
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
            java.util.logging.Logger.getLogger(PanelAlquileres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAlquileres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAlquileres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAlquileres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAlquileres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarPeli;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JToggleButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listClientes;
    private javax.swing.JToggleButton tglFecha;
    private javax.swing.JToggleButton tglId;
    private javax.swing.JToggleButton tglNombre;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

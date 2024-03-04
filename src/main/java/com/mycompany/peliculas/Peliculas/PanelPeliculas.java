/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.peliculas.Peliculas;

import com.mycompany.peliculas.PanelMain;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
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
public class PanelPeliculas extends javax.swing.JFrame {

    /**
     * Creates new form PanelPeliculas
     */
    private final List<Pelicula> lista = new ArrayList<Pelicula>();
    private boolean modificar = false;
    private String peliToString(Pelicula pelicula){
        return pelicula.getId() + ";" + pelicula.getStock() + ";" + pelicula.getNombre() + ";" 
                + pelicula.getAutor() + ";" + pelicula.getPaisDeOrigen() + ";" + pelicula.getDuracion()
                + ";" + pelicula.getGenero();
    }
    private Pelicula StringToPeli(String string){
       String[] partes = string.split(";");
       Pelicula pelicula = new Pelicula(Integer.parseInt(partes[0]), Integer.parseInt(partes[1]), partes[2], partes[3], partes[4], Integer.parseInt(partes[5]), partes[6]);
       return pelicula;
    }
    private void llenarPeliculas(){
        /*
        Pelicula pelicula  = new Pelicula(001, "Hachiko", 10);
        Pelicula pelicula1 = new Pelicula(002, "Star Wars", 15);
        Pelicula pelicula2 = new Pelicula(003, "Que paso ayer", 05);
        Pelicula pelicula3 = new Pelicula(004, "Lo que el agua se llevo", 05);
        Pelicula pelicula4 = new Pelicula(005, "Indiana Jones", 10);

       
        lista.add(pelicula);
        lista.add(pelicula1);
        lista.add(pelicula2);
        lista.add(pelicula3);
        lista.add(pelicula4);
        */
        try {
            String buffer;
            BufferedReader reader = new BufferedReader(new FileReader("peliculas.txt"));
            while((buffer = reader.readLine()) != null){
                
                lista.add(StringToPeli(buffer));
            }
        } catch (IOException ex) {
            Logger.getLogger(PanelPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
        actualizar();
        
    }
    public PanelPeliculas() {
        initComponents();
        llenarPeliculas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Peliculas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPeliculas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JToggleButton();
        btnMostrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        tglId = new javax.swing.JToggleButton();
        tglNombre = new javax.swing.JToggleButton();
        tglStock = new javax.swing.JToggleButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Peliculas.setText("Peliculas");

        listPeliculas.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        listPeliculas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listPeliculasFocusGained(evt);
            }
        });
        listPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPeliculasMouseClicked(evt);
            }
        });
        listPeliculas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPeliculasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listPeliculas);

        jLabel1.setText("ID:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Autor:");

        jLabel4.setText("Genero:");

        jLabel5.setText("Duracion:");

        jLabel6.setText("Pais de origen:");

        jLabel7.setText("Stock: ");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Info");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tglId.setText("ID");
        tglId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglIdActionPerformed(evt);
            }
        });

        tglNombre.setText("Nombre");
        tglNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglNombreActionPerformed(evt);
            }
        });

        tglStock.setText("Stock");
        tglStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglStockActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tglId)
                                .addGap(18, 18, 18)
                                .addComponent(tglNombre)
                                .addGap(44, 44, 44)
                                .addComponent(tglStock)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Peliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDuracion)
                                        .addComponent(txtOrigen)
                                        .addComponent(txtStock))
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(txtAutor)
                                        .addComponent(txtGenero)))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Peliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tglId)
                            .addComponent(tglNombre)
                            .addComponent(tglStock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrar)
                            .addComponent(btnEliminar)
                            .addComponent(btnBuscar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       int i = listPeliculas.getSelectedIndex();
       
       Pelicula pelicula = new Pelicula();
       if(this.txtAutor.getText().equalsIgnoreCase("")){
           pelicula.autor = ".";
       }else{pelicula.autor = this.txtAutor.getText();}
       if(this.txtID.getText().equalsIgnoreCase("")){
           pelicula.id = 0;
       }else{pelicula.id = Integer.parseInt(this.txtID.getText());}
       if(this.txtGenero.getText().equals("")){
           pelicula.genero = " ";
       }else{pelicula.genero = this.txtGenero.getText();}
       if(this.txtOrigen.getText().equalsIgnoreCase("")){
           pelicula.paisDeOrigen = " ";
       }else{pelicula.paisDeOrigen = this.txtOrigen.getText();}
       if(this.txtDuracion.getText().equalsIgnoreCase("")){
           pelicula.duracion = 0;
       }else{pelicula.duracion = Integer.parseInt(this.txtDuracion.getText());}
       if(this.txtStock.getText().equalsIgnoreCase("")){
           pelicula.stock = 0;
       }else{pelicula.stock = Integer.parseInt(this.txtStock.getText());}
       if(this.txtNombre.getText().equalsIgnoreCase("")){
           pelicula.nombre = ".";
       }else{pelicula.nombre = this.txtNombre.getText();}
       
       
       if(modificar){
           lista.set(i, pelicula);
           modificar = false;
       }else{
           lista.add(pelicula);
       }
       actualizar();
       limpiarTexto();
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        int i = listPeliculas.getSelectedIndex();
        if(i == -1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione una pelicula");
        }else{
        Pelicula pelicula = lista.get(i);
        JOptionPane.showMessageDialog(rootPane, "Nombre : " + pelicula.nombre + 
                                                "\nAutor : " + pelicula.autor + 
                                                "\nGenero : " + pelicula.genero + 
                                                "\nDuracion : " + pelicula.duracion + 
                                                "\nOrigen : " + pelicula.paisDeOrigen);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int i = listPeliculas.getSelectedIndex();
        lista.remove(i);
        actualizar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tglIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglIdActionPerformed
        int i = 0;
        boolean cambio = true;
        Pelicula pelicula = new Pelicula();
        while(i < lista.size()-1 && cambio) {
            cambio = false;
            for (int j = 0; j < lista.size()-1-i; j++) {
                if(lista.get(j).id > lista.get(j+1).id){
                    pelicula = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, pelicula);
                    cambio = true;
                }
                
            }
            i++;
        }
        actualizar();
    }//GEN-LAST:event_tglIdActionPerformed

    private void tglNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglNombreActionPerformed
        int i = 0;
        boolean cambio = true;
        Pelicula pelicula = new Pelicula();
        while(i < lista.size()-1 && cambio) {
            cambio = false;
            for (int j = 0; j < lista.size()-1-i; j++) {
                if(lista.get(j).nombre.compareTo(lista.get(j+1).nombre) > 0){
                    pelicula = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, pelicula);
                    cambio = true;
                }
            }
            i++;
        }
        actualizar();
    }//GEN-LAST:event_tglNombreActionPerformed

    private void tglStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglStockActionPerformed
        int i = 0;
        boolean cambio = true;
        Pelicula pelicula = new Pelicula();
        while(i < lista.size()-1 && cambio) {
            cambio = false;
            for (int j = 0; j < lista.size()-1-i; j++) {
                if(lista.get(j).stock > lista.get(j+1).stock){
                pelicula = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, pelicula);
                    cambio = true;
                }
            }
            i++;
        }
        actualizar();
    }//GEN-LAST:event_tglStockActionPerformed

    private void listPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPeliculasMouseClicked
        int i = this.listPeliculas.getSelectedIndex();
        Pelicula pelicula = lista.get(i);
        this.txtAutor.setText(pelicula.autor);
        this.txtDuracion.setText(Integer.toString(pelicula.duracion));
        this.txtGenero.setText(pelicula.genero);
        this.txtOrigen.setText(pelicula.paisDeOrigen);
        this.txtNombre.setText(pelicula.nombre);
        this.txtID.setText(Integer.toString(pelicula.id));
        this.txtStock.setText(Integer.toString(pelicula.stock));
        modificar = true;
    }//GEN-LAST:event_listPeliculasMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTexto();
        modificar = false;
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String palabra = JOptionPane.showInputDialog(rootPane, "Nombre: ");
        int i = 0;
        boolean found = false;
        while(i < lista.size() && !found){
            if(palabra.equalsIgnoreCase(lista.get(i).nombre)){
                found = true;
            }else{
                i++;
            }
        }
        if(found){
             listPeliculas.setSelectedIndex(i);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Pelicula no encontrada");                 
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void listPeliculasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listPeliculasFocusGained
        int i = this.listPeliculas.getSelectedIndex();
        Pelicula pelicula = lista.get(i);
        this.txtAutor.setText(pelicula.autor);
        this.txtDuracion.setText(Integer.toString(pelicula.duracion));
        this.txtGenero.setText(pelicula.genero);
        this.txtOrigen.setText(pelicula.paisDeOrigen);
        this.txtNombre.setText(pelicula.nombre);
        this.txtID.setText(Integer.toString(pelicula.id));
        this.txtStock.setText(Integer.toString(pelicula.stock));
        modificar = true;
    }//GEN-LAST:event_listPeliculasFocusGained

    private void listPeliculasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPeliculasValueChanged
        int i = this.listPeliculas.getSelectedIndex();
        Pelicula pelicula = lista.get(i);
        this.txtAutor.setText(pelicula.autor);
        this.txtDuracion.setText(Integer.toString(pelicula.duracion));
        this.txtGenero.setText(pelicula.genero);
        this.txtOrigen.setText(pelicula.paisDeOrigen);
        this.txtNombre.setText(pelicula.nombre);
        this.txtID.setText(Integer.toString(pelicula.id));
        this.txtStock.setText(Integer.toString(pelicula.stock));
        modificar = true;
    }//GEN-LAST:event_listPeliculasValueChanged

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        actualizarTxt();
        PanelMain volver = new PanelMain();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    
    private void actualizar(){
        DefaultListModel dato = new DefaultListModel();
        Pelicula pelicula = new Pelicula();
        

        
        for (int i = 0; i < lista.size(); i++) {  
            pelicula = lista.get(i);
            dato.addElement(pelicula.toString());
        }
        
        this.listPeliculas.setModel(dato);
        listPeliculas.clearSelection();
    }
    
    private void limpiarTexto(){
        this.txtAutor.setText(null);
        this.txtOrigen.setText(null);
        this.txtNombre.setText(null);
        this.txtDuracion.setText(null);
        this.txtStock.setText(null);
        this.txtGenero.setText(null);
        this.txtID.setText(null);
        
    }
    private void actualizarTxt(){       
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("peliculas.txt"));
            for (int i = 0; i < lista.size(); i++) {  
                writer.write(peliToString(lista.get(i))+ "\n");
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
            java.util.logging.Logger.getLogger(PanelPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Peliculas;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JToggleButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listPeliculas;
    private javax.swing.JToggleButton tglId;
    private javax.swing.JToggleButton tglNombre;
    private javax.swing.JToggleButton tglStock;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peliculas.Alquileres;

/**
 *
 * @author Lei
 */
public class PeliculaRentada {
    
    private int id;
    private String nombre;
    private int idCliente;
    private String fechaPedida;

    public PeliculaRentada() {
    }
  
    public PeliculaRentada(int id, String nombre, int idCliente, String fechaPedida) {
        this.id = id;
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.fechaPedida = fechaPedida;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getFechaPedida() {
        return fechaPedida;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setFechaPedida(String fechaPedida) {
        this.fechaPedida = fechaPedida;
    }

    
    @Override
    public String toString() {
        return idCliente + "     \t" + nombre + "\t" +fechaPedida + "\n";
    }
    
}

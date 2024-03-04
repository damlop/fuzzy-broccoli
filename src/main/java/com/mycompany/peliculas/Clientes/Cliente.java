/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peliculas.Clientes;

import com.mycompany.peliculas.Alquileres.PeliculaRentada;

/**
 *
 * @author Lei
 */
public class Cliente {
    private int idCliente;
    private String nombreApellido;
    private String direccion;
    private int dni;
    private PeliculaRentada[] alquiladas;
    private PeliculaRentada masReciente;

    public Cliente() {
        this.masReciente = new PeliculaRentada();
        this.masReciente.setNombre("");
    }

    public Cliente(int idCliente, String nombreApellido, String direccion, int dni, PeliculaRentada masReciente) {
        this.idCliente = idCliente;
        this.nombreApellido = nombreApellido;
        this.direccion = direccion;
        this.dni = dni;
        this.masReciente = masReciente;
    }

    
    
    public Cliente(int idCliente, String nombreApellido, String direccion, int dni) {
        this.idCliente = idCliente;
        this.nombreApellido = nombreApellido;
        this.direccion = direccion;
        this.dni = dni;
        this.masReciente = new PeliculaRentada();
        this.masReciente.setNombre("");
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getDni() {
        return dni;
    }

    public PeliculaRentada[] getAlquiladas() {
        return alquiladas;
    }

    public PeliculaRentada getMasReciente() {
        return masReciente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setAlquiladas(PeliculaRentada[] alquiladas) {
        this.alquiladas = alquiladas;
    }

    public void setMasReciente(PeliculaRentada masReciente) {
        this.masReciente = masReciente;
    }
    
    
    
    
    
    
    @Override
    public String toString() {
        return idCliente + "        " + nombreApellido + "       " + dni;
    }
    
    
    
    
    
}

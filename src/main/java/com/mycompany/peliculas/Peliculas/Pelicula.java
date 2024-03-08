/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peliculas.Peliculas;

/**
 *
 * @author Lei
 */
public class Pelicula {
    int id;
    int stock;
    String nombre;
    String autor;
    String paisDeOrigen;
    int duracion;
    String genero;
    
    public Pelicula() {}
    
    public Pelicula(int id, String nombre, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
    }
    
    public Pelicula(int id, int stock, String nombre, String autor, String paisDeOrigen, int duracion, String genero) {
        
        this.id = id;
        this.stock = stock;
        this.nombre = nombre;
        this.autor = autor;
        this.paisDeOrigen = paisDeOrigen;
        this.duracion = duracion;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    

   public int getStock() {
        return stock;
    } 

    public String getAutor() {
        return autor;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }
    public String toString(){
        return id + "     \t" + nombre + "\t" + stock;
    }
    public void restStock(){
        this.stock --;
    }
    public void addStock(){
        this.stock ++;
    }
    
}

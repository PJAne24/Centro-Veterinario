/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Alumno
 */
public class Veterinario {
    private int id;
    private String nombre;
    private String especilidad;

    public Veterinario(int id, String nombre, String especilidad) {
        this.id = id;
        this.nombre = nombre;
        this.especilidad = especilidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecilidad() {
        return especilidad;
    }

    public void setEspecilidad(String especilidad) {
        this.especilidad = especilidad;
    }
}
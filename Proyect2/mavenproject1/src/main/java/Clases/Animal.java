/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class Animal {

    private String id;
    private String tipo;
    private String nombre;
    private String especie;
    private String peso;
    private String tipoLesion;
    private String gravedadLesion;
    private Date fechaEntrada;
    private String veterinario;

    public Animal(String id, String tipo, String nombre, String especie, String peso, String tipoLesion, String gravedadLesion, Date fechaEntrada, String veterinario) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.tipoLesion = tipoLesion;
        this.gravedadLesion = gravedadLesion;
        this.fechaEntrada = fechaEntrada;
        this.veterinario = veterinario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipoLesion() {
        return tipoLesion;
    }

    public void setTipoLesion(String tipoLesion) {
        this.tipoLesion = tipoLesion;
    }

    public String getGravedadLesion() {
        return gravedadLesion;
    }

    public void setGravedadLesion(String gravedadLesion) {
        this.gravedadLesion = gravedadLesion;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alumno
 */
public class Mamífero extends Animal {
    boolean motivoLesionAtropello;

    public Mamífero(boolean motivoLesionAtropello, String id, String tipo, String nombre, String especie, String peso, String tipoLesion, String gravedadLesion, Date fechaEntrada, String veterinario) {
        super(id, tipo, nombre, especie, peso, tipoLesion, gravedadLesion, fechaEntrada, veterinario);
        this.motivoLesionAtropello = motivoLesionAtropello;
    }

    public boolean isMotivoLesionAtropello() {
        return motivoLesionAtropello;
    }

    public void setMotivoLesionAtropello(boolean motivoLesionAtropello) {
        this.motivoLesionAtropello = motivoLesionAtropello;
    }
    @Override
    public String toString()  {
        return "Id = "+ getId() +"\nTipo = "+ getTipo() + "\n Especie = "+ getEspecie() +"\nPeso = "+ getPeso() + "\nTipo Lesion = "+ getTipoLesion() + 
                "\nGravedad Lesion = "+ getGravedadLesion()+ "\nFecha Entrada = " +getFechaEntrada() +"\ny Veterinario = " + getVeterinario() +"\n";
    }
}

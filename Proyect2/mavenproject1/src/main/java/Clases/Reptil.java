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
public class Reptil extends Animal {
    boolean motivoLesionInfeccionBacteriana;

    public Reptil(boolean motivoLesionInfeccionBacteriana, String id, String tipo, String nombre, String especie, String peso, String tipoLesion, String gravedadLesion, Date fechaEntrada, String veterinario) {
        super(id, tipo, nombre, especie, peso, tipoLesion, gravedadLesion, fechaEntrada, veterinario);
        this.motivoLesionInfeccionBacteriana = motivoLesionInfeccionBacteriana;
    }

    public boolean isMotivoLesionInfeccionBacteriana() {
        return motivoLesionInfeccionBacteriana;
    }

    public void setMotivoLesionInfeccionBacteriana(boolean motivoLesionInfeccionBacteriana) {
        this.motivoLesionInfeccionBacteriana = motivoLesionInfeccionBacteriana;
    }
    @Override
    public String toString()  {
        return "Id = "+ getId() +"\nTipo = "+ getTipo() + "\n Especie = "+ getEspecie() +"\nPeso = "+ getPeso() + "\nTipo Lesion = "+ getTipoLesion() + 
                "\nGravedad Lesion = "+ getGravedadLesion()+ "\nFecha Entrada = " +getFechaEntrada() +"\ny Veterinario = " + getVeterinario() +"\n";
    }
}
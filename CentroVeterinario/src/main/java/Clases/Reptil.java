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

    public Reptil(boolean motivoLesionInfeccionBacteriana, String id, String tipo, String nombre, String especie, String peso, String tipoLesion, String gravedadLesion, Date fechaEntrada, String TratamientoInicial, String veterinario) {
        super(id, tipo, nombre, especie, peso, tipoLesion, gravedadLesion, fechaEntrada, TratamientoInicial, veterinario);
        this.motivoLesionInfeccionBacteriana = motivoLesionInfeccionBacteriana;
    }

    public boolean isMotivoLesionInfeccionBacteriana() {
        return motivoLesionInfeccionBacteriana;
    }

    public void setMotivoLesionInfeccionBacteriana(boolean motivoLesionInfeccionBacteriana) {
        this.motivoLesionInfeccionBacteriana = motivoLesionInfeccionBacteriana;
    }
}
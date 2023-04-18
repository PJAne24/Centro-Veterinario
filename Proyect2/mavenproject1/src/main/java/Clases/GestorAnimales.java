/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class GestorAnimales {
    private ArrayList<Animal> listaAnimales;

    public GestorAnimales() {
        listaAnimales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);
    }

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }
}


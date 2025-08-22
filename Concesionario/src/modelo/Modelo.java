/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author alfonso
 */
public class Modelo {

    ArrayList<Coche> coches = new ArrayList<>();

    public void crearCoche(String matricula, String marca, String modelo, int anio, double precioSinIVA) {
        Coche coche = new Coche(modelo, marca, matricula, anio, precioSinIVA);
        coches.add(coche);
    }

    public ArrayList<Coche> leerCoches() {
        return coches;
    }

   
    

}

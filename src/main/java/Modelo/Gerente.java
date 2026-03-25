/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author felip
 */
public class Gerente extends Empleado {
    
    private double bono;
    
    public Gerente(String nombre, double salarioBase, double bono){
            super(nombre,salarioBase);
    }
    
    @Override
    public double calcularPago(){
        return salarioBase + bono;
    }
}

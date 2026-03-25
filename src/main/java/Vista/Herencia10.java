/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author felip
 */
import Controlador.NominaController;
import Modelo.Empleado;
import Modelo.Gerente;


public class Herencia10 {

    public static void main(String[] args) {

        System.out.println("aprendiendo herencia");

        NominaController control = new NominaController();

        // POLIMORFISMO
        control.registrarEmpleados(new Empleado("edwin gallego", 1000));
        control.registrarEmpleados(new Gerente("edwin gallego 2", 5000, 500));

        //  LISTADO DE PAGOS
        System.out.println("== listado de pagos ==");
        for (Empleado emp : control.obtenerLista()) {
            System.out.println("Nombre: " + emp.getNombre());
            System.out.println("Pago: $ " + emp.calcularPago());
            System.out.println("----------------------------------------");
        }

        //SOBRECARGA
        System.out.println("prueba de sobrecarga");

        Empleado busqueda1 = control.buscar("edwin gallego");
        Empleado busqueda2 = control.buscar(1);

        System.out.println("Busqueda por nombre: " +
                (busqueda1 != null ? busqueda1.getNombre() : "no existe"));

        System.out.println("Busqueda por indice: " +
                (busqueda2 != null ? busqueda2.getNombre() : "no existe"));
    }
}

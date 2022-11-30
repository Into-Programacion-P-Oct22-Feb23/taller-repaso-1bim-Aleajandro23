/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller08;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Taller08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int cedula;
        double horas_m;
        double horas_n;
        double valor_m = 10;
        double valor_n = 15;
        String ciudad;
        String mensaje = "";
        int contador = 0;
        boolean bandera = true;
        String opcion;
        int extra = 10;
        double sueldo_m;
        double sueldo_n;
        double sueldo_f = 0;
        double adicional;
        double sueldo_s;
        double seguro_s;
        double seguro_s1 = 18;
        double social;

        while (bandera) {

            
            System.out.println("Ingrese nombre de empleado");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la ciudad de la empresa");
            ciudad = entrada.nextLine();
            System.out.println("Ingrese el numero de cedula");
            cedula = entrada.nextInt();
            System.out.println("Ingrese las horas matutinas");
            horas_m = entrada.nextDouble();
            System.out.println("Ingrese las horas nocturnas");
            horas_n = entrada.nextDouble();

            sueldo_m = horas_m * valor_m;
            sueldo_n = horas_n * valor_n;
            sueldo_s = sueldo_m + sueldo_n;

            if (horas_n >= 10) {
                adicional = (sueldo_m * extra) / 100;
                sueldo_n = sueldo_n + adicional;
                sueldo_f = sueldo_n + sueldo_m;
                seguro_s = (sueldo_f * seguro_s1) / 100;
                social = sueldo_f - seguro_s;
                mensaje = mensaje + "Nomina de trabajadores: \n" + nombre + " "
                        + cedula + "\n" + "Horas matutinas trabajadas: " + horas_m
                        + "Horas nocturnas trabajadas: " + horas_n + "\n"
                        + "Subtotal: " + sueldo_f + "\n" + "Seguro social: "
                        + seguro_s + "Total a cancelar " + social;

                //contador = contador + 1;
            } else {
                mensaje = mensaje + "Horas matutinas trabajadas: " + horas_m
                        + "Horas nocturnas trabajadas: " + horas_n
                        + "Total a cancelar: " + sueldo_f;
            }
            entrada.nextLine();
            System.out.println("Desea salir del proceso? Ingrese s para salir");

            opcion = entrada.nextLine();

            if (opcion.equals("s")) {
                bandera = false;
            }
            System.out.println (mensaje);

        }

    }

}

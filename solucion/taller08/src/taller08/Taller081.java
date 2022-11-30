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
public class Taller081 {

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
        double sueldo_m;
        double sueldo_n;
        double sueldo_f = 0;
        double sueldo_sub;
        double seguro_s;
        double seguro_s1 = 18;

        while (bandera) {
            System.out.println("Ingrese el nombre del empleado");
            nombre = entrada.nextLine();
            System.out.println("Ingrese cedula");
            cedula = entrada.nextInt();
            System.out.println("Ingrese el numero de horas matutinas");
            horas_m = entrada.nextDouble();
            System.out.println("Ingrese el numero de  horas nocturnas");
            horas_n = entrada.nextDouble();
            System.out.println("Ingrese la ciudad de la empresa");
            ciudad = entrada.nextLine();

            sueldo_m = horas_m * valor_m;
            sueldo_n = horas_n * valor_n;

            if (horas_n >= 10) {
                sueldo_n = sueldo_n * 0.10;
            }
            
            sueldo_sub = sueldo_m + sueldo_n;
            seguro_s = (sueldo_sub * seguro_s1) / 100;
            sueldo_f = sueldo_sub - seguro_s;

            contador = contador + 1;

            mensaje = mensaje + "Nomina de Trabajadores\n\n"
                    + "Rol del trabajador de nombre: " + nombre + " y cedula "
                    + cedula + "\nHoras matutina trabajadas: " + horas_m + "\n"
                    + "Horas Nocturnas trabajadas: " + horas_n + "\n"
                    + "Subtotal: " + sueldo_sub + "\nSeguro social: " + seguro_s
                    + "\nTotal a cancelar: " + sueldo_f;

            entrada.nextLine();
            System.out.println("Desea finalizar con el proceso? Digite s,"
                    + " de lo contrario n");
            opcion = entrada.nextLine();

            if (opcion.equals("s")) {
                bandera = false;
            }
        }
        System.out.println(mensaje);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author kevin
 */
public class Display {
    public static boolean ledReloj;
    public static boolean ledAlarma;

    /**
     * Método para mostrar la hora
     */
    public static void mostrarHora() {
        if (Display.ledAlarma == true) {
            System.out.println(Reloj.horaAlarma.getHour() + ": " + Reloj.horaAlarma.getMinute());
        } else {
            System.out.println(Reloj.horaActual.getHour() + ": " + Reloj.horaActual.getMinute());
        }
    }
    
    /**
     * Método para setear los leds
     * @param clock
     * @param alarm
     */
    public static void MostrarLed(boolean clock, boolean alarm) {
        ledReloj = clock;
        ledAlarma = alarm;
    }
}

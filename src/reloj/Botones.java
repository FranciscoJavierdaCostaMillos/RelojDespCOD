/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author Javi
 */
public class Botones {

    static boolean ActivarAlarma;
    static boolean setHr;
    static boolean setAlarma;

    public Botones(boolean showAlarmActive, boolean showSetHr, boolean showSetAlarm) {
        this.ActivarAlarma = showAlarmActive;
        this.setAlarma = showSetAlarm;
        this.setHr = showSetHr;
    }

    public Botones() {

    }

    /**
     * Muestra si la alarma está activada
     */
    public static void alarmaOn() {
        Display.MostrarLed(false, true);
        Reloj.horaAlarma = Reloj.horaAlarma.plusHours(1);
        Reloj.horaAlarma = Reloj.horaAlarma.plusMinutes(1);
        Display.mostrarHora();
    }

    /**
     * Apaga todos los leds del reloj
     */
    public static void alarmaOff() {
        Display.MostrarLed(false, false);
    }

    /**
     * Metodo que suma una hora
     */
    public static void plusHr() {
        Reloj.horaActual = Reloj.horaActual.plusHours(1);
        Display.mostrarHora();
    }

    /**
     * Metodo que suma un minuto
     */
    public static void plusMin() {
        Reloj.horaActual = Reloj.horaActual.plusMinutes(1);
        Display.mostrarHora();
    }

    /**
     * Metodo que resta una hora
     */
    public static void minHr() {
        Reloj.horaActual = Reloj.horaActual.minusHours(1);
        Display.mostrarHora();
    }

    /**
     * Metodo que resta un minuto
     */
    public static void minMin() {
        Reloj.horaActual = Reloj.horaActual.minusMinutes(1);
        Display.mostrarHora();
    }

    /**
     * Método que enciende el led de configuracion de hora
     */
    public static void configurarHora() {
        Display.MostrarLed(true, false);
        Display.mostrarHora();
    }

    /**
     * Método que enciende el led de configuracion de alarma
     */
    public static void configurarAlarma() {
        Display.MostrarLed(false, true);
        Display.mostrarHora();
    }

    /**
     * Método para parar la alarma
     */
    public static void stopAlarma() {
        Reloj.timer.cancel();
    }
}

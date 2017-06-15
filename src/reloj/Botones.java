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
     * Ver Alarma Activada
     */
    public static void alarmaOn() {
        Display.MostrarLed(false, true);
        Reloj.horaAlarma = Reloj.horaAlarma.plusHours(1);
        Reloj.horaAlarma = Reloj.horaAlarma.plusMinutes(1);
        Display.mostrarHora();
    }

    /**
     * Apaga leds
     */
    public static void alarmaOff() {
        Display.MostrarLed(false, false);
    }

    /**
     * Sumar hora
     */
    public static void plusHr() {
        Reloj.horaActual = Reloj.horaActual.plusHours(1);
        Display.mostrarHora();
    }

    /**
     * Suma minutos
     */
    public static void plusMin() {
        Reloj.horaActual = Reloj.horaActual.plusMinutes(1);
        Display.mostrarHora();
    }

    /**
     * Restar hora
     */
    public static void minHr() {
        Reloj.horaActual = Reloj.horaActual.minusHours(1);
        Display.mostrarHora();
    }

    /**
     * Restar minuto
     */
    public static void minMin() {
        Reloj.horaActual = Reloj.horaActual.minusMinutes(1);
        Display.mostrarHora();
    }

    /**
     * Encender led hora
     */
    public static void configurarHora() {
        Display.MostrarLed(true, false);
        Display.mostrarHora();
    }

    /**
     * Encender led de config
     */
    public static void configurarAlarma() {
        Display.MostrarLed(false, true);
        Display.mostrarHora();
    }

    /**
     * Parar la alarma
     */
    public static void stopAlarma() {
        Reloj.timer.cancel();
    }
}

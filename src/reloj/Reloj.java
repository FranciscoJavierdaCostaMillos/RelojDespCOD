/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Reloj {

    static LocalTime horaActual;
    static LocalTime horaAlarma;
    static Timer timer;
    static TimerTask task;

    public static void main(String[] args) {
        horaActual = LocalTime.now();
        horaAlarma = LocalTime.of(12, 15);
        timer = new Timer();

        task = new TimerTask() {
            @Override
            public void run() {
                if (Display.ledAlarma == true) {
                    if (horaAlarma.getMinute() == LocalTime.now().getMinute() && horaAlarma.getHour() == LocalTime.now().getHour()) {
                        Alarma.AlarmaActiva();
                    }
                }
            }
        };

        timer.schedule(task, 10, 10000);
        int opt;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog("Selecciona: "
                    + "\n 1. Configurar hora "
                    + "\n 2. Configurar alarma "
                    + "\n 3. Mostrar hora y minutos "
                    + "\n 4. Parar alarma "
                    + "\n 5. Encender alarma "
                    + "\n 6. Apagar alarma "));
            switch (opt) {
                case 1:
                    Botones.configurarHora();
                    int opthr;
                    do {
                        opthr = Integer.parseInt(JOptionPane.showInputDialog("Selecciona: " + "\n 1. +hr " + "\n 2. +min " + "\n 3. -hr " + "\n 4. -min "+ "\n 5. Terminar "));
                        switch (opthr) {
                            case 1:
                                Botones.plusHr();
                                break;
                            case 2:
                                Botones.plusMin();
                                break;
                            case 3:
                                Botones.minHr();
                                break;
                            case 4:
                                Botones.minMin();
                                break;
                            case 5:
                                opthr = 0;
                                break;
                        }
                    } while (opthr != 0);
                    break;
                case 2:
                    Botones.configurarAlarma();
                    break;
                case 3:
                    Display.mostrarHora();
                    break;
                case 4:
                    Botones.stopAlarma();
                    break;
                case 5:
                    Botones.alarmaOn();
                    break;
                case 6:
                    Botones.alarmaOff();
                    break;
            }

        } while (opt != 0);

        task.cancel();

    }

}

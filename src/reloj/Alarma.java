/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class Alarma {

    static boolean ringOn;

    public Alarma(boolean ringOn) {
        this.ringOn = ringOn;
    }

    /**
     * Activar
     */
    public static void AlarmaActiva() {
         JOptionPane.showMessageDialog(null, "Alarma sonando");
    }
}

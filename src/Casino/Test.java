/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

import BlackJack.GameBlackJack;
import java.util.Scanner;

/**
 *
 * @author ALEX
 */
public class Test {
    public static void main(String[] args) {
        GameBlackJack BJ = new GameBlackJack("ALEX", "TAMALIN", false);
        
        Scanner scan = new Scanner(System.in);
        int Opcion=0;
        boolean Plantarse =false;
        while (Opcion!=20) {
            BJ.repartirNuevo();
            System.out.println("CARTAS JUGADAS: "+BJ.getCartasJugadas());
            System.out.println("CARTAS RESTANTES: "+BJ.getBarajaModificada());
            System.out.println(BJ);
            Opcion++;
        }

    }
}

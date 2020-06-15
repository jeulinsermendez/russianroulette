/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.psp.exruletarussa;

/**
 *
 * @author dmalb
 */
public class Exruletarussa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String nom = "Jugador";
//        pistola pistola=new pistola();
//        boolean viu;
//        for(int i=0;i<5;i++)
//        {
//           viu=pistola.disparar(nom);
//           if(!viu){
//               System.out.println("Resem per l'ànima de "+nom);
//               return;
//           }
//        }
//        System.out.println(nom+" ha sobreviscut a 5 rondes de la ruleta russa");
            pistola pistola = new pistola(5);
            Jugador j1 = new Jugador("1", true, pistola);
            Jugador j2 = new Jugador("2", true, pistola);
            Jugador j3 = new Jugador("3", true, pistola);
            Jugador j4 = new Jugador("4", true, pistola);
            Jugador j5 = new Jugador("5", true, pistola);
            j1.start();
            j2.start();
            j3.start();
            j4.start();
            j5.start();
                    
    }
    
}

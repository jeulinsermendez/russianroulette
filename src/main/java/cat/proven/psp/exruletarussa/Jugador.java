/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.proven.psp.exruletarussa;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mati
 */
public class Jugador extends Thread{
    String nom;
    boolean viu;
    pistola pistola;
    int numJugadores;

    public Jugador(String nom, boolean viu, pistola pistola) {
        this.nom = nom;
        this.viu = viu;
        this.pistola = pistola;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isViu() {
        return viu;
    }

    public void setViu(boolean viu) {
        this.viu = viu;
    }

    public pistola getPistola() {
        return pistola;
    }

    public void setPistola(pistola pistola) {
        this.pistola = pistola;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nom=" + nom + ", viu=" + viu + ", pistola=" + pistola + '}';
    }

    @Override
    public void run() {
        while(pistola.getNumJugador()>1 && viu){
            try {
                Thread.sleep(1000);
                if(pistola.getNumJugador()==1){
                    System.out.println("El jugador "+nom+" ha ganado");
                    return;
                }
                
                if(viu){
                    viu = pistola.disparar(nom);
                    if(!viu){
                        System.out.println("El jugador "+nom+ " ha muerto");
                    }else{
                        System.out.println("El jugador "+nom+ " ha sobrevivido");
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}

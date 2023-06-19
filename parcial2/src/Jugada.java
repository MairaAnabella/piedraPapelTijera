
import java.util.Random;
import javax.swing.Icon;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Jugada {

    private final Random jugadaM = new Random();

    private int contJugador;

    private int contMaquina;
    
    // definimos como contralaremos las jugadas
    // 0 -> PIEDRA
    // 1-> PAPEL
    // 2-> TIJERA
    
    //Metodo que controla el turno de la maquina

    public int jugadaMaquina() {
        return jugadaM.nextInt(3);
    }

    
  // DEFINIMOS LAS JUGADAS DONDE GANA EL USUARIO  

    public String jugadas(int valorJugador, int valorMaquina) {
        //EMPATE 
        if (valorJugador == valorMaquina) {
            return "Empate";
        } else {
            switch (valorMaquina) {
                case 0:
                    if (valorJugador == 1) {
                        return "gana jugador";
                    }
                    break;
                case 1:
                    if (valorJugador == 2) {
                        return "gana jugador";
                    }
                    break;
                case 2:
                    if (valorJugador == 0) {
                        return "gana jugador";
                    }
                    break;
            }

        }
// SI NO GANA EL USUARIO Y NO TENEMOS EMPATE ENTONCES GANA LA MAQUINA
        return "gana la maquina";

    }
// ACUMULAMOS LAS PARTIDAS GANADAS
    public void setContJugador() {
        this.contJugador++;
    }

    public void setContMaquina() {
        this.contMaquina++;
    }
// RETORNAMOS EL VALOR DE LOS CONTADORES 
    public int getContJugador() {
        return contJugador;
    }

    public int getContMaquina() {
        return contMaquina;
    }

}

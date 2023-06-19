
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COCHY
 */
public class PiedraPapelTijera {
    
    
    //creamos unas constante para los turnos de la maquina
    
    private final Random jugadaM=new Random();
    
    
    // variables para saber si gana el jugador o la maquina
    
    private int ganaJugador=0;
    private int ganaMaquina=0;
    
    
    // definimos como contralaremos las jugadas
    // 0 -> PIEDRA
    // 1-> PAPEL
    // 2-> TIJERA
    
    //Metodo que controla el turno de la maquina
    
    public int turnoMaquina(){
        // se pone 2 porque sera un random de 0-1-2
        return jugadaM.nextInt(2);
    }
    
    // definimos las jugadas
    
    
    
    
    public String jugadas(int valorJugador,int valorMaquina){
        //EMPATE 
        if(valorJugador==valorMaquina){
            return "Empate";
        }else{
            switch(valorMaquina){
                case 0:
                    if(valorJugador==1){
                        return "gana jugador";
                    }
                    break;
                case 1:
                    if(valorJugador==2){
                        return "gana jugador";
                    }
                    break;
                case 2:
                    if(valorJugador==0){
                        return "gana jugador";
                    }
                    break;
            }
           
        }
        
        return "gana la maquina";
        
    }
    
    
    //CONTADOR DE VICTORIAS
    
    public void contadorDeVictorias(String valor){
        switch (valor) {
            case "gana el jugador": {
                ganaJugador++;
            }
            break;
            case "gana la maquina": {
                 ganaMaquina++;
            }
            break;
        } 
    }
    
        public int getGanaPlayer() {
        return ganaJugador;
    }

    public int getGanaComputer() {
        return ganaMaquina;
    }
    
}

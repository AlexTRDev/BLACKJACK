
package BlackJack;

import Casino.Baraja;
import Casino.Carta;
import java.util.ArrayList;

/**
 *
 * @author ALEX
 */
public class GameBlackJack {
//JUGADORES
    private String Player1, Player2;
//TIPO DE JUEGO
    private boolean isClasico, isMultijugador, conFiguras;
    
//BARAJA INGLESA
    private Baraja oBaraja;
    private ArrayList<Carta> cartasJugadas, barajaModificada;
    int Tamaño = 0;
//MANOS DE CADA JUGADOR
    private ArrayList<Carta> manoPlayer1, manoPlayer2;

    //CONSTRUCTOR
    public GameBlackJack(String Player1, String Player2, boolean conFiguras) {
        this.Player1 = Player1;
        this.Player2 = Player2;
        this.conFiguras = conFiguras;
        manoPlayer1 = new ArrayList<>(10);
        manoPlayer2 = new ArrayList<>(10);
        modificarBaraja(conFiguras);
        modificarValor();
    }
    //GETTERS AND SETTERS
    public String getPlayer1() {
        return Player1;
    }

    public void setPlayer1(String Player1) {
        this.Player1 = Player1;
    }

    public String getPlayer2() {
        return Player2;
    }

    public void setPlayer2(String Player2) {
        this.Player2 = Player2;
    }

    public boolean isIsClasico() {
        return isClasico;
    }

    public void setIsClasico(boolean isClasico) {
        this.isClasico = isClasico;
    }

    public boolean isIsMultijugador() {
        return isMultijugador;
    }

    public void setIsMultijugador(boolean isMultijugador) {
        this.isMultijugador = isMultijugador;
    }

    public boolean isConFiguras() {
        return conFiguras;
    }

    public void setConFiguras(boolean conFiguras) {
        this.conFiguras = conFiguras;
    }

    public Baraja getoBaraja() {
        return oBaraja;
    }

    public void setoBaraja(Baraja oBaraja) {
        this.oBaraja = oBaraja;
    }

    public ArrayList<Carta> getCartasJugadas() {
        return cartasJugadas;
    }

    public void setCartasJugadas(ArrayList<Carta> cartasJugadas) {
        this.cartasJugadas = cartasJugadas;
    }

    public ArrayList<Carta> getBarajaModificada() {
        return barajaModificada;
    }

    public void setBarajaModificada(ArrayList<Carta> barajaModificada) {
        this.barajaModificada = barajaModificada;
    }

    public ArrayList<Carta> getManoPlayer1() {
        return manoPlayer1;
    }

    public void setManoPlayer1(ArrayList<Carta> manoPlayer1) {
        this.manoPlayer1 = manoPlayer1;
    }

    public ArrayList<Carta> getManoPlayer2() {
        return manoPlayer2;
    }

    public void setManoPlayer2(ArrayList<Carta> manoPlayer2) {
        this.manoPlayer2 = manoPlayer2;
    }

    @Override
    public String toString() {
        return "GameBlackJack{\n" + "Player1=" + Player1 + ", manoPlayer1=" + manoPlayer1 + "\nPlayer2=" + Player2 + ", manoPlayer2=" + manoPlayer2 + "\n}";
    }

    //METODOS Y FUNCIONES
    private void limpiar(){
        cartasJugadas.clear();
        barajaModificada.clear();
        manoPlayer1.clear();
        manoPlayer2.clear();
    }

    private void modificarBaraja(boolean conFiguras){
        if (!conFiguras) {
            oBaraja = new Baraja("INGLESA", false, true);
            barajaModificada = new ArrayList<>(40);
            cartasJugadas = new ArrayList<>(40);
            
            for (int i = 0; i < 3; i++) {
                oBaraja.getListaEspadas().remove(10);
                oBaraja.getListaCorazones().remove(10);
                oBaraja.getListaCocos().remove(10);
                oBaraja.getListaFlores().remove(10);            
            }
            barajaModificada.addAll(oBaraja.getListaEspadas());
            barajaModificada.addAll(oBaraja.getListaCorazones());
            barajaModificada.addAll(oBaraja.getListaCocos());
            barajaModificada.addAll(oBaraja.getListaFlores());
            Tamaño = barajaModificada.size();
        }else{
            oBaraja = new Baraja("INGLESA", false, true);
            barajaModificada = new ArrayList<>(52);
            cartasJugadas = new ArrayList<>(52);
            barajaModificada = oBaraja.getoBaraja();
            Tamaño = barajaModificada.size();
        }
    }
    
    private void modificarValor(){
        for (int i = 0; i < barajaModificada.size(); i++) {
            switch (barajaModificada.get(i).getAbreviatura()) {
                case "A":   barajaModificada.get(i).setValor(11);
                    break;
                case "J":   barajaModificada.get(i).setValor(10);
                    break;
                case "Q":   barajaModificada.get(i).setValor(10);
                    break;
                case "K":   barajaModificada.get(i).setValor(10);
                    break;
                default:
                    break;
            }
        }
    }
    
    private boolean condicionesBJ(String Player, int opcion){
        int cont = 0;
        switch (opcion) {
            case 1: return manoValor(Player)==21;
            case 2: return manoValor(Player)>21;
            case 3: return manoValor(Player)>=17 && manoValor(Player)<21;
            case 4: return manoValor(Player)<17;
            case 5: return manoValor(Player1)>=manoValor(Player2);
            case 6: return manoValor(Player1)<manoValor(Player2);
            case 7: return manoPlayer1.isEmpty();
            case 8: return manoPlayer2.isEmpty();

            case 10:
                cont = manoPlayer1.stream().map((_item) -> 1).reduce(cont, Integer::sum);
                return cont==1;
            case 11:
                cont = manoPlayer1.stream().map((_item) -> 1).reduce(cont, Integer::sum);
                return cont==2;
            case 12:
                cont = manoPlayer1.stream().map((_item) -> 1).reduce(cont, Integer::sum);
                return cont==3;
            case 13:
                cont = manoPlayer1.stream().map((_item) -> 1).reduce(cont, Integer::sum);
                return cont==4;
            case 14: 
                if (condicionesBJ(Player, 2) && condicionesBJ(Player, 9)) {
                    for (int i = 0; i < manoPlayer1.size(); i++) {
                        if (manoPlayer1.get(i).getAbreviatura().equals("A")) {
                            manoPlayer1.get(i).setValor(1);
                        }
                    }
                }
                return manoPlayer2.isEmpty();
            default:
                return false;
        }
    }
    
    public int manoValor(String Player){
        int puntaje = 0, cont=0;
        if (Player.equals(Player1)) {
            for (int i = 0; i < manoPlayer1.size(); i++) {
                puntaje += manoPlayer1.get(i).getValor();
            }
        }else{
            for (int i = 0; i < manoPlayer2.size(); i++) {
                puntaje += manoPlayer2.get(i).getValor();
            }
        }
        return puntaje;
    }
    
    private void cartaNueva(String Player){
        int num;
        if (Player.equals(Player1)) {
            num = (int) Math.round((Math.random()*((Tamaño-1)-cartasJugadas.size())));
            manoPlayer1.add(barajaModificada.get(num));
            cartasJugadas.add(barajaModificada.get(num));
            barajaModificada.remove(num);
        } else {
            num = (int) Math.round((Math.random()*((Tamaño-1)-cartasJugadas.size())));
            manoPlayer2.add(barajaModificada.get(num));
            cartasJugadas.add(barajaModificada.get(num));
            barajaModificada.remove(num);
        }
    }
    
    public void pedirCarta(String Player){
        if (condicionesBJ(Player, 9)){
            cartaNueva(Player);
        } else if (condicionesBJ(Player, 4)) {
            cartaNueva(Player);
        }else if (condicionesBJ(Player, 3)) {
            cartaNueva(Player);
        }
    }
    
    public boolean Plantarse(String Player){
            return condicionesBJ(Player, 3);
    }
    
    public boolean Volar(String Player){
            return condicionesBJ(Player, 2);
    }
    
    public void repartirIni(){
        if (condicionesBJ(Player1, 7) && condicionesBJ(Player2, 8)) {
            pedirCarta(Player1);
            pedirCarta(Player2);
        }else{
            manoPlayer1.clear();
            manoPlayer2.clear();
            pedirCarta(Player1);
            pedirCarta(Player2);
        }
    }
    
    public void repartirNuevo() {
        if (barajaModificada.size()>5) {
            repartirIni();
        }else{
            limpiar();
            System.out.println("NUEVA BARAJA");
            System.out.println("--------------------------------------------------------------------");
            barajaModificada.addAll(oBaraja.getListaEspadas());
            barajaModificada.addAll(oBaraja.getListaCorazones());
            barajaModificada.addAll(oBaraja.getListaCocos());
            barajaModificada.addAll(oBaraja.getListaFlores());
            Tamaño = barajaModificada.size();
            repartirIni();
        }
    }
    
    public void determinarGanador(){
        if (condicionesBJ(Player1, 1)) {
            System.out.println("GANADOR: "+Player1);
        }else if (condicionesBJ(Player2, 1)) {
            System.out.println("GANADOR: "+Player2);            
        }else if (condicionesBJ(Player2, 2)) {
            System.out.println("GANADOR: "+Player1);             
        }else if (condicionesBJ(Player1, 2)) {
            System.out.println("GANADOR: "+Player2);             
        }else if (condicionesBJ(Player1, 5)) {
            System.out.println("GANADOR: "+Player1);             
        }else if (condicionesBJ(Player1, 6)) {
            System.out.println("GANADOR: "+Player2);             
        }
    }
}

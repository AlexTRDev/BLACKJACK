/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALEX
 */
public class Baraja {
    private String tipoBaraja;
    private String colorBaraja;
    private boolean baraja4Colores;
    private List<String> listaColores;
    private boolean barajaComodin;
    
    private Carta oCarta;
    private ArrayList<Carta> oBaraja;
    private ArrayList<Carta> listaEspadas;
    private ArrayList<Carta> listaCorazones;
    private ArrayList<Carta> listaCocos;
    private ArrayList<Carta> listaFlores;

    public Baraja() {
    }

    public Baraja(String tipoBaraja, boolean barajaComodin, boolean baraja4Colores) {
        this.tipoBaraja = tipoBaraja;
        this.baraja4Colores = baraja4Colores;
        this.barajaComodin = barajaComodin;
        crearBaraja(this.tipoBaraja, this.barajaComodin);
    }

    public Baraja(String tipoBaraja, String colorBaraja) {
        this.tipoBaraja = tipoBaraja;
        this.colorBaraja = colorBaraja;
        this.barajaComodin = false;
        this.baraja4Colores = false;
        crearBaraja(this.tipoBaraja, barajaComodin);
    }

    public Baraja(String tipoBaraja, String colorBaraja, ArrayList<Carta> oBaraja) {
        this.tipoBaraja = tipoBaraja;
        this.colorBaraja = colorBaraja;
        this.oBaraja = oBaraja;
    }

    public String getTipoBaraja() {
        return tipoBaraja;
    }

    public void setTipoBaraja(String tipoBaraja) {
        this.tipoBaraja = tipoBaraja;
    }

    public String getColorBaraja() {
        return colorBaraja;
    }

    public void setColorBaraja(String colorBaraja) {
        this.colorBaraja = colorBaraja;
    }

    public Carta getoCarta() {
        return oCarta;
    }

    public void setoCarta(Carta oCarta) {
        this.oCarta = oCarta;
    }

    public ArrayList<Carta> getoBaraja() {
        return oBaraja;
    }

    public void setoBaraja(ArrayList<Carta> oBaraja) {
        this.oBaraja = oBaraja;
    }
    
        public List<String> getListaColores() {
        return listaColores;
    }

    public void setListaColores(List<String> listaColores) {
        this.listaColores = listaColores;
    }

    public ArrayList<Carta> getListaEspadas() {
        return listaEspadas;
    }

    public void setListaEspadas(ArrayList<Carta> listaEspadas) {
        this.listaEspadas = listaEspadas;
    }

    public ArrayList<Carta> getListaCorazones() {
        return listaCorazones;
    }

    public void setListaCorazones(ArrayList<Carta> listaCorazones) {
        this.listaCorazones = listaCorazones;
    }

    public ArrayList<Carta> getListaCocos() {
        return listaCocos;
    }

    public void setListaCocos(ArrayList<Carta> listaCocos) {
        this.listaCocos = listaCocos;
    }

    public ArrayList<Carta> getListaFlores() {
        return listaFlores;
    }

    public void setListaFlores(ArrayList<Carta> listaFlores) {
        this.listaFlores = listaFlores;
    }
    
    private void limpiarListas(){
        listaEspadas.clear();
        listaCorazones.clear();
        listaCocos.clear();
        listaFlores.clear();
        
    }
    
    private void crearBaraja(String tipoBaraja, boolean barajaComodin){
        switch (tipoBaraja) {
            case "ALEMANA":
                listaEspadas = new ArrayList<>(9);
                listaFlores = new ArrayList<>(9);
                listaCorazones = new ArrayList<>(9);
                listaCocos = new ArrayList<>(9);
                if (!barajaComodin) {
                    oBaraja = new ArrayList<>(36);
                    for (int i = 0; i < 4; i++) {
                        switch (i) {
                            case 0:
                                for (int j = 6; j <= 14; j++) {
                                    oCarta = new Carta(null, "CAMPANAS", null, j, null);
                                    listaEspadas.add(oCarta);
                                }   
                                break;
                            case 1:
                                for (int j = 6; j <= 14; j++) {
                                    oCarta = new Carta(null, "HOJAS", null, j, null);
                                    listaFlores.add(oCarta);
                                }
                                break;
                            case 2:
                                for (int j = 6; j <= 14; j++) {
                                    oCarta = new Carta(null, "CORAZONES", null, j, null);
                                    listaCorazones.add(oCarta);
                                }
                                break;
                            default:
                                for (int j = 6; j <= 14; j++) {
                                    oCarta = new Carta(null, "BELLOTAS", null, j, null);
                                    listaCocos.add(oCarta);
                                }
                                break;
                        }
                    }
                    agregarColor();
                    agregarAbreviatura();
                    agregarNombreEImagen();
                    oBaraja.addAll(listaEspadas);
                    oBaraja.addAll(listaFlores);
                    oBaraja.addAll(listaCorazones);
                    oBaraja.addAll(listaCocos);
                }                
                break;
            case "ESPAÑOLA":
                listaEspadas = new ArrayList<>(12);
                listaFlores = new ArrayList<>(12);
                listaCorazones = new ArrayList<>(12);
                listaCocos = new ArrayList<>(12);
                if (barajaComodin) {
                    oBaraja = new ArrayList<>(50);
                    for (int i = 0; i < 4; i++) {
                        switch (i) {
                            case 0:
                                for (int j = 1; j <= 12; j++) {
                                    oCarta = new Carta(null, "ESPADAS", null, j, null);
                                    listaEspadas.add(oCarta);
                                }   
                                break;
                            case 1:
                                for (int j = 1; j <= 12; j++) {
                                    oCarta = new Carta(null, "BASTOS", null, j, null);
                                    listaFlores.add(oCarta);
                                }
                                break;
                            case 2:
                                for (int j = 1; j <= 12; j++) {
                                    oCarta = new Carta(null, "COPAS", null, j, null);
                                    listaCorazones.add(oCarta);
                                }
                                break;
                            default:
                                for (int j = 1; j <= 12; j++) {
                                    oCarta = new Carta(null, "OROS", null, j, null);
                                    listaCocos.add(oCarta);
                                }
                                break;
                        }
                    }
                    agregarColor();
                    agregarAbreviatura();
                    agregarNombreEImagen();
                    oCarta = new Carta("JOKER", "JOKER", "CUALQUIERA", "COLORES", 15, null);
                    oBaraja.add(oCarta);
                    oCarta = new Carta("JOKER", "JOKER","CUALQUIERA", "BLANCO Y NEGRO", 15, null);
                    oBaraja.add(oCarta);
                    oBaraja.addAll(listaEspadas);
                    oBaraja.addAll(listaFlores);
                    oBaraja.addAll(listaCorazones);
                    oBaraja.addAll(listaCocos);
                }else{
                    oBaraja = new ArrayList<>(48);
                    for (int i = 0; i < 4; i++) {
                        switch (i) {
                            case 0:
                                for (int j = 1; j <= 12; j++) {
                                    oCarta = new Carta(null, "ESPADAS", null, j, null);
                                    listaEspadas.add(oCarta);
                                }   
                                break;
                            case 1:
                                for (int j = 1; j <= 12; j++) {
                                    oCarta = new Carta(null, "BASTOS", null, j, null);
                                    listaFlores.add(oCarta);
                                }
                                break;
                            case 2:
                                for (int j = 1; j <= 12; j++) {
                                    oCarta = new Carta(null, "COPAS", null, j, null);
                                    listaCorazones.add(oCarta);
                                }
                                break;
                            default:
                                for (int j = 1; j <= 12; j++) {
                                    oCarta = new Carta(null, "OROS", null, j, null);
                                    listaCocos.add(oCarta);
                                }
                                break;
                        }
                    }
                    agregarColor();
                    agregarAbreviatura();
                    agregarNombreEImagen();
                    oBaraja.addAll(listaEspadas);
                    oBaraja.addAll(listaFlores);
                    oBaraja.addAll(listaCorazones);
                    oBaraja.addAll(listaCocos);
                }
                break;
            case "NAPOLITANA":
                listaEspadas = new ArrayList<>(10);
                listaFlores = new ArrayList<>(10);
                listaCorazones = new ArrayList<>(10);
                listaCocos = new ArrayList<>(10);
                if (!barajaComodin) {
                    oBaraja = new ArrayList<>(40);
                    for (int i = 0; i < 4; i++) {
                        switch (i) {
                            case 0:
                                for (int j = 1; j <= 10; j++) {
                                    oCarta = new Carta(null, "ESPADAS", null, j, null);
                                    listaEspadas.add(oCarta);
                                }   
                                break;
                            case 1:
                                for (int j = 1; j <= 10; j++) {
                                    oCarta = new Carta(null, "BASTOS", null, j, null);
                                    listaFlores.add(oCarta);
                                }
                                break;
                            case 2:
                                for (int j = 1; j <= 10; j++) {
                                    oCarta = new Carta(null, "COPAS", null, j, null);
                                    listaCorazones.add(oCarta);
                                }
                                break;
                            default:
                                for (int j = 1; j <= 10; j++) {
                                    oCarta = new Carta(null, "OROS", null, j, null);
                                    listaCocos.add(oCarta);
                                }
                                break;
                        }
                    }
                    agregarColor();
                    agregarAbreviatura();
                    agregarNombreEImagen();
                    oBaraja.addAll(listaEspadas);
                    oBaraja.addAll(listaFlores);
                    oBaraja.addAll(listaCorazones);
                    oBaraja.addAll(listaCocos);
                }                
                break;
            case "INGLESA":
                listaEspadas = new ArrayList<>(13);
                listaFlores = new ArrayList<>(13);
                listaCorazones = new ArrayList<>(13);
                listaCocos = new ArrayList<>(13);

                if (barajaComodin) {
                    oBaraja = new ArrayList<>(54);
                    for (int i = 0; i < 4; i++) {
                        switch (i) {
                            case 0:
                                for (int j = 1; j <= 13; j++) {
                                    oCarta = new Carta(null, "ESPADAS", null, j, null);
                                    listaEspadas.add(oCarta);
                                }   
                                break;
                            case 1:
                                for (int j = 1; j <= 13; j++) {
                                    oCarta = new Carta(null, "FLORES", null, j, null);
                                    listaFlores.add(oCarta);
                                }
                                break;
                            case 2:
                                for (int j = 1; j <= 13; j++) {
                                    oCarta = new Carta(null, "CORAZONES", null, j, null);
                                    listaCorazones.add(oCarta);
                                }
                                break;
                            default:
                                for (int j = 1; j <= 13; j++) {
                                    oCarta = new Carta(null, "COCOS", null, j, null);
                                    listaCocos.add(oCarta);
                                }
                                break;
                        }
                    }
                    oCarta = new Carta("JOKER", "JOKER", "CUALQUIERA", "COLORES", 15, null);
                    oBaraja.add(oCarta);
                    oCarta = new Carta("JOKER", "JOKER","CUALQUIERA", "BLANCO Y NEGRO", 15, null);
                    oBaraja.add(oCarta);
                    agregarColor();
                    agregarAbreviatura();
                    agregarNombreEImagen();
                    oBaraja.addAll(listaEspadas);
                    oBaraja.addAll(listaFlores);
                    oBaraja.addAll(listaCorazones);
                    oBaraja.addAll(listaCocos);
                }else{
                    oBaraja = new ArrayList<>(52);
                    for (int i = 0; i < 4; i++) {
                        switch (i) {
                            case 0:
                                for (int j = 1; j <= 13; j++) {
                                    oCarta = new Carta(null, "ESPADAS", null, j, null);
                                    listaEspadas.add(oCarta);
                                }   
                                break;
                            case 1:
                                for (int j = 1; j <= 13; j++) {
                                    oCarta = new Carta(null, "FLORES", null, j, null);
                                    listaFlores.add(oCarta);
                                }
                                break;
                            case 2:
                                for (int j = 1; j <= 13; j++) {
                                    oCarta = new Carta(null, "CORAZONES", null, j, null);
                                    listaCorazones.add(oCarta);
                                }
                                break;
                            default:
                                for (int j = 1; j <= 13; j++) {
                                    oCarta = new Carta(null, "COCOS", null, j, null);
                                    listaCocos.add(oCarta);
                                }
                                break;
                        }
                    }
                    agregarColor();
                    agregarAbreviatura();
                    agregarNombreEImagen();
                    oBaraja.addAll(listaEspadas);
                    oBaraja.addAll(listaCorazones);
                    oBaraja.addAll(listaCocos);
                    oBaraja.addAll(listaFlores);
                }
            break;
            case "FRANCESA":
                listaEspadas = new ArrayList<>(13);
                listaFlores = new ArrayList<>(13);
                listaCorazones = new ArrayList<>(13);
                listaCocos = new ArrayList<>(13);

                if (!barajaComodin) {
                    oBaraja = new ArrayList<>(54);
                    for (int i = 0; i < 4; i++) {
                        switch (i) {
                            case 0:
                                for (int j = 1; j <= 13; j++) {
                                    oCarta = new Carta(null, "PICAS", null, j, null);
                                    listaEspadas.add(oCarta);
                                }   
                                break;
                            case 1:
                                for (int j = 1; j <= 13; j++) {
                                    oCarta = new Carta(null, "FLORES", null, j, null);
                                    listaFlores.add(oCarta);
                                }
                                break;
                            case 2:
                                for (int j = 1; j <= 13; j++) {
                                    oCarta = new Carta(null, "CORAZONES", null, j, null);
                                    listaCorazones.add(oCarta);
                                }
                                break;
                            default:
                                for (int j = 1; j <= 13; j++) {
                                    oCarta = new Carta(null, "DIAMANATES", null, j, null);
                                    listaCocos.add(oCarta);
                                }
                                break;
                        }
                    }
                    agregarColor();
                    agregarAbreviatura();
                    agregarNombreEImagen();
                    oBaraja.addAll(listaEspadas);
                    oBaraja.addAll(listaFlores);
                    oBaraja.addAll(listaCorazones);
                    oBaraja.addAll(listaCocos);
                }
                break;
            default:
                break;
        }
    }
    
    private void agregarColor(){
        String Color1 = "NEGRO";
        String Color2 = "ROJO";
        String Color3 = "AZUL";
        String Color4 = "VERDE";
        if (baraja4Colores) {
            for (int i = 0; i < listaEspadas.size(); i++) {
                listaEspadas.get(i).setColor(Color1);
                listaCorazones.get(i).setColor(Color2);
                listaCocos.get(i).setColor(Color3);
                listaFlores.get(i).setColor(Color4);
            }
        }else{
            for (int i = 0; i < listaEspadas.size(); i++) {
                listaEspadas.get(i).setColor(Color1);
                listaCorazones.get(i).setColor(Color2);
                listaCocos.get(i).setColor(Color2);
                listaFlores.get(i).setColor(Color1);
            }
        }
        
    }

    private void agregarAbreviatura(){
        String []abrvAlemana = {"6", "7", "8", "9", "10", "U", "0", "K", "A"};
        String []abrvEspañola = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};
        String []abrvInglesa = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String []abrvNapolitana = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String []abrvFrancesa = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "V", "D", "R"};
        
        switch (tipoBaraja) {
            case "ALEMANA":
                for (int i = 0; i < abrvAlemana.length; i++) {
                    listaEspadas.get(i).setAbreviatura(abrvAlemana[i]);
                    listaCorazones.get(i).setAbreviatura(abrvAlemana[i]);
                    listaCocos.get(i).setAbreviatura(abrvAlemana[i]);
                    listaFlores.get(i).setAbreviatura(abrvAlemana[i]);
                }   break;
            case "ESPAÑOLA":
                for (int i = 0; i < abrvEspañola.length; i++) {
                    listaEspadas.get(i).setAbreviatura(abrvEspañola[i]);
                    listaCorazones.get(i).setAbreviatura(abrvEspañola[i]);
                    listaCocos.get(i).setAbreviatura(abrvEspañola[i]);
                    listaFlores.get(i).setAbreviatura(abrvEspañola[i]);
                }   break;
            case "INGLESA":
                for (int i = 0; i < abrvInglesa.length; i++) {
                    listaEspadas.get(i).setAbreviatura(abrvInglesa[i]);
                    listaCorazones.get(i).setAbreviatura(abrvInglesa[i]);
                    listaCocos.get(i).setAbreviatura(abrvInglesa[i]);
                    listaFlores.get(i).setAbreviatura(abrvInglesa[i]);
                }   break;
            case "NAPOLITANA":
                for (int i = 0; i < abrvNapolitana.length; i++) {
                    listaEspadas.get(i).setAbreviatura(abrvNapolitana[i]);
                    listaCorazones.get(i).setAbreviatura(abrvNapolitana[i]);
                    listaCocos.get(i).setAbreviatura(abrvNapolitana[i]);
                    listaFlores.get(i).setAbreviatura(abrvNapolitana[i]);
                }   break;
            case "FRANCESA":
                for (int i = 0; i < abrvInglesa.length; i++) {
                    listaEspadas.get(i).setAbreviatura(abrvFrancesa[i]);
                    listaCorazones.get(i).setAbreviatura(abrvFrancesa[i]);
                    listaCocos.get(i).setAbreviatura(abrvFrancesa[i]);
                    listaFlores.get(i).setAbreviatura(abrvFrancesa[i]);
                }   break;
            default:
                break;
        }
    }

    private void agregarNombreEImagen(){
        String dos = "DOS", tres = "TRES", cuatro = "CUATRO", cinco = "CINCO", seis = "SEIS", siete = "SIETE";
        String ocho = "OCHO", nueve = "NUEVE", diez = "DIEZ", jota = "JOTA", dama = "DAMA", rey = "REY", ace = "ACE";
    
        for (int i = 0; i < listaEspadas.size(); i++) {
            switch (i) {
                case 0:
                    if (tipoBaraja.equals("ALEMANA")) {
                        ace = "SEIS";
                    }
                    if (tipoBaraja.equals("INGLESA")) {
                        listaEspadas.get(i).setValor(14);
                        listaCorazones.get(i).setValor(14);
                        listaCocos.get(i).setValor(14);
                        listaFlores.get(i).setValor(14);                        
                    }
                    listaEspadas.get(i).setNombre(ace);
                    listaCorazones.get(i).setNombre(ace);
                    listaCocos.get(i).setNombre(ace);
                    listaFlores.get(i).setNombre(ace);
                    break;
                case 1:
                    if (tipoBaraja.equals("ALEMANA")) {
                        dos = "SIETE";
                    }
                    listaEspadas.get(i).setNombre(dos);
                    listaCorazones.get(i).setNombre(dos);
                    listaCocos.get(i).setNombre(dos);
                    listaFlores.get(i).setNombre(dos);
                    break;
                case 2:
                    if (tipoBaraja.equals("ALEMANA")) {
                        tres = "OCHO";
                    }
                    listaEspadas.get(i).setNombre(tres);
                    listaCorazones.get(i).setNombre(tres);
                    listaCocos.get(i).setNombre(tres);
                    listaFlores.get(i).setNombre(tres);
                    break;
                case 3:
                    if (tipoBaraja.equals("ALEMANA")) {
                        cuatro = "NUEVE";
                    }
                    listaEspadas.get(i).setNombre(cuatro);
                    listaCorazones.get(i).setNombre(cuatro);
                    listaCocos.get(i).setNombre(cuatro);
                    listaFlores.get(i).setNombre(cuatro);
                    break;
                case 4:
                    if (tipoBaraja.equals("ALEMANA")) {
                        cinco = "DIEZ";
                    }
                    listaEspadas.get(i).setNombre(cinco);
                    listaCorazones.get(i).setNombre(cinco);
                    listaCocos.get(i).setNombre(cinco);
                    listaFlores.get(i).setNombre(cinco);
                    break;
                case 5:
                    if (tipoBaraja.equals("ALEMANA")) {
                        seis = "CAMPESINO";
                    }
                    listaEspadas.get(i).setNombre(seis);
                    listaCorazones.get(i).setNombre(seis);
                    listaCocos.get(i).setNombre(seis);
                    listaFlores.get(i).setNombre(seis);
                    break;
                case 6:
                    if (tipoBaraja.equals("ALEMANA")) {
                        siete = "DAMA";
                    }
                    listaEspadas.get(i).setNombre(siete);
                    listaCorazones.get(i).setNombre(siete);
                    listaCocos.get(i).setNombre(siete);
                    listaFlores.get(i).setNombre(siete);
                    break;
                case 7:
                    if (tipoBaraja.equals("ALEMANA")) {
                        ocho = "REY";
                    }
                    if (tipoBaraja.equals("NAPOLITANA")) {
                        ocho = "SOTA";
                    }
                    listaEspadas.get(i).setNombre(ocho);
                    listaCorazones.get(i).setNombre(ocho);
                    listaCocos.get(i).setNombre(ocho);
                    listaFlores.get(i).setNombre(ocho);
                    break;
                case 8:
                    if (tipoBaraja.equals("ALEMANA")) {
                        nueve = "ACE";
                    }
                    if (tipoBaraja.equals("NAPOLITANA")) {
                        nueve = "CABALLO";
                    }
                    listaEspadas.get(i).setNombre(nueve);
                    listaCorazones.get(i).setNombre(nueve);
                    listaCocos.get(i).setNombre(nueve);
                    listaFlores.get(i).setNombre(nueve);
                    break;
                case 9:
                    if (tipoBaraja.equals("ESPAÑOLA")) {
                        diez = "SOTA";
                    }
                    if (tipoBaraja.equals("NAPOLITANA")) {
                        diez = "REY";
                    }
                    listaEspadas.get(i).setNombre(diez);
                    listaCorazones.get(i).setNombre(diez);
                    listaCocos.get(i).setNombre(diez);
                    listaFlores.get(i).setNombre(diez);
                    break;
                case 10:
                    if (tipoBaraja.equals("ESPAÑOLA")) {
                        jota = "CABALLO";
                    }
                    if (tipoBaraja.equals("FRANCESA")) {
                        jota = "VALET";
                    }
                    listaEspadas.get(i).setNombre(jota);
                    listaCorazones.get(i).setNombre(jota);
                    listaCocos.get(i).setNombre(jota);
                    listaFlores.get(i).setNombre(jota);
                    break;
                case 11:
                    if (tipoBaraja.equals("ESPAÑOLA")) {
                        dama = "REY";
                    }
                    if (tipoBaraja.equals("FRANCESA")) {
                        dama = "DAME";
                    }
                    listaEspadas.get(i).setNombre(dama);
                    listaCorazones.get(i).setNombre(dama);
                    listaCocos.get(i).setNombre(dama);
                    listaFlores.get(i).setNombre(dama);
                    break;
                case 12:
                    if (tipoBaraja.equals("FRANCESA")) {
                        rey = "ROI";
                    }
                    listaEspadas.get(i).setNombre(rey);
                    listaCorazones.get(i).setNombre(rey);
                    listaCocos.get(i).setNombre(rey);
                    listaFlores.get(i).setNombre(rey);
                    break;
                default:
                    break;
            }
        }
    }

}

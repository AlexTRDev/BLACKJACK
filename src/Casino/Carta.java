/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

import javax.swing.ImageIcon;

/**
 *
 * @author ALEX
 */
public class Carta {
    private String nombre;
    private String abreviatura;
    private String palo;
    private String color;
    private int valor;
    private ImageIcon imagen;

    public Carta() {
    }

    public Carta(String nombre, String palo, String color, int valor, ImageIcon imagen) {
        this.nombre = nombre;
        this.palo = palo;
        this.color = color;
        this.valor = valor;
        this.imagen = imagen;
    }

    public Carta(String nombre, String abreviatura, String palo, String color, int valor, ImageIcon imagen) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.palo = palo;
        this.color = color;
        this.valor = valor;
        this.imagen = imagen;
    }
    
    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + ", abreviatura=" + abreviatura + ", palo=" + palo + ", color=" + color + ", valor=" + valor +'}';
    }
}

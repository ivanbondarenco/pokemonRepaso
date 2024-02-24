/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author eivaa
 */
public class Charmander extends Pokemon implements lFuego {

    public Charmander() {
        
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("SOY CHARMANDER, ATAQUE PLACAJE");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("SOY CHARMANDER, ATAQUE ARAÑAZO");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("SOY CHARMANDER, ATAQUE MORDISCO");
        
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("SOY CHARMANDER, ATAQUE PUNIO FUEGO");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("SOY CHARMANDER, ATAQUE ASCUAS");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("SOY CHARMANDER, ATAQUE LANZA LLAMAS");
    }
    
}

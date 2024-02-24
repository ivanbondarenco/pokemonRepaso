/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author eivaa
 */
public class Squirtle extends Pokemon implements lAgua {

    public Squirtle() {
    }

    @Override
       protected void atacarPlacaje() {
           System.out.println("SOY SQUIRTLE, ATAQUE PLACAJE");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("SOY SQUIRTLE, ATAQUE ARAÑAZO");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("SOY SQUIRTLE, ATAQUE MORDISCO");
    }

    
    @Override
    public void atarcarHidrobomba() {
    System.out.println("SOY SQUIRTLE, ATAQUE HIDROBOMBA");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("SOY SQUIRTLE, ATAQUE PISTOLA AGUA");
        }

     @Override
     public void atacarBurbuja() {
        System.out.println("SOY SQUIRTLE, ATAQUE BURBUJA");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("SOY SQUIRTLE, ATAQUE HIDROPULSO");
    }
    
}

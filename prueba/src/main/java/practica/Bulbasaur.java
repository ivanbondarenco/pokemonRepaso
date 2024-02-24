/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author eivaa
 */
   
public class Bulbasaur extends Pokemon implements lPlanta{

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("SOY BULBASAUR, Ataque placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("SOY BULBASAUR, Ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println(" Soy BULBASAUR, Ataque mordisco");
    }

  
    @Override
    public void atacarParalizar() {
        System.out.println("SOY BULBASAUR , ATAQUE PARALIZAR");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("SOY BULBASAUR, ATAQUE DRENAJE");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("SOY BULBASAUR, ATAQUE HOJA AFILADA");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("SOY BULBASAUR, ATAQUE LATIGO CEPA");
    }

    
    
    
    
    
    
    
}

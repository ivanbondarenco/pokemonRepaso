/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author eivaa
 */
public abstract class Pokemon {
    private int num_pokedex;
    private String nombrePokemon;
    private char sexo;
    private int temporada;
    private String tipo;
   
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarArañazo();
    protected abstract void atacarMordisco();

    
}

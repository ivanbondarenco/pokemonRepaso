/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author eivaa
 */
public class Pikachu extends Pokemon implements lElectrico{

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("SOY PIKACHU, ATAQUE PLACAJE");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("SOY PIKACHU, ATAQUE ARAÑAZO");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("SOY PIKACHU, ATAQUE MORDISCO");
    }


    @Override
    public void atacarImpactrueno() {
            System.out.println("SOY PIKACHU ATAQUE IMPACTRUENO");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("SOY PIKACHU, ATAQUE PUÑO TRUENO");
    }

    @Override
    public void atacarRayo() {
                System.out.println("SOY PIKACHU, ATAQUE RAYO");
    }

    @Override
    public void atacarRayoCarga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author acer
 */
public class Matematika implements IOperasi {

    public int pertambahan(int a, int b) {
        return a+b;
    }

    public int pengurangan(int a, int b) {
        return a-b;
    }

    public int perkalian(int a, int b) {
        return a*b;
    }

    public double pembagian(double a, double b) {
        return a/b;
    }
    
}

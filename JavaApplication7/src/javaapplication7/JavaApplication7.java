/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author 00xxm
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(".l.");
        
        boolean esPrimo(int b) {

        try {
            if (b == 0) {
                throw new IllegalArgumentException("No se puede determinar si 0 es primo o no");
            }

            int divisor = 2;
            int resto;
            boolean primo = true;
            while (divisor <= b / 2 && primo == true) {

                resto = b % divisor;
                if (resto == 0) {
                    primo = false;
                }
                divisor = divisor + 1;
            }
            return primo;
        } catch (IllegalArgumentException ex) {
            System.out.println("Error -> " + ex.getMessage());
            return false;
        }
    }
    }
    
}


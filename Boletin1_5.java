package boletin1_5;

import java.util.*;
public class Boletin1_5 {

    
    public static void main(String[] args) {
        // Pasar de millas a metros
    
    Scanner sc=new Scanner(System.in);
    float millas;
    System.out.println("Dime cuantas millas marinas quieres convertir a metros: ");
    millas=sc.nextInt();
   
    float metros=1852;
    float metrosFinales;
    
    metrosFinales=metros *millas;
    
    System.out.println(+millas+" millas marinas equivalen a: "+metrosFinales+ " metros");
    }
    
}



package boletin1_4;

import java.util.*;

public class Boletin1_4 {

    
    public static void main(String[] args) {
        // Hacer operaciones diversas (+,-,*,/)
        float numero, numero2;
        Scanner lectura= new Scanner (System.in);
        Scanner lectura2= new Scanner (System.in);
       
        System.out.println("Introduce el primer número: ");
        numero=lectura.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        numero2=lectura2.nextInt();
        
        
        float suma;
        float resta;
        float producto;
        float cociente;
                
        suma= numero+numero2;
        resta= numero-numero2;
        producto= numero*numero2;
        cociente= numero/numero2;
    
    
    System.out.println("El resultado de la suma es: " +suma);
    System.out.println("El resultado de la resta es: " +resta);
    System.out.println("El resultado del producto es: " +producto);
    System.out.println("El resultado del cociente es: " +cociente);
    
    }
    
}
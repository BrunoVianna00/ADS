/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class EX01 {
    public static void main(String[] args) {
        int x;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        x = scan.nextInt();
        
        if( x%2 == 1){
            System.out.println("O numero é impar");
            
        }else {
            System.out.println("O numero é par");
        }
    }
    
}

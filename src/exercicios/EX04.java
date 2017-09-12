
package exercicios;

import java.util.Scanner;


public class EX04 {
    public static void main(String[] args) {
        float x, y;
        y = 0;
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        x = scan.nextFloat();
        
        if (x < 1){
            y = x;
        } else if (x == 1){
                
            y = 0;
        }else if (x > 1){
            y = x*2;
        }
            System.out.println("O valor de x é:" + x + " " + "O valor de y é:" + y );
        
    }
    
}
